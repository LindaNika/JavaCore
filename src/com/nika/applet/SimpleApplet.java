package com.nika.applet;

import java.applet.Applet;
import java.awt.*;

public class SimpleApplet extends Applet {

    public static int i = 0;

    public void paint(Graphics g){
        i++;
        g.drawString("Applet" + i, 20, 20);
    }
}
