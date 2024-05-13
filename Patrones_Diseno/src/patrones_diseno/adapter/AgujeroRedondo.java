/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_diseno.adapter;

/**
 *
 * @author jeans
 */
public class AgujeroRedondo {
    private double radio;
    

    public AgujeroRedondo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }
    
    public boolean encajar(PiezaRedonda predondo){
        boolean result;
        result = (this.getRadio()>=predondo.getRadio());
        return result;
    }
}
