package com.company;

import javax.swing.*;
import java.awt.*;

class MyTextField{
    public static void main(String[]args){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        Container c=frame.getContentPane();
        c.setLayout(null);

        JTextField t1=new JTextField();//Creating JTextField object t1
        t1.setBounds(100,50,180,30);//Setting the bound of textField
        c.add(t1);//you have to add t1 text into the container to show this into the container

        t1.setText("Soumodeep maity");//to set text in your text field
        //if you want to set any default text

        Font font =new Font("Arial",Font.BOLD,20);//creating font object of Font class
        t1.setFont(font);//set the font into the textField t1 so that we can change the font style of t1
        t1.setForeground(Color.BLUE);//setting color of the text int t1 textField
        t1.setBackground(Color.YELLOW);//setting the background of the textField of t1
        t1.setEditable(false);//If you want nobody can change the text of the textField then you can set this property


        frame.setVisible(true);
    }
}