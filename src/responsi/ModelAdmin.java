/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static responsi.ModelGaji.JDBC_DRIVER;

/**
 *
 * @author ASUS
 */
public class ModelAdmin {
    static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/dbresponsi";
    static final String USER = "root";
    static final String PASS = "";
   
    Connection koneksi;
    Statement statement; 
    
public  ModelAdmin(){
    try{
        Class.forName(JDBC_DRIVER);
        koneksi = (Connection) DriverManager.getConnection(DB_URL,USER,PASS);
        System.out.println("Koneksi berhasil");
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
        System.out.println("Koneksi gagal");
    }
}
}
