package com.company;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.time.Year;

class MyJSpinner{
    public static void main(String[]args){
        Container c = null;
        MyJFrame frame=new MyJFrame(c);
    }
}
class MyJFrame extends JFrame{

    String[] month={"Jan","Fab","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
    JSpinner m1,m2,m3;
    SpinnerModel model1,model2,model3;
    JLabel label=new JLabel("My Spinners");

    String str=(String.valueOf(Year.now()));
    int y=Integer.parseInt(str);

    MyJFrame(Container c){
        setBounds(100,100,500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c=getContentPane();
        setVisible(true);
        setLayout(null);


        model1=new SpinnerNumberModel(1,1,31,1);
        model2=new SpinnerListModel(month);
        model3=new SpinnerNumberModel(y,y-100,y,1);

        m1=new JSpinner(model1);
        m2=new JSpinner(model2);
        m3=new JSpinner(model3);

        m1.setBounds(100,20,100,30);
        m2.setBounds(100,100,100,30);
        m3.setBounds(100,200,100,30);

        add(m1);
        add(m2);
        add(m3);

        label.setBounds(100,300,150,20);
        add(label);
        validate();
    }
}