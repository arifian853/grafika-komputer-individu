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
        GradientPaint skyBlue = new GradientPaint (0,200, Color.black, 0, 0, Color.blue);
        java.awt.geom.Rectangle2D.Double sky = new java.awt.geom.Rectangle2D.Double(0,0,800,300);
        g2.draw(sky);
        g2.setPaint(skyBlue);
        g2.fill(sky);

        //Land
        g2.setColor(new Color(38, 39, 56));
        g2.fillRect(0, 300, 800, 100);

        //Moon
        g2.setColor(Color.yellow);
        g2.fillArc(500, 30, 50, 50, 50, 250);
        
        //Building 1
        g2.setColor(new Color(184, 161, 99));
        g2.fillRect(20, 60, 100, 250);
        g2.setColor(Color.white);
        g2.fillRect(40, 80, 20, 20);
        g2.setColor(Color.white);
        g2.fillRect(80, 80, 20, 20);
        g2.setColor(Color.white);
        g2.fillRect(40, 120, 20, 20);
        g2.setColor(Color.white);
        g2.fillRect(80, 120, 20, 20);
        g2.setColor(Color.white);
        g2.fillRect(40, 160, 20, 20);
        g2.setColor(Color.white);
        g2.fillRect(80, 160, 20, 20);

        //Building 2
        g2.setColor(new Color(189, 166, 199));
        g2.fillRect(140, 160, 80, 150);
        g2.setColor(Color.white);
        g2.fillRect(160, 180, 20, 20);
        g2.setColor(Color.white);
        g2.fillRect(160, 220, 20, 20);
        g2.setColor(Color.white);
        g2.fillRect(160, 260, 20, 20);

        //Building 3
        g2.setColor(new Color(125, 39, 32));
        g2.fillRoundRect(200, 160, 90, 160, 10, 20);
    }


public static void main (String[]args) {
    View imgPanel = new View();
    JFrame frame = new JFrame();
    frame.setSize(700,400);
    frame.getContentPane().add(imgPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
}