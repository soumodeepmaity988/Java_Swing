package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

class Prac1{
    public static void main(String[]args){
        String myPassword="Saikat988";
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,400);
        Container c=frame.getContentPane();
        c.setLayout(null);



        JTextField name=new JTextField();
        name.setBounds(190,70,180,40);
        name.setFont(new Font("Arial",Font.ITALIC,18));
        c.add(name);

        JPasswordField passwordField=new JPasswordField();
        passwordField.setBounds(190,150,180,40);
        passwordField.setFont(new Font("Arial",Font.ITALIC,18));
        c.add(passwordField);

        JTextField answer=new JTextField();
        answer.setBounds(140,230,240,40);
        if(Arrays.toString(passwordField.getPassword()).equals(myPassword))
            answer.setText("Hello Soumodeep maity");
        c.add(answer);


        frame.setVisible(true);

    }
}