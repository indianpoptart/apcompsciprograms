package com.apcompsci.Club;


import java.awt.*;
import javax.swing.*;


/**
 * Class Rocket - write a description of the class here
 * 
 * @author (your name) 
 * @version (a version number)
 */


public class Rocket extends JApplet
{
    private final int APPLET_WIDTH = 200;
    private final int APPLET_HEIGHT = 200;
    
    private int[] xRocket = {100, 120, 120, 130, 130, 70, 70, 80, 80};
    private int[] yRocket = {15,40,115,125,150,150,125,115,40};
    
    private int[] xWindow = {95, 105, 110, 90};
    private int[] yWindow = {45, 45, 70, 70};
    
    private int[] xFlame = {70, 70, 75, 80, 90, 100, 110, 115, 120, 130, 130};
    
    private int[] yFlame = {155, 170, 165, 190, 170, 175, 160, 185, 160, 175, 155};

    public void init()
    {
        setBackground (Color.black);
        setSize (APPLET_WIDTH, APPLET_HEIGHT);
    }
    public void paint (Graphics page)
    {
        page.setColor (Color.cyan);
        page.fillPolygon (xRocket, yRocket, xRocket.length);
    
        page.setColor (Color.green);
        page.fillPolygon (xWindow,yWindow,xWindow.length);
    
        page.setColor (Color.red);
        page.drawPolyline (xFlame, yFlame, xFlame.length);
    }
}    
        
              
        