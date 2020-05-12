/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ModelGaji {
    static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dbresponsi";
    static final String USER = "root";
    static final String PASS = "";
   
    Connection koneksi;
    Statement statement;
    
public  ModelGaji(){
    try{
        Class.forName(JDBC_DRIVER);
        koneksi = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
        System.out.println("Koneksi berhasil");
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        System.out.println("Koneksi gagal");
    }
}
public void createData(String id, String nama, String posisi, String alamat, String hp, String gajipokok, String lembur, String tunjangan, String pajak, String totalgaji){
    try{
        String query = "INSERT INTO `tbpegawai`(`ID`, `Nama`, `Posisi`,`Alamat`,`NoHp`, `GajiPokok`,`JamLembur`, `Tunjangan`, `Pajak`, `TotalGaji`)VALUES('"+id+"','"+nama+"','"+posisi+"','"+alamat+"','"+hp+"','"+gajipokok+"', '"+lembur+"', '"+tunjangan+"', '"+pajak+"', '"+totalgaji+"')";
        statement =(Statement) koneksi.createStatement();
        statement.executeUpdate(query);
        System.out.println("Berhasil ditambahkan");
        JOptionPane.showMessageDialog(null, "Data berhasil Ditambahkan");
    }    
     catch (Exception sql){
         System.out.println(sql.getMessage());
         JOptionPane.showMessageDialog(null, sql.getMessage());
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
