package Q1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    static JLabel label1, label2, label3;
    static JTextField text1, text2, text3;
    static JButton button;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setBounds(300, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        label1 = new JLabel("First Number: ");
        label1.setBounds(10, 20, 100, 10);

        label2 = new JLabel("Second Number: ");
        label2.setBounds(10, 50, 100, 10);

        frame.add(label1);
        frame.add(label2);

        text1 = new JTextField();
        text1.setBounds(110, 15, 70, 20);
        text1.setHorizontalAlignment(JTextField.CENTER);

        frame.add(text1);

        text2 = new JTextField();
        text2.setBounds(110, 45, 70, 20);
        text2.setHorizontalAlignment(JTextField.CENTER);

        frame.add(text2);

        text3 = new JTextField();
        text3.setBounds(110, 135, 70, 20);
        text3.setHorizontalAlignment(JTextField.CENTER);

        frame.add(text3);

        label3 = new JLabel("Result: ");
        label3.setBounds(10, 130, 50, 10);

        frame.add(label3);
    }
}