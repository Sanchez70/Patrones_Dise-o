/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_composite;

import java.awt.*;

/**
 *
 * @author kevin
 */
public interface forma {

    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void selec();
    void unselec();
    boolean isSelected();
    void paint(Graphics graphics);

}
