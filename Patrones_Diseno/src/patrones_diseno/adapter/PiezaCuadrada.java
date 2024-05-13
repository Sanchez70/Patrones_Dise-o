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
public class PiezaCuadrada {
    private double ancho;

    public PiezaCuadrada(double ancho) {
        this.ancho = ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public double obtenerPieza(){
        double result;
        result = Math.pow(this.ancho, 2);
        return result;
    }
    
    
}
