package com.company;

import javax.swing.*;
import java.awt.*;

class SetLocationMethodJFrame{
    public static void main(String[] args){
        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.setLocation(100,50);
    }
}