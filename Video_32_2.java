package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


//JOptionPane.showMessageDialog{
//    parent,message,title,message_type
//}

//Message_types:
//    JOptionPane.PLAIN_MESSAGE
//    JOptionPane.INFORMATION_MESSAGE
//    JOptionPane.QUESTION_MESSAGE
//    JOptionPane.ERROR_MESSAGE
//    JOptionPane.WARNING_MESSAGE

class MyDialog2{
    public static JLabel label;
    public static void main(String[]args) {
        JFrame frame = new JFrame("Input dialog example");
        frame.setVisible(true);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label=new JLabel();
        label.setBounds(100,100,100,70);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.add(label);
        JButton button = new JButton("Click me");
        frame.add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s=JOptionPane.showInputDialog("Enter your name");
                label.setText(s);
            }
        });
    }
}