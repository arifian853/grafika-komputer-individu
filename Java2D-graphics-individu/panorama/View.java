package panorama;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import javax.swing.JFrame;

public class View extends Panel {
    View() {

    }
    public void paint (Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        //SkyBlue
        GradientPaint skyBlue = new GradientPaint (0,300, Color.blue, 0, 0, Color.black);
        java.awt.geom.Rectangle2D.Double sky = new java.awt.geom.Rectangle2D.Double(0,0,800,300);
        g2.draw(sky);
        g2.setPaint(skyBlue);
        g2.fill(sky);

        //Land
        g2.setColor(new Color(0, 128, 0));
        g2.fillRect(0, 200, 800, 200);

        //Moon
        g2.setColor(Color.yellow);
        g2.fillOval(500, 30, 50, 50);
        
        
    }


public static void main (String[]args) {
    View imgPanel = new View();
    JFrame fr = new JFrame();
    fr.setSize(700,400);
    fr.getContentPane().add(imgPanel);
    fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fr.setVisible(true);
}
}