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
public class MVC_Gaji {
    ViewGaji viewGaji = new ViewGaji();
    ModelGaji modelGaji = new ModelGaji();
    ControllerGaji controllerGaji = new ControllerGaji(modelGaji, viewGaji);    
}
