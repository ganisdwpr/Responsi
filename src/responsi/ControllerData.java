/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author ASUS
 */
class ControllerData {
    ModelData modelData;
    ViewData viewData;
    
    public ControllerData(ModelData modelData, ViewData viewData) {
        this.modelData = modelData;
        this.viewData = viewData;
        if(modelData.getBanyakData() !=0){
           String dataData[][]= modelData.readData();
           viewData.tabel.setModel((new JTable(dataData, viewData.namaKolom)).getModel());
        }else{
            JOptionPane.showMessageDialog(null,"Data Tidak ada");          
        }
        
        viewData.tabel.addMouseListener(new MouseAdapter(){
        
        @Override
        public void mouseClicked(MouseEvent e){
           int baris = viewData.tabel.getSelectedRow();
           int kolom = viewData.tabel.getSelectedColumn();       
        }
    
        });
    }
}

