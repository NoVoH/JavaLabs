import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

import static javax.swing.JOptionPane.showMessageDialog;

public class lab5 extends JFrame {
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

    public class EmailValidation {
        private static final String regex = "^(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])$";
    }

    public class NameValidation {
        private static final String regex = "^[\\u0400-\\u04FF]*$";
    }

    public class PasswordValidation {
        private static final String regex = "^[A-Za-z]*$";
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
            button.setEnabled(false);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    char[] temp1 = password.getPassword();
                    char[] temp2 = password_confirm.getPassword();
                    String pass = "";
                    String pass_check = "";
                    for(int i = 0; i < password.getPassword().length; i++)
                    {
                        pass += String. valueOf(temp1[i]);
                    }
                    for(int i = 0; i < password_confirm.getPassword().length; i++)
                    {
                        pass_check += String. valueOf(temp2[i]);
                    }
                    if(Pattern.matches(NameValidation.regex, name.getText()) != true || Pattern.matches(EmailValidation.regex, email.getText()) != true || Pattern.matches(PasswordValidation.regex, pass) != true || Pattern.matches(PasswordValidation.regex, pass_check) != true || pass.matches(pass_check) != true)
                    {
                        System.out.println(Pattern.matches(NameValidation.regex, name.getText()));
                        System.out.println(Pattern.matches(EmailValidation.regex, email.getText()));
                        System.out.println(Pattern.matches(PasswordValidation.regex, pass_check));
                        showMessageDialog(null, "Помилка");
                    }
                    else
                    {
                        showMessageDialog(null, "Персональна інформація передана Світовому Уряду");
                    }
                }
            });
            name.getDocument().addDocumentListener(new MyDocumentListener());
            email.getDocument().addDocumentListener(new MyDocumentListener());
            phone.getDocument().addDocumentListener(new MyDocumentListener());
            password.getDocument().addDocumentListener(new MyDocumentListener());
            password_confirm.getDocument().addDocumentListener(new MyDocumentListener());
            check.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (name.getText().isEmpty() || email.getText().isEmpty() || phone.getText().isEmpty() || password.getPassword().length == 0 || password_confirm.getPassword().length == 0 || check.isSelected() != true){
                        button.setEnabled(false);
                    }
                    else {
                        button.setEnabled(true);
                    }
                }
            });
            add(button);
        }
        class MyDocumentListener implements DocumentListener{

            @Override
            public void insertUpdate(DocumentEvent e) {
                changed();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                changed();
            }
            public void changed() {
                if (name.getText().isEmpty() || email.getText().isEmpty() || phone.getText().isEmpty() || password.getPassword().length == 0 || password_confirm.getPassword().length == 0 || check.isSelected() != true){
                    button.setEnabled(false);
                }
                else {
                    button.setEnabled(true);
                }

            }
        }

    }
}