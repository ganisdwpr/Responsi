/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package responsi;

/**
 *
 * @author ASUS
 */
class MVC_TambahData {
    ViewTambahData viewTambahData = new ViewTambahData();
    ModelTambahData modelTambahData = new ModelTambahData();
    ControllerTambahData controllerTambahData = new ControllerTambahData(modelTambahData, viewTambahData);     
}
