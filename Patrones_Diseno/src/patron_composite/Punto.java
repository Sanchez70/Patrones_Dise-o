/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_composite;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author kevin
 */
public class Punto extends baseForma {

    private final int DOT_SIZE = 3;

    public Punto(int x, int y, Color color) {
        super(x, y, color);
    }

   @Override
    public int getWidth() {
        return DOT_SIZE;
    }

    @Override
    public int getHeight() {
        return DOT_SIZE;
    }

    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        graphics.fillRect(x - 1, y - 1, getWidth(), getHeight());
    }

}
