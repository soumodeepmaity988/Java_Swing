package com.company;

import javax.swing.*;
import java.awt.*;

class MyJMenuBar{
    public static void main(String[]args){
        JFrame frame=new JFrame("MenuBar");
        frame.setSize(600,500);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar=new JMenuBar();//Creating JMenuBar class object
        JMenu file=new JMenu("File");//This is first item of menuBar
        JMenuItem fileItem1=new JMenuItem("New");//this is the first item of file item of menuBar
        JMenuItem fileItem2=new JMenuItem("Open");//this is the second item of file item of menuBar
        JMenuItem fileItem3=new JMenuItem("Save");//this is the third item of file item of menuBar

        //Adding items to the file item
        file.add(fileItem1);
        file.add(fileItem2);
        file.add(fileItem3);

        menuBar.add(file);//adding file item to the menuBar

        JMenu edit=new JMenu("Edit");
        JMenuItem editItem1=new JMenuItem("Undo");
        JMenuItem editItem2=new JMenuItem("Copy");
        JMenuItem editItem3=new JMenuItem("Paste");
        JMenuItem editItem4=new JMenuItem("Copy path");
        JMenuItem editItem5=new JMenuItem("Find");
        edit.add(editItem1);
        edit.add(editItem2);
        edit.add(editItem3);
        edit.add(editItem4);
        edit.add(editItem5);
        menuBar.add(edit);

        //creating sub menuBar under file item
        //file.add(edit);

        //Adding menuBar to the frame
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);

    }
}