package com.company;

import javax.swing.*;
import java.awt.*;


class MyJCheckBox{
    public static void main(String[]args){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,700);
        Container c=frame.getContentPane();
        c.setLayout(null);


        JCheckBox checkBox1=new JCheckBox("Graduated");
        checkBox1.setBounds(100,100,100,50);
        c.add(checkBox1);
        JCheckBox checkBox2=new JCheckBox("Postgraduated");
        checkBox2.setBounds(200,100,100,50);
        c.add(checkBox2);

        ButtonGroup qualification=new ButtonGroup();
        qualification.add(checkBox1);
        qualification.add(checkBox2);

        checkBox1.setSelected(true);

        //Same as JRadioButton


        frame.setVisible(true);
    }
}