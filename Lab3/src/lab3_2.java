import javax.swing.*;
import java.awt.*;
import java.util.Collections;

import static java.util.Arrays.*;


public class lab3_2 {
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
            Font font = new Font("Times New Roman", Font.ITALIC, 14);
            int line_width = 130;
            String[] attitude = {"Позитивне", "Негативне", "Байдуже",};
            Integer[] values = {18, 3, 1};
            int x = 20, y = 40;
            int final_y = Collections.max(asList(values)) * 10 + 70;
            int final_x = values.length * line_width * 2;

            graphics.setFont(font);
            graphics.setColor(Color.BLACK);
            graphics.drawString("графік ставлення студентів групи ПП-42 до дистанційного навчання", 60, 20);
            graphics.setColor(Color.BLACK);
            graphics.drawLine(x, y, x, final_y);
            graphics.drawLine(x, final_y, final_x, final_y);
            for (int i = 0; i < attitude.length; i++) {
                graphics.setColor(Color.BLUE);
                graphics.drawString(Integer.toString(values[i]), x + line_width * 2 * i, final_y - (values[i] * 10 + 5));
                graphics.drawString(attitude[i], x + line_width * 2 * i, final_y - (values[i] * 10 + 5 + 16));
                graphics.setColor(Color.BLACK);
                graphics.drawLine(x + line_width * 2 * i, final_y - values[i] * 10, x + line_width * 2 * i + line_width, final_y - values[i] * 10);
                if(i != attitude.length - 1) {
                    graphics.drawLine(x + line_width * 2 * i + line_width, final_y - values[i] * 10, x + line_width * 2 * (i + 1), final_y - values[i + 1] * 10);
                }
            }
        }
    }
}