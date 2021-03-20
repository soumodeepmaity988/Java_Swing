package com.company;
import javax.swing.*;
import java.awt.*;

class MyBorderLayout{
    public static void main(String[]args){
        JFrame frame=new JFrame();
        frame.setBounds(300,200,500,300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=frame.getContentPane();

        JButton b1=new JButton("PAGE_START");
        JButton b2=new JButton("PAGE_END");
        JButton b3=new JButton("LINE_START");
        JButton b4=new JButton("CENTER");
        JButton b5=new JButton("LINE_END");

        c.add(b1,BorderLayout.PAGE_START);
        c.add(b2,BorderLayout.PAGE_END);
        c.add(b3,BorderLayout.LINE_START);
        c.add(b4,BorderLayout.CENTER);
        c.add(b5,BorderLayout.LINE_END);
        frame.setVisible(true);
    }
}

