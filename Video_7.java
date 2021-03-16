package com.company;

import javax.swing.*;
import java.awt.*;


class MyJButton{
    public static void main(String[]args){
        Container c=createFrame();

        CreateButton(c);

        CreateImageButton(c);


    }
    public static Container createFrame(){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,500);
        frame.setVisible(true);
        Container c=frame.getContentPane();
        c.setLayout(null);
        return c;
    }
    public static void CreateButton(Container c){
        JButton btn=new JButton("Click me");//Creating button of JButton class and passing "Click me" String
        btn.setSize(150,30);//setting the width and height of the button
        btn.setLocation(100,100);//setting the location of button from x axis and y axis
        c.add(btn); //adding button to the container

        Font font =new Font("Arial",Font.BOLD,20);
        btn.setFont(font);
        btn.setText("My Button");
        btn.setForeground(Color.cyan);
        btn.setBackground(Color.blue);

        Cursor cursor=new Cursor(Cursor.HAND_CURSOR);//creating the cursor object of Cursor class and setting the cursor type
        btn.setCursor(cursor);//setting the cursor to the button

        btn.setEnabled(true);//by this property you can disable the button or enable the button
        btn.setVisible(true);//by this property you can set the visibility of the button
    }

    public static void CreateImageButton(Container c){
        ImageIcon icon=new ImageIcon("E:\\programming\\Java_Swing\\src\\com\\company\\instagram.png");
        JButton btn1=new JButton(icon);
        btn1.setSize(icon.getIconWidth(),icon.getIconHeight());
        btn1.setLocation(100,150);
        c.add(btn1);
    }
}