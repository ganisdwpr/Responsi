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
import javax.swing.JTextField;

/**
 *
 * @author ASUS
 */
class ViewTambahData extends JFrame {
    
    JLabel Id = new JLabel("ID Pegawai");
    JTextField id = new JTextField();
    JLabel Nama = new JLabel("Nama");
    JTextField nama = new JTextField();
    JLabel Alamat = new JLabel("Alamat");
    JTextField alamat = new JTextField();
    JLabel Hp = new JLabel("No HP");
    JTextField hp = new JTextField();
    JLabel Posisi = new JLabel("Posisi");
    JTextField posisi = new JTextField();
    JLabel GajiPokok = new JLabel("Gaji Pokok");
    JTextField gajipokok = new JTextField();    
    
    JButton Karyawan = new JButton("Karyawan");
    JButton Home = new JButton("Home");
    JButton Tambah = new JButton("Tambah");
    JButton Data = new JButton("Data");
    JButton Petunjuk = new JButton("Petunjuk");
    JButton Simpan = new JButton("Simpan");
    
    public ViewTambahData(){
        setTitle("PT. Veteran Jaya");
        setSize(640, 360);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        add(Id);        
        add(id);
        add(Nama);
        add(nama);
        add(Alamat);
        add(alamat); 
        add(Hp);
        add(hp);  
        add(Posisi);
        add(posisi);         
        add(GajiPokok);
        add(gajipokok);
        Id.setBounds(140, 30, 200, 25);
        id.setBounds(240, 30, 240, 25);
        Nama.setBounds(140, 60, 200, 25);
        nama.setBounds(240, 60, 240, 25);
        Alamat.setBounds(140, 90, 100, 25);
        alamat.setBounds(240, 90, 240, 25);
        Hp.setBounds(140, 120, 100, 25);
        hp.setBounds(240, 120, 240, 25);
        Posisi.setBounds(140, 150, 100, 25);
        posisi.setBounds(240, 150, 240, 25);
        GajiPokok.setBounds(140, 180, 100, 25);
        gajipokok.setBounds(240, 180, 240, 25);    
        
        
        add(Karyawan);
        add(Home);
        add(Tambah);
        add(Data);
        add(Petunjuk);
        add(Simpan);
        Karyawan.setBounds(500, 25, 100, 50);
        Home.setBounds(20, 25, 100, 50);
        Tambah.setBounds(20, 95, 100, 50);
        Data.setBounds(20, 165, 100, 50);
        Petunjuk.setBounds(20, 235, 100, 50);
        Simpan.setBounds(500, 230, 100, 50);
        
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
    
    public String getId(){
        return id.getText();
    }
    public String getNama(){
        return nama.getText();
    }
    public String getAlamat(){
        return alamat.getText();
    }
    public String getHp(){
        return hp.getText();
    }
    public String getPosisi(){
        return posisi.getText();
    }
    public String getGajiPokok(){
        return gajipokok.getText();
    }    
}
