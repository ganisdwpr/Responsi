/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
class ControllerTambahData {
    ModelTambahData modelTambahData;
    ViewTambahData viewTambahData;
    
    ControllerTambahData(ModelTambahData modelTambahData, ViewTambahData viewTambahData) {
        this.modelTambahData = modelTambahData;
        this.viewTambahData = viewTambahData;
    
        viewTambahData.Simpan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (viewTambahData.getId().equals("")
                        || viewTambahData.getNama().equals("")
                        || viewTambahData.getAlamat().equals("")
                        || viewTambahData.getHp().equals("")
                        || viewTambahData.getPosisi().equals("")
                        || viewTambahData.getGajiPokok().equals("")){
                    JOptionPane.showMessageDialog(null, "Field tidak boleh kosong");
                }else{
                    String id = viewTambahData.getId();
                    String nama = viewTambahData.getNama();
                    String alamat = viewTambahData.getAlamat();
                    String hp = viewTambahData.getHp();
                    String posisi = viewTambahData.getPosisi();
                    String gajipokok = viewTambahData.getGajiPokok();                    
                    modelTambahData.createData(id, nama, posisi, alamat, hp, gajipokok);
            }    
        }
        }); 
                
    }
    
}

