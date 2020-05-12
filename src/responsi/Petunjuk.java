/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author ASUS
 */
public class Petunjuk extends JFrame {
    JLabel Judul = new JLabel("Petunjuk Karyawan");
    JLabel Judul1 = new JLabel("Klik tombol Gaji untuk menghitung gaji Anda.");
    JLabel Judul2 = new JLabel("Klik tombol Data untuk melihat data sudah masuk atau belum.");
    JButton Home = new JButton("Home");
    
    public Petunjuk(){
        setTitle("PT. Veteran Jaya");
        setSize(520, 350);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        add(Judul);
        add(Judul1);
        add(Judul2);
        add(Home);
        
        Judul.setBounds(200, 30, 200, 30);
        Judul1.setBounds(110, 90, 500, 30);
        Judul2.setBounds(110, 160, 500, 30);
        Home.setBounds(200, 250, 100, 20);
        
        Home.addActionListener(new ActionListener(){     
        @Override
            public void actionPerformed(ActionEvent e){
                Menu_Utama mvcp = new Menu_Utama();
                dispose();
            }
        }); 
        setVisible(true);
}
}
