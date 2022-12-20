import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Dice extends Canvas {
    public String color1, color2;
    public int val1, val2;
    public String toPrint;

    public void paint(Graphics g) {
        if (color1.equals("RED"))
            g.setColor(Color.RED);
        else
            g.setColor(Color.GREEN);
        g.fillRect(50, 50, 100, 100);
        if (color2.equals("RED"))
            g.setColor(Color.RED);
        else
            g.setColor(Color.GREEN);
        g.fillRect(200, 50, 100, 100);
        if (toPrint != null) {
            g.drawString(toPrint, 200, 200);
        }
        fillDots(g, 50, 50, val1);
        fillDots(g, 200, 50, val2);
    }

    void fillDots(Graphics g, int x, int y, int n) {
        g.setColor(Color.BLACK);
        if (n == 1) {
            g.fillOval(x + 45, y + 45, 10, 10);
        } else if (n == 2) {
            g.fillOval(x + 20, y + 45, 10, 10);
            g.fillOval(x + 70, y + 45, 10, 10);
        } else if (n == 3) {
            g.fillOval(x + 20, y + 45, 10, 10);
            g.fillOval(x + 70, y + 45, 10, 10);
            g.fillOval(x + 45, y + 45, 10, 10);
        } else if (n == 4) {
            g.fillOval(x + 20, y + 65, 10, 10);
            g.fillOval(x + 70, y + 65, 10, 10);
            g.fillOval(x + 20, y + 25, 10, 10);
            g.fillOval(x + 70, y + 25, 10, 10);
        } else if (n == 5) {
            g.fillOval(x + 20, y + 70, 10, 10);
            g.fillOval(x + 70, y + 70, 10, 10);
            g.fillOval(x + 20, y + 20, 10, 10);
            g.fillOval(x + 70, y + 20, 10, 10);
            g.fillOval(x + 45, y + 45, 10, 10);
        } else {
            g.fillOval(x + 20, y + 20, 10, 10);
            g.fillOval(x + 20, y + 45, 10, 10);
            g.fillOval(x + 20, y + 70, 10, 10);
            g.fillOval(x + 70, y + 20, 10, 10);
            g.fillOval(x + 70, y + 45, 10, 10);
            g.fillOval(x + 70, y + 70, 10, 10);
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        JFrame f2 = new JFrame();
        JFrame f3 = new JFrame();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dice 1 color(RED/GREEN): ");
        String c1 = sc.next();
        // String c1 = "GREEN";
        System.out.print("Enter dice 1 value: ");
        int n1 = sc.nextInt();
        // int n1 = 2;
        System.out.print("Enter dice 2 color(RED/GREEN): ");
        String c2 = sc.next();
        // String c2 = "RED";
        System.out.print("Enter dice 2 value: ");
        int n2 = sc.nextInt();
        // int n2 = 1;
        Dice t = new Dice();

        t.color1 = c1;
        t.color2 = c2;
        t.val1 = n1;
        t.val2 = n2;

        JButton btn = new JButton("Perform");
        btn.setBounds(100, 100, 100, 50);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dice t1 = new Dice();
                t1.val1 = 1 + (int) (Math.random() * (5) + 1);
                t1.val2 = 1 + (int) (Math.random() * (5) + 1);
                t1.color1 = "GREEN";
                t1.color2 = "RED";
                t1.toPrint = "Sum of random points = " + String.valueOf(t1.val1 + t1.val2);
                f3.add(t1);
                f3.setVisible(true);
                f.setVisible(false);
            }
        });

        f.add(t);
        f2.add(btn);

        f.setSize(1000, 800);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f3.setSize(1000, 800);
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f2.setLayout(null);
        f2.setSize(300, 300);
        f2.setVisible(true);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
