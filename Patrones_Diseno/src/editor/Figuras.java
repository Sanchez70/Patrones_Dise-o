/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package editor;

import java.awt.*;
import patron_composite.*;

/**
 *
 * @author kevin
 */
public class Figuras {
    public static void main(String[] args) {
        ImagenEditor editor = new ImagenEditor();

        editor.loadShapes(
                new Circulo(10, 10, 10, Color.BLUE),

                new formaCompuesta(
                    new Circulo(110, 110, 50, Color.RED),
                    new Punto(160, 160, Color.RED)
                ),

                new formaCompuesta(
                        new Rectangulo(250, 250, 100, 100, Color.GREEN),
                        new Punto(240, 240, Color.GREEN),
                        new Punto(240, 360, Color.GREEN),
                        new Punto(360, 360, Color.GREEN),
                        new Punto(360, 240, Color.GREEN)
                )
        );
    }
    
}
