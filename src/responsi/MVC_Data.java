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
class MVC_Data {
    ViewData viewData = new ViewData();
    ModelData modelData = new ModelData();
    ControllerData controllerData = new ControllerData(modelData, viewData);       
}
