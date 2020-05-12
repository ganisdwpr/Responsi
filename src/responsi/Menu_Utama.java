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

/**
 *
 * @author ASUS
 */
public class Menu_Utama {
        public static void main(String[] args) {
        GUI g = new GUI();
    }     
}
class GUI extends JFrame {
    
    JLabel Judul = new JLabel("Selamat Datang.");
    JLabel Judul1 = new JLabel("Silahkan Masuk ke Menu Gaji untuk melakukan perhitungan gaji.");
    JLabel Judul2 = new JLabel("Jika mengalami kesulitan, klik Menu Petunjuk.");
    JButton Admin = new JButton("Admin");
    JButton Home = new JButton("Home");
    JButton Gaji = new JButton("Gaji");
    JButton Data = new JButton("Data");
    JButton Petunjuk = new JButton("Petunjuk");
    JLabel Judul3 = new JLabel("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");

    public GUI() {
        
        setTitle("PT. Veteran Jaya");
        setSize(640, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 
        
        add(Judul);
        add(Judul1);
        add(Judul2);        
        add(Admin);
        add(Home);
        add(Gaji);
        add(Data);
        add(Petunjuk);
        add(Judul3);
        
        Judul.setBounds(150, 100, 500, 25);
        Judul1.setBounds(150, 130, 500, 25);
        Judul2.setBounds(150, 160, 500, 25);
        Admin.setBounds(500, 25, 100, 50);
        Home.setBounds(20, 25, 100, 50);
        Gaji.setBounds(20, 95, 100, 50);
        Data.setBounds(20, 165, 100, 50);
        Petunjuk.setBounds(20, 235, 100, 50);
        Judul3.setBounds(185, 300, 500,25);
        
        Admin.addActionListener(new ActionListener(){     
        @Override
            public void actionPerformed(ActionEvent e){
                MVC_Admin mvcp = new MVC_Admin();
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

