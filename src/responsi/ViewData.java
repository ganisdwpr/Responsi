/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class ViewData extends JFrame {

    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID Pegawai", "Nama", "Posisi", "Alamat", "No HP", "Gaji Pokok", "Jam Lembur", "Tunjangan", "Pajak", "Total Gaji"};
    
    JButton Admin = new JButton("Admin");
    JButton Home = new JButton("Home");
    JButton Gaji = new JButton("Tambah");
    JButton Data = new JButton("Data");
    JButton Petunjuk = new JButton("Petunjuk");
    
    public void ViewData(){
        setTitle("PT. Veteran Jaya");
        setSize(640, 450);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 
        
        tableModel = new DefaultTableModel (namaKolom,0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
       
        add(Admin);
        add(Home);
        add(Gaji);
        add(Data);
        add(Petunjuk);
        Admin.setBounds(500, 25, 100, 50);
        Home.setBounds(20, 25, 100, 50);
        Gaji.setBounds(20, 95, 100, 50);
        Data.setBounds(20, 165, 100, 50);
        Petunjuk.setBounds(20, 235, 100, 50);
               
        add(scrollPane);
        scrollPane.setBounds(100,85,500,200);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        
                Admin.addActionListener(new ActionListener(){     
        @Override
            public void actionPerformed(ActionEvent e){
                Login_Admin mvcp = new Login_Admin();
                dispose();
            }
        }); 

        Home.addActionListener(new ActionListener(){     
        @Override
            public void actionPerformed(ActionEvent e){
                Menu_Utama mvcp = new Menu_Utama();
                dispose();
            }
        }); 
        
        Gaji.addActionListener(new ActionListener(){     
        @Override
            public void actionPerformed(ActionEvent e){
                MVC_Gaji mvcp = new MVC_Gaji();
                dispose();
            }
        });
        
        Data.addActionListener(new ActionListener(){     
        @Override
            public void actionPerformed(ActionEvent e){
                MVC_Data mvcp = new MVC_Data();
                dispose();
            }
        }); 
        
        Petunjuk.addActionListener(new ActionListener(){     
        @Override
            public void actionPerformed(ActionEvent e){
                Petunjuk mvcp = new Petunjuk();
                dispose();
            }
        }); 
        setVisible(true);
    }
}
