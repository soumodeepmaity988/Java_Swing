package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame1 extends JFrame implements ActionListener {

    Container c;
    JButton btn1=new JButton("Red");
    JButton btn2=new JButton("Blue");
    JButton btn3=new JButton("Green");
    JTextField textField;

    MyFrame1(){
        c=this.getContentPane();
        c.setLayout(null);
        //btn=new JButton("Click me");
        btn1.setBounds(100,100,100,50);
        c.add(btn1);
        btn1.addActionListener(this);

        btn2.setBounds(100,170,100,50);
        c.add(btn2);
        btn2.addActionListener(this);

        btn3.setBounds(100,240,100,50);
        c.add(btn3);
        btn3.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn1){
            c.setBackground(Color.CYAN);
            btn1.setBackground(Color.BLUE);
            btn1.setForeground(Color.WHITE);
            btn2.setBackground(Color.YELLOW);
            btn3.setBackground(Color.RED);
        }
        if(e.getSource()==btn2){
            c.setBackground(Color.YELLOW);
            btn1.setBackground(Color.RED);
            btn2.setBackground(Color.CYAN);
            btn3.setBackground(Color.BLUE);
            btn3.setForeground(Color.WHITE);

        }
        if(e.getSource()==btn3){
            c.setBackground(Color.RED);
            btn1.setBackground(Color.YELLOW);
            btn2.setBackground(Color.BLUE);
            btn2.setForeground(Color.WHITE);
            btn3.setBackground(Color.CYAN);
        }

    }
}


class ActionDemo1{
    public static void main(String[]args){
        MyFrame1 frame1=new MyFrame1();
        frame1.setTitle("Action Demo");
        frame1.setSize(700,500);
        frame1.setLocation(100,100);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}