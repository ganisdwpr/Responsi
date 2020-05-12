/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author ASUS
 */
public class ControllerGaji {
    ModelGaji modelGaji;
    ViewGaji viewGaji;
    
    public ControllerGaji(ModelGaji modelGaji, ViewGaji viewGaji) {
        this.modelGaji = modelGaji;
        this.viewGaji = viewGaji;

        viewGaji.Simpan.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if (viewGaji.getId().equals("")
                        || viewGaji.getNama().equals("")
                        || viewGaji.getPosisi().equals("")
                        || viewGaji.getAlamat().equals("")
                        || viewGaji.getHp().equals("")
                        || viewGaji.getGajiPokok().equals("")
                        || viewGaji.getLembur().equals("")
                        || viewGaji.getTunjangan().equals("")
                        || viewGaji.getPajak().equals("")
                        || viewGaji.getTotalGaji().equals("")){
                    JOptionPane.showMessageDialog(null, "Field tidak boleh kosong");
                       
            }else{
                    String id = viewGaji.getId();
                    String nama = viewGaji.getNama();
                    String posisi = viewGaji.getPosisi();
                    String alamat = viewGaji.getAlamat();
                    String hp = viewGaji.getHp();
                    String gajipokok = viewGaji.getGajiPokok();
                    String lembur = viewGaji.getLembur();
                    String tunjangan = viewGaji.getTunjangan();
                    String pajak = viewGaji.getPajak();
                    String totalgaji = viewGaji.getTotalGaji();                    
                    modelGaji.createData(id, nama, posisi, alamat, hp, gajipokok, lembur, tunjangan, pajak, totalgaji);
            }    
        }
        }); 
                
    }
    
}
