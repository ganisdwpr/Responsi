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
public class ViewGaji extends JFrame {
    JLabel Id = new JLabel("ID Pegawai");
    JTextField id = new JTextField();
    JLabel Nama = new JLabel("Nama");
    JTextField nama = new JTextField();
    JLabel Posisi = new JLabel("Posisi");
        String[] namaPosisi = {"Direktur","Manager","Programmer","Marketing", "Surveyor"};
    JComboBox cmbPosisi = new JComboBox(namaPosisi);
    JLabel Alamat = new JLabel("Alamat");
    JTextField alamat = new JTextField();
    JLabel Hp = new JLabel("No HP");
    JTextField hp = new JTextField();
    JLabel GajiPokok = new JLabel("Gaji Pokok");
    JTextField gajipokok = new JTextField();
    JLabel Lembur = new JLabel("Jam Lembur");
    JTextField lembur = new JTextField();
    JLabel Tunjangan = new JLabel("Tunjangan");
    JTextField tunjangan = new JTextField();
    JLabel Pajak = new JLabel("Pajak");
    JTextField pajak = new JTextField();
    JLabel TotalGaji = new JLabel("Total Gaji");
    JTextField totalgaji = new JTextField();
    JButton Admin = new JButton("Admin");
    JButton Home = new JButton("Home");
    JButton Gaji = new JButton("Gaji");
    JButton Data = new JButton("Data");
    JButton Petunjuk = new JButton("Petunjuk");
    JLabel Judul3 = new JLabel("APLIKASI PERHITUNGAN GAJI PT. VETERAN JAYA");
    JButton Hitung = new JButton("Hitung");
    JButton Simpan = new JButton("Simpan");

    public ViewGaji() {
        
        setTitle("PT. Veteran Jaya");
        setSize(640, 450);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true); 
        
        add(Id);        
        add(id);
        add(Nama);
        add(nama); 
        add(Posisi);
        add(cmbPosisi); 
        add(Alamat);
        add(alamat); 
        add(Hp);
        add(hp); 
        add(GajiPokok);
        add(gajipokok); 
        add(Lembur);
        add(lembur); 
        add(Tunjangan);
        add(tunjangan); 
        add(Pajak);
        add(pajak);
        add(TotalGaji);
        add(totalgaji);         
        add(Admin);
        add(Home);
        add(Gaji);
        add(Data);
        add(Petunjuk);
        add(Judul3);
        add(Hitung);
        add(Simpan);
        
        Id.setBounds(140, 30, 200, 25);
        id.setBounds(240, 30, 240, 25);
        Nama.setBounds(140, 60, 200, 25);
        nama.setBounds(240, 60, 240, 25);    
        Posisi.setBounds(140, 90, 100, 25);
        cmbPosisi.setBounds(240, 90, 240, 25);
        Alamat.setBounds(140, 120, 100, 25);
        alamat.setBounds(240, 120, 240, 25);
        Hp.setBounds(140, 150, 100, 25);
        hp.setBounds(240, 150, 240, 25);
        GajiPokok.setBounds(140, 180, 100, 25);
        gajipokok.setBounds(240, 180, 240, 25);
        Lembur.setBounds(140, 210, 100, 25);
        lembur.setBounds(240, 210, 240, 25);
        Tunjangan.setBounds(140, 240, 100, 25);
        tunjangan.setBounds(240, 240, 240, 25);
        Pajak.setBounds(140, 270, 100, 25);
        pajak.setBounds(240, 270, 240, 25);
        TotalGaji.setBounds(140, 300, 100, 25);
        totalgaji.setBounds(240, 300, 240, 25);
        Admin.setBounds(500, 25, 100, 50);
        Home.setBounds(20, 25, 100, 50);
        Gaji.setBounds(20, 95, 100, 50);
        Data.setBounds(20, 165, 100, 50);
        Petunjuk.setBounds(20, 235, 100, 50);
        Judul3.setBounds(185, 350, 500,25);
        Hitung.setBounds(500, 215, 100, 50);
        Simpan.setBounds(500, 275, 100, 50);

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
    
    public String getId(){
        return id.getText();
    }
    public String getNama(){
        return nama.getText();
    }
    public String getPosisi(){
        return (String) cmbPosisi.getSelectedItem();
    }
    public String getAlamat(){
        return alamat.getText();
    }
    public String getHp(){
        return hp.getText();
    }
    public String getGajiPokok(){
        return gajipokok.getText();
    }
    public String getLembur(){
        return lembur.getText();
    }
    public String getTunjangan(){
        return tunjangan.getText();
    }
    public String getPajak(){
        return pajak.getText();
    }
    public String getTotalGaji(){
        return totalgaji.getText();
    }
} 

