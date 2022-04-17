package panorama;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import javax.swing.JFrame;
import java.awt.Polygon;

public class View extends Panel {
    View() {

    }
    public void paint (Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        //SkyBlue
        GradientPaint skyBlue = new GradientPaint (0,400, Color.blue, 0, 0, Color.black);
        java.awt.geom.Rectangle2D.Double sky = new java.awt.geom.Rectangle2D.Double(0,0,1200,600);
        g2.draw(sky);
        g2.setPaint(skyBlue);
        g2.fill(sky);

        //Land
        g2.setColor(new Color(38, 39, 56));
        g2.fillRect(0, 500, 1200, 100);

        //Moon
        g2.setColor(Color.yellow);
        g2.fillArc(850, 30, 70, 70, 50, 250);

        //Stars
        g2.setColor(Color.white);
        g2.fillOval(200, 30, 5, 5);
        g2.fillOval(260, 46, 5, 5);
        g2.fillOval(120, 19, 5, 5);
        g2.fillOval(209, 40, 5, 5);
        g2.fillOval(201, 32, 5, 5);
        g2.fillOval(180, 43, 5, 5);
        g2.fillOval(280, 30, 5, 5);
        g2.fillOval(230, 43, 5, 5);
        g2.fillOval(80, 30, 5, 5);
        g2.fillOval(450, 32, 5, 5);
        g2.fillOval(400, 33, 5, 5);
        g2.fillOval(50, 30, 5, 5);
        g2.fillOval(67, 67, 5, 5);
        g2.fillOval(34, 55, 5, 5);
        g2.fillOval(540, 30, 5, 5);
        g2.fillOval(950, 65, 5, 5);
        g2.fillOval(967, 67, 5, 5);
        g2.fillOval(924, 55, 5, 5);
        g2.fillOval(1000, 30, 5, 5);
        g2.fillOval(924, 55, 5, 5);
        g2.fillOval(1000, 30, 5, 5);

        //Mountain
        g2.setColor(new Color(25,35,70));
        Polygon p = new Polygon ();
        int xPoly[]= {200, 450, 0};
        int yPoly[]= {300, 500, 500};
        g2.fillPolygon(xPoly, yPoly, xPoly.length);
   
        g2.setColor(new Color(25,30,45));
        int xPoly2[]= {550, 250, 1200};
        int yPoly2[]= {300, 500, 500};
        g2.fillPolygon(xPoly2, yPoly2, xPoly2.length);

        //Clouds
        g2.setColor(Color.gray);
        g2.fillOval(700, 30, 40, 40);
        g2.fillOval(725, 45, 40, 40);
        g2.fillOval(725, 20, 40, 40);
        g2.fillOval(745, 30, 40, 40);
        g2.setColor(Color.gray);
        g2.fillOval(500, 30, 40, 40);
        g2.fillOval(525, 45, 40, 40);
        g2.fillOval(525, 20, 40, 40);
        g2.fillOval(545, 30, 40, 40);

        //Building 1
        g2.setColor(new Color(184, 161, 99));
        g2.fillRect(20, 270, 100, 250);
        g2.setColor(Color.white);
        g2.fillRect(40, 300, 20, 20);
        g2.fillRect(80, 300, 20, 20);
        g2.fillRect(40, 340, 20, 20);
        g2.fillRect(80, 340, 20, 20);
        g2.fillRect(40, 380, 20, 20);
        g2.fillRect(80, 380, 20, 20);

        g2.setColor(Color.white);
        g2.drawArc(120, 194, 263, 171, 180, 90);

        //Building 2
        g2.setColor(new Color(189, 166, 199));
        g2.fillRect(140, 370, 80, 150);
        g2.setColor(Color.white);
        g2.fillRect(160, 390, 20, 20);
        g2.fillRect(160, 430, 20, 20);
        g2.fillRect(160, 470, 20, 20);

        //Building 3
        g2.setColor(new Color(125, 39, 32));
        g2.fillRoundRect(250, 365, 90, 160, 5, 10);
        g2.setColor(Color.white);
        g2.fillRect(265, 430, 20, 20);
        g2.fillRect(305, 430, 20, 20);
        g2.fillRect(265, 470, 20, 20);
        g2.fillRect(305, 470, 20, 20);
        
    }


public static void main (String[]args) {
    View imgPanel = new View();
    JFrame frame = new JFrame();
    frame.setSize(1200,600);
    frame.getContentPane().add(imgPanel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
}