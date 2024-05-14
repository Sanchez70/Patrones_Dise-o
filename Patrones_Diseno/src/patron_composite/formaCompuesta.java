/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patron_composite;

import java.awt.*;
import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author kevin
 */
public class formaCompuesta extends baseForma{
    
    protected  ArrayList<forma> hijos = new ArrayList<>();

    public formaCompuesta(forma... components) {
        super(0, 0, Color.BLACK);
        add(components);
    }

    public void add(forma component) {
        hijos.add(component);
    }

    public void add(forma... components) {
        hijos.addAll(Arrays.asList(components));
    }

    public void remove(forma hijo) {
        hijos.remove(hijo);
    }

    public void remove(forma... componentes) {
        hijos.removeAll(Arrays.asList(componentes));
    }

    public void clear() {
        hijos.clear();
    }

    @Override
    public int getX() {
        if (hijos.size() == 0) {
            return 0;
        }
        int x = hijos.get(0).getX();
        for (forma hijo : hijos) {
            if (hijo.getX() < x) {
                x = hijo.getX();
            }
        }
        return x;
    }

    @Override
    public int getY() {
        if (hijos.size() == 0) {
            return 0;
        }
        int y = hijos.get(0).getY();
        for (forma child : hijos) {
            if (child.getY() < y) {
                y = child.getY();
            }
        }
        return y;
    }

    @Override
    public int getWidth() {
        int maxWidth = 0;
        int x = getX();
        for (forma child : hijos) {
            int childsRelativeX = child.getX() - x;
            int childWidth = childsRelativeX + child.getWidth();
            if (childWidth > maxWidth) {
                maxWidth = childWidth;
            }
        }
        return maxWidth;
    }

    @Override
    public int getHeight() {
        int maxHeight = 0;
        int y = getY();
        for (forma child : hijos) {
            int childsRelativeY = child.getY() - y;
            int childHeight = childsRelativeY + child.getHeight();
            if (childHeight > maxHeight) {
                maxHeight = childHeight;
            }
        }
        return maxHeight;
    }

    @Override
    public void move(int x, int y) {
        for (forma child : hijos) {
            child.move(x, y);
        }
    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        for (forma child : hijos) {
            if (child.isInsideBounds(x, y)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void unselec() {
        super.unselec();
        for (forma child : hijos) {
            child.unselec();
        }
    }

    public boolean selectChildAt(int x, int y) {
        for (forma child : hijos) {
            if (child.isInsideBounds(x, y)) {
                child.selec();
                return true;
            }
        }
        return false;
    }

    @Override
    public void paint(Graphics graphics) {
        if (isSelected()) {
            enableSelectionStyle(graphics);
            graphics.drawRect(getX() - 1, getY() - 1, getWidth() + 1, getHeight() + 1);
            disableSelectionStyle(graphics);
        }

        for (forma child : hijos) {
            child.paint(graphics);
        }
    }
}
