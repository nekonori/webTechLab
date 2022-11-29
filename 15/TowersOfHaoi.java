import java.awt.*;
import javax.swing.*;

public class TowersOfHaoi extends Canvas {
    public void paint(Graphics g) {
        // horizontal line
        g.drawLine(100, 300, 500, 300);

        // three vertical lines
        g.drawLine(200, 300, 200, 150);
        g.drawLine(300, 300, 300, 150);
        g.drawLine(400, 300, 400, 150);

        // discs in rod 1
        g.setColor(Color.blue);
        g.fillOval(155, 280, 90, 20);
        g.setColor(Color.cyan);
        g.fillOval(165, 261, 70, 20);
        g.setColor(Color.yellow);
        g.fillOval(175, 241, 50, 20);
        g.setColor(Color.green);
        g.fillOval(185, 221, 30, 20);

        // discs in rod 3
        g.setColor(Color.orange);
        g.fillOval(387, 281, 25, 20);
        g.setColor(Color.red);
        g.fillOval(392, 262, 15, 20);

        // labels
        g.setColor(Color.gray);
        g.drawString("Start", 193, 335);
        g.drawString("Spare", 285, 335);
        g.drawString("Destination", 370, 335);
    }

    public static void main(String[] args) {
        TowersOfHaoi t = new TowersOfHaoi();
        JFrame f = new JFrame();
        f.add(t);
        f.setSize(600, 600);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
