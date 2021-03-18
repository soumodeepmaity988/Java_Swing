package com.company;

import javax.swing.*;
import java.awt.*;


class MyJComboBox{
    public static void main(String[]args){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,700);
        Container c=frame.getContentPane();
        c.setLayout(null);

        String[] arr={"Mango","Apple","Banana","Guava","false"};
        JComboBox comboBox=new JComboBox(arr);
        comboBox.setBounds(100,100,300,50);
        c.add(comboBox);

        JTextField textField=new JTextField();

        textField.setBounds(100,200,100,50);

            textField.setText(comboBox.getToolTipText());
            System.out.println(comboBox.getSelectedIndex());


        c.add(textField);

        frame.setVisible(true);
    }
}