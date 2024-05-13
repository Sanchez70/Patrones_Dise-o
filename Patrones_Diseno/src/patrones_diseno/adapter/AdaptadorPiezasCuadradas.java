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
public class AdaptadorPiezasCuadradas extends PiezaRedonda{
    private PiezaCuadrada pcuadrada;

    public AdaptadorPiezasCuadradas(PiezaCuadrada pcuadrada) {
        this.pcuadrada = pcuadrada;
    }
    
    @Override
    public double getRadio(){
        double result;
        result = (Math.sqrt(Math.pow((pcuadrada.getAncho()/ 2), 2) * 2));
        return result;
    }
}
