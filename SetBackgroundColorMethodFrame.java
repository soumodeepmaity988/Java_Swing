package com.company;

import javax.swing.*;
import java.awt.*;

class SetBackgroundColorMethodJFrame{
    public static void main(String[] args){
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,700,700);
        frame.setTitle("My Frame");
        Image icon = Toolkit.getDefaultToolkit().getImage("E:\\programming\\Java_Swing\\src\\com\\company\\instagram.png");
        frame.setIconImage(icon);
        Container c=frame.getContentPane();
        c.setBackground(Color.red);
    }
}