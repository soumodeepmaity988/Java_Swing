package com.company;

import javax.swing.*;
import java.awt.*;

class MyLabel{
    public static void main(String[]args){

        //create frame 1.set its visibility 2.set its setDefaultCloseOperation 3.set its bounds=====
        JFrame frame =new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,700);
        //==========================================================================================

        //you can get reference of container from frame getContentPane()============================
        Container c=frame.getContentPane();
        c.setLayout(null);
        //==========================================================================================


        //create label and set its bound=================================================
        //JLabel label=new JLabel("UserName");
        //label.setBounds(100,50,200,30);
        //===============================================================================

        //create font , set font int label================================================
        //Font font=new Font("Arial",Font.PLAIN,30);
        //label.setFont(font);
        //================================================================================

        //you have to add label to the container object c=================================
        //c.add(label);


        //create image icon object and set the file name =================================
        //ImageIcon icon=new ImageIcon("E:\\programming\\Java_Swing\\src\\com\\company\\instagram.png");
        //JLabel label=new JLabel(icon);
        //label.setBounds(100,50,200,30);
        //label.setBounds(300,100,icon.getIconWidth(),icon.getIconHeight());
        //c.add(label);
        //================================================================================

        //create ImageIcon object icon and set file name and set the text and alingment======================
        ImageIcon icon=new ImageIcon("E:\\programming\\Java_Swing\\src\\com\\company\\flowers_petals_leaves_137914_300x168.jpg");
        JLabel label=new JLabel("Istagram",icon,JLabel.CENTER);
        label.setBounds(0,100,500,100);
        //label.setBounds(300,100,icon.getIconWidth(),icon.getIconHeight());
        c.add(label);
        //====================================================================================================

    }
}