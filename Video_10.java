package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class ActionDemo2{
    public static void main(String[]args){
        JFrame frame=new JFrame();
        frame.setBounds(100,100,1000,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        Container c=frame.getContentPane();
        c.setLayout(null);

        JButton btn=new JButton("Click me");
        btn.setBounds(100,100,100,50);
        c.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.setBackground(Color.red);
                btn.setBackground(Color.YELLOW);
                System.out.println("Button is Clicked");
            }
        });
    }
}