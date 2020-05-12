/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
class ViewAdmin extends JFrame {
    
    JLabel Judul = new JLabel("Selamat Datang Admin.");
    JLabel Judul1 = new JLabel("Silahkan Masuk ke Menu Tambah untuk memasukkan Data baru.");
    JLabel Judul2 = new JLabel("Jika mengalami kesulitan, klik Menu Petunjuk.");
    JButton Karyawan = new JButton("Karyawan");
    JButton Home = new JButton("Home");
    JButton Tambah = new JButton("Tambah");
    JButton Data = new JButton("Data");
    JButton Petunjuk = new JButton("Petunjuk");
    JLabel Judul3 = new JLabel("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");
    
    public ViewAdmin(){
        setTitle("PT. Veteran Jaya");
        setSize(640, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 
        
        add(Judul);
        add(Judul1);
        add(Judul2);        
        add(Karyawan);
        add(Home);
        add(Tambah);
        add(Data);
        add(Petunjuk);
        add(Judul3);
        
        Judul.setBounds(150, 100, 500, 25);
        Judul1.setBounds(150, 130, 500, 25);
        Judul2.setBounds(150, 160, 500, 25);
        Karyawan.setBounds(500, 25, 100, 50);
        Home.setBounds(20, 25, 100, 50);
        Tambah.setBounds(20, 95, 100, 50);
        Data.setBounds(20, 165, 100, 50);
        Petunjuk.setBounds(20, 235, 100, 50);
        Judul3.setBounds(185, 300, 500,25);
        
        Karyawan.addActionListener(new ActionListener(){     
        @Override
            public void actionPerformed(ActionEvent e){
                Menu_Utama mvcp = new Menu_Utama();
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
        
        Tambah.addActionListener(new ActionListener(){     
        @Override
            public void actionPerformed(ActionEvent e){
                MVC_TambahData mvcp = new MVC_TambahData();
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
