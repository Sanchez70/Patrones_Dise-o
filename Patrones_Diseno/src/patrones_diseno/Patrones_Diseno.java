/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones_diseno;

import patrones_diseno.adapter.AdaptadorPiezasCuadradas;
import patrones_diseno.adapter.AgujeroRedondo;
import patrones_diseno.adapter.PiezaCuadrada;
import patrones_diseno.adapter.PiezaRedonda;

/**
 *
 * @author kevin
 */
public class Patrones_Diseno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Patrones_Diseno p = new Patrones_Diseno();
        p.ejecutarAdapter();        
    }
    
    public void ejecutarAdapter(){
        AgujeroRedondo agujero = new AgujeroRedondo(5);
        PiezaRedonda piezaRed = new PiezaRedonda(5);
        
        if(agujero.encajar(piezaRed)){
            System.out.println("PIEZA REDONDA ENCAJA PERFECTAMENTE");
        }
        
        PiezaCuadrada piezaCuad1 = new PiezaCuadrada(2);
        PiezaCuadrada piezaCuad2 = new PiezaCuadrada(20);
        
        
        AdaptadorPiezasCuadradas adaptador = new AdaptadorPiezasCuadradas(piezaCuad1);
        AdaptadorPiezasCuadradas adaptador2 = new AdaptadorPiezasCuadradas(piezaCuad2);
        
        if(agujero.encajar(adaptador)){
            System.out.println("PIEZA CUADRADA ENCAJA PERFECTAMENTE");
        }
        
        if(!agujero.encajar(adaptador2)){
            System.out.println("PIEZA NO ENCAJA CORRECTAMENTE");
        }
    }
    
}
