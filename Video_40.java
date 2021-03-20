package com.company;
import javax.swing.*;
import java.awt.*;

class MyFlowLayout extends JFrame{

    JButton btn1=new JButton("Button 1 Extra text");
    JButton btn2=new JButton("Button 2");
    JButton btn3=new JButton("Button 3");
    JButton btn4=new JButton("Button 4");
    JButton btn5=new JButton("Button 5");

    public MyFlowLayout(){
        setTitle("Flow Layout Example");
        setBounds(100,200,500,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c=getContentPane();

        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);

        //FlowLayout f=new FlowLayout();
        FlowLayout f=new FlowLayout(FlowLayout.LEFT);

        c.setLayout(f);
    }

    public static void main(String[]args){
        new MyFlowLayout();
    }
}

