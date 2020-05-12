/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static responsi.ModelGaji.JDBC_DRIVER;

/**
 *
 * @author ASUS
 */
public class ModelData {
    static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dbresponsi";
    static final String USER = "root";
    static final String PASS = "";
   
    Connection koneksi;
    Statement statement;
    
public  ModelData(){
    try{
        Class.forName(JDBC_DRIVER);
        koneksi = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
        System.out.println("Koneksi berhasil");
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        System.out.println("Koneksi gagal");
    }
}
public String[][] readData(){
    try{
        int jmlData = 0;
        String data[][] = new String[getBanyakData()][10];
        String query = "Select * from `tbpegawai`";
        ResultSet resultSet = statement.executeQuery(query);
        while(resultSet.next()){
            data[jmlData][0] = resultSet.getString("ID");
            data[jmlData][1] = resultSet.getString("Nama");
            data[jmlData][2] = resultSet.getString("Posisi");
            data[jmlData][3] = resultSet.getString("Alamat");
            data[jmlData][4] = resultSet.getString("NoHp");
            data[jmlData][5] = resultSet.getString("GajiPokok");
            data[jmlData][6] = resultSet.getString("JamLembur");
            data[jmlData][7] = resultSet.getString("Tunjangan");
            data[jmlData][8] = resultSet.getString("Pajak");
            data[jmlData][9] = resultSet.getString("TotalGaji");            
            jmlData++;
        }
        return data;
    }
    catch(SQLException e){
        System.out.println(e.getMessage());
        System.out.println("SQL ERROR");
        return null;
    }
}
public int getBanyakData(){
    int jmlData=0;
    try{
        statement = koneksi.createStatement();
        String query ="Select * from `tbpegawai`";
        ResultSet resultSet =statement.executeQuery(query);
        while(resultSet.next()){
            jmlData++;
        }
        return jmlData;
    }
    catch(SQLException e){
        System.out.println(e.getMessage());
        System.out.println("SQL ERROR");
        return 0;
    }
}
}
