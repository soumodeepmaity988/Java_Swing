package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends JFrame implements ActionListener {

    Container c;
    JButton btn;
    JTextField textField;

    MyFrame(){
        c=this.getContentPane();
        c.setLayout(null);
        btn=new JButton("Click me");
        btn.setBounds(100,100,100,50);
        c.add(btn);
        btn.addActionListener(this);

        textField=new JTextField();
        textField.setBounds(100,200,150,50);
        c.add(textField);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        c.setBackground(Color.CYAN);
        textField.setText("Hello soumodeep");

    }
}


class ActionDemo{
    public static void main(String[]args){
        MyFrame frame=new MyFrame();
        frame.setTitle("Action Demo");
        frame.setSize(700,500);
        frame.setLocation(100,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}