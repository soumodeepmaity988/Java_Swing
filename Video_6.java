package com.company;

import javax.swing.*;
import java.awt.*;

class MyPassword{
    public static void main(String[]args){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        Container c=frame.getContentPane();
        c.setLayout(null);

        JPasswordField pass=new JPasswordField();
        pass.setBounds(100,50,180,30);
        c.add(pass);

        //you can use all the methods that we learn in JTextField

        pass.setText("12345678");//default text in the password field
        pass.setFont(new Font("Arial",Font.BOLD,20));//if you want to set the font of the password
        pass.setEchoChar('*');//if you want to set the * in the place of .
        pass.setEchoChar((char)0);//if you want to see the actual password

        frame.setVisible(true);
    }
}