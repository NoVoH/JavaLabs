import javax.swing.*;
import java.awt.*;
import java.util.Collections;

import static java.util.Arrays.*;

public class lab3_1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Lab 3_1");
        jFrame.add(new Component());
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(100, 100, 1000, 600);
        jFrame.setResizable(false);
    }

    static class Component extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D graphics = (Graphics2D)g;
            Font font = new Font("Times New Roman", Font.BOLD, 14);
            int[] square_x = {300, 450, 700, 700, 550, 300};
            int[] square_y = {100, 50, 100, 500, 550, 500};
            g.setColor(Color.RED);
            g.fillPolygon(square_x, square_y, 6);
            int[] pentahedron_x = {500, 650, 550, 450, 350};
            int[] pentahedron_y = {150, 200, 400, 400, 200};
            g.setColor(Color.GREEN);
            g.fillPolygon(pentahedron_x, pentahedron_y, 5);
            int[] rpentahedron_x = {425, 575, 550, 500, 450};
            int[] rpentahedron_y = {200, 200, 300, 350, 300};
            g.setColor(Color.BLUE);
            g.fillPolygon(rpentahedron_x, rpentahedron_y, 5);
            g.setColor(Color.RED);
            g.drawString("Shedevr", 450, 20);
            g.setColor(Color.BLACK);
            g.drawString("Podolskyi Nikita PP-42", 10, 550);
        }
    }
}
