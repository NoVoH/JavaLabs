import javax.swing.*;
import java.awt.*;
import java.awt.font.TextAttribute;
import java.util.Map;


public class lab4 extends JFrame {
    static JTextField name;
    static JTextField email;

    static JTextField phone;

    static JTextArea info;

    static JPasswordField password;

    static JPasswordField password_confirm;
    static JCheckBox check;
    static JButton button;
    static JLabel link;

    public static void main(String[] args) {
        Color bg = new Color(195,214,155);
        JFrame jFrame = new JFrame("Lab 4");
        jFrame.add(new Component());
        jFrame.getContentPane().setBackground(bg);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setBounds(500, 250, 600, 450);
        jFrame.setResizable(false);

    }

    static class Component extends JComponent {
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D graphics = (Graphics2D)g;
            Color title = new Color(70, 134, 70);
            Font font1 = new Font("Helvetica", Font.BOLD | Font.ITALIC, 18);
            Font font2 = new Font("Times", Font.ITALIC, 12);
            Font font3 = new Font("Times", Font.PLAIN, 14);
            graphics.setFont(font1);
            graphics.setColor(title);
            graphics.drawString("Персональна інформація", 30, 25);

            graphics.setFont(font2);
            graphics.setColor(Color.BLACK);
            graphics.drawString("Хочу отримувати розсилку", 50, 375);
            graphics.setFont(font3);
            graphics.drawString("ПІБ:", 96, 50);
            graphics.drawString("E-mail:", 78, 85);
            graphics.drawString("Телефон:", 58, 110);
            graphics.drawString("Пароль:", 138, 280);
            graphics.drawString("Пароль(підтвердження):", 30, 310);
            name = new JTextField(1);
            name.setBounds(127, 36, 175, 20);
            add(name);
            graphics.setColor(Color.BLUE);
            graphics.drawLine(30, 60, 550, 60);
            graphics.setColor(Color.BLACK);
            email = new JTextField(1);
            email.setBounds(127, 69, 175, 20);
            add(email);
            phone = new JTextField(1);
            phone.setBounds(127, 96, 175, 20);
            add(phone);
            graphics.setColor(Color.BLUE);
            graphics.drawLine(30, 120, 550, 120);
            graphics.setColor(Color.RED);
            graphics.drawString("Додаткова інформація:", 58, 140);
            info = new JTextArea();
            info.setBounds(30, 150, 520, 90);
            add(info);
            graphics.setColor(Color.BLUE);
            graphics.drawLine(30, 250, 550, 250);
            password = new JPasswordField(1);
            password.setBounds(197, 266, 175, 20);
            add(password);
            password_confirm = new JPasswordField(1);
            password_confirm.setBounds(197, 296, 175, 20);
            add(password_confirm);
            graphics.drawLine(30, 330, 550, 330);
            check = new JCheckBox();
            check.setBounds(25, 360, 20, 20);
            add(check);
            button = new JButton("Продовжити");
            button.setBounds(380, 350, 160, 40);
            add(button);
        }
    }
}