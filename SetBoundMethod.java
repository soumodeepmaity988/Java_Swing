package com.company;

import javax.swing.*;
import java.awt.*;

class SetBoundMethod{
    public static void main(String[] args){
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setSize(700,700);
//        frame.setLocation(100,50);
        frame.setBounds(100,100,700,700);//setBound(x,y,width,height);
    }
}