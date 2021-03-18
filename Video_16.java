package com.company;
import javax.swing.*;
import java.awt.*;

class MyJRadioButton{
    public static void main(String[]args){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1000,700);
        Container c=frame.getContentPane();
        c.setLayout(null);

        JRadioButton radioButton1=new JRadioButton("Male");
        radioButton1.setBounds(100,50,100,20);
        c.add(radioButton1);

        JRadioButton radioButton2=new JRadioButton("Female");
        radioButton2.setBounds(200,50,100,20);
        c.add(radioButton2);

        ButtonGroup gender=new ButtonGroup();
        gender.add(radioButton1);
        gender.add(radioButton2);
        //if you comment out above three lines then you can select both of the radiobutton which is not good
        //that is why we create the button group and add both this radio button for selecting any of them
        //We can create more then one button group
        radioButton1.setSelected(true);//for selecting default already selected radiobutton

        //you can use setEnabled property.
        radioButton1.setFont(new Font("Arial",Font.BOLD,20));

        if(radioButton1.isSelected()){
            System.out.println("Male");
        }else{
            System.out.println("Female");
        }
        frame.setVisible(true);
    }
}