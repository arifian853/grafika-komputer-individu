import java.awt.*;
import javax.swing.*;

public class View extends JFrame {
    View() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 1000);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawLine(100, 100, 300, 300);
    }
}