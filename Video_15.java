package com.company;

import javax.swing.*;
import java.awt.*;


class MyJTextArea{
    public static void main(String[]args){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,700);
        Container c=frame.getContentPane();
        c.setLayout(null);
        JTextArea textArea=new JTextArea();
        textArea.setBounds(100,100,600,500);
        c.add(textArea);
        textArea.setText("Hello");
        //textArea.setEditable(false);
        textArea.setFont(new Font("Arial",Font.BOLD,20));
        textArea.setLineWrap(true);



        frame.setVisible(true);
    }
}