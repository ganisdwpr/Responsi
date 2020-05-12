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
public class ControllerAdmin {
    ModelAdmin modelAdmin;
    ViewAdmin viewAdmin;
    
    ControllerAdmin(ModelAdmin modelAdmin, ViewAdmin viewAdmin) {
        this.modelAdmin = modelAdmin;
        this.viewAdmin = viewAdmin;
        
    }
    
}
