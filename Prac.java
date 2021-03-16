package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


class Prac1{
    static String myPassword="Saikat988";
    static String enteredPassword="not entered";
    public static void main(String[]args){

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,500,500);
        Container c=frame.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);


        Font font=new Font("Arial",Font.BOLD,20);

        createJLabel(c,"Name",80,65,180,40,font);

        createJLabel(c,"Password",80,145,180,40,font);

        JTextField nameField=createJTextField(c,190,70,180,30);

        JPasswordField passwordField=createJPasswordField(c,190,150,180,30);



        JTextField answer=createJTextField(c,0,360,500,100);


        answer.setFont(new Font("Arial",Font.BOLD,20));
        c.add(answer);

        JButton button =new JButton("Click here");
        button.setSize(130,50);
        button.setLocation(150,210);
        button.setBackground(Color.GREEN);
        c.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if( Arrays.equals( myPassword.toCharArray(), passwordField.getPassword() ) ){
                    answer.setBackground(Color.GREEN);
                    answer.setForeground(Color.YELLOW);
                    passwordField.setText("");
                    answer.setText("Hello Soumodeep maity \n");
                }
                else {
                    answer.setBackground(Color.RED);
                    answer.setForeground(Color.BLACK);
                    answer.setText(enteredPassword);

                }
            }
        });


        frame.setVisible(true);

    }
    public static void createJLabel(Container c,String s,int x,int y,int width,int height,Font font){
        JLabel label=new JLabel(s);
        label.setBounds(x,y,width,height);
        label.setFont(font);
        c.add(label);
    }

    public static JTextField createJTextField(Container c,int x,int y,int width,int height){
        JTextField nameField=new JTextField();
        nameField.setBounds(x,y,width,height);
        nameField.setBackground(Color.orange);
        nameField.setFont(new Font("Arial",Font.ITALIC,18));
        c.add(nameField);
        return nameField;
    }
    public static JPasswordField createJPasswordField(Container c,int x,int y,int width,int height){
        JPasswordField passwordField=new JPasswordField();
        passwordField.setBounds(x,y,width,height);
        passwordField.setBackground(Color.MAGENTA);
        passwordField.setFont(new Font("Arial",Font.ITALIC,18));
        c.add(passwordField);
        return passwordField;
    }
}