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
        GradientPaint skyBlue = new GradientPaint (0,200, Color.blue, 0, 0, Color.red);
        java.awt.geom.Rectangle2D.Double sky = new java.awt.geom.Rectangle2D.Double(0,0,800,300);
        g2.draw(sky);
        g2.setPaint(skyBlue);
        g2.fill(sky);
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