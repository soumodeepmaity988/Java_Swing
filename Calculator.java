package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator{


    public static void main(String[]args){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,100,470,600);
        Container c=frame.getContentPane();
        c.setLayout(null);
        frame.setResizable(false);
        frame.setBackground(Color.WHITE);
        CalculatorButton button=new CalculatorButton(c);
        frame.setVisible(true);
    }

}



class CalculatorButton implements ActionListener{

    public static String input="0";
    public static String operator="";
    public static String output="0";
    public static String A="";
    public static String B="";

    public static JTextField display;
    public static JTextField answer;




    public JButton btn_0;
    public JButton btn_1;
    public JButton btn_2;
    public JButton btn_3;
    public JButton btn_4;
    public JButton btn_5;
    public JButton btn_6;
    public JButton btn_7;
    public JButton btn_8;
    public JButton btn_9;
    public JButton btn_add;
    public JButton btn_sub;
    public JButton btn_mul;
    public JButton btn_div;
    public JButton btn_sqr;
    public JButton btn_sqrt;
    public JButton btn_dot;
    public JButton btn_modulo;
    public JButton btn_ans;
    public JButton btn_clear;
    public JButton btn_CE;
    public JButton btn_del;
    public JButton btn_negative;
    public JButton btn_div_one;

    CalculatorButton(Container c){

        display=createTextField(c,10,10,435,50);
        answer=createTextField(c,10,70,435,50);

        btn_0=createButton(c,10,140,100,50,"0");
        btn_1=createButton(c,120,140,100,50,"1");
        btn_2=createButton(c,230,140,100,50,"2");

        btn_add=createButton(c,340,140,100,50,"+");

        btn_3=createButton(c,10,200,100,50,"3");
        btn_4=createButton(c,120,200,100,50,"4");
        btn_5=createButton(c,230,200,100,50,"5");

        btn_sub=createButton(c,340,200,100,50,"-");

        btn_6=createButton(c,10,260,100,50,"6");
        btn_7=createButton(c,120,260,100,50,"7");
        btn_8=createButton(c,230,260,100,50,"8");

        btn_div=createButton(c,340,260,100,50,"/");

        btn_9=createButton(c,10,320,100,50,"9");
        btn_dot=createButton(c,120,320,100,50,".");
        btn_clear=createButton(c,230,320,100,50,"C");

        btn_mul=createButton(c,340,320,100,50,"X");

        btn_modulo=createButton(c,10,380,100,50,"%");
        btn_CE=createButton(c,120,380,100,50,"CE");
        btn_del=createButton(c,230,380,100,50,"Del");
        btn_ans=createButton(c,340,380,100,50,"=");
        btn_div_one=createButton(c,10,440,100,50,"1/x");
        btn_sqr=createButton(c,120,440,100,50,"x^2");
        btn_sqrt=createButton(c,230,440,100,50,"sqrt(x)");
        btn_negative=createButton(c,340,440,100,50,"+/-");
    }

    public  JButton createButton(Container c,int x,int y,int width,int height,String name){
        JButton button=new JButton(name);
        button.setBounds(x,y,width,height);
        Font font=new Font("Arial",Font.BOLD,20);
        switch (name) {
            case "=" -> button.setBackground(Color.GREEN);
            case "X", "+", "-", "/" -> button.setBackground(Color.CYAN);
            case "Del", "CE", "C" -> {
                button.setBackground(Color.RED);
                button.setForeground(Color.WHITE);
            }
            case "1/x", "x^2", "sqrt(x)", "+/-", "%" -> button.setBackground(Color.PINK);
            default -> button.setBackground(Color.orange);
        }
        button.setFont(font);
        button.setBorderPainted(false);
        c.add(button);
        button.addActionListener(this);
        return button;
    }

    public JTextField createTextField(Container c,int x,int y, int width,int height){
        JTextField textField=new JTextField();
        textField.setBounds(x,y,width,height);
        Font font=new Font("Arial",Font.BOLD,30);
        textField.resetKeyboardActions();
        textField.setFont((font));

        textField.setText(input);
        c.add(textField);
        return textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if(input.equals("0"))
        input="";
        if (btn_ans.equals(source)) {
            B=input;
            System.out.println(A);
            System.out.println(B);
            System.out.println(operator);
            input ="";
            if(!A.equals("") && !B.equals("")){
                output=calculate(A,B,operator);
            }else{
                System.out.println("check");
            }
        } else if (btn_1.equals(source)) {
            input = input.concat("1");
        } else if (btn_2.equals(source)) {
            input = input.concat("2");
        } else if (btn_3.equals(source)) {
            input = input.concat("3");
        } else if (btn_4.equals(source)) {
            input = input.concat("4");
        } else if (btn_5.equals(source)) {
            input = input.concat("5");
        } else if (btn_6.equals(source)) {
            input = input.concat("6");
        } else if (btn_7.equals(source)) {
            input = input.concat("7");
        } else if (btn_8.equals(source)) {
            input = input.concat("8");
        } else if (btn_9.equals(source)) {
            input = input.concat("9");
        } else if (btn_add.equals(source)) {
            output = input.concat("+");
            iniA_op(output);
            input="0";
        } else if (btn_sub.equals(source)) {
            output = input.concat("-");
            iniA_op(output);
            input="0";
        } else if (btn_mul.equals(source)) {
            output = input.concat("x");
            iniA_op(output);
            input="0";
        } else if (btn_div.equals(source)) {
            output = input.concat("/");
            iniA_op(output);
            input="0";
        } else if (btn_0.equals(source)) {
            input = input.concat("0");
        } else if (btn_sqr.equals(source)) {
            input = input.concat("=");
        } else if (btn_sqrt.equals(source)) {
            input = input.concat("=");
        } else if (btn_div_one.equals(source)) {
            input = input.concat("=");
        } else if (btn_modulo.equals(source)) {
            input = input.concat("%");
        }else if (btn_CE.equals(source)) {
            input ="0";
        }else if (btn_clear.equals(source)) {
            input ="0";
            output="0";
        }else if (btn_del.equals(source)) {
            if(input.length()>0){
                input = input.substring(0,input.length()-1);
                if(input.length()==0)input="0";
            }else{
                input="0";
            }
        }

        display.setText(input);
        answer.setText(output);
    }


    public void iniA_op(String output){
        operator=String.valueOf(output.charAt(output.length()-1));
        A=output.substring(0,output.length()-1);
    }

    private String calculate(String a, String b,String operator) {
        long A=Long.parseLong(a);
        long B=Long.parseLong(b);
        String ans="";
        if(operator.equals("+")){
            ans=String.valueOf(A+B);
        }else if(operator.equals("-")){
            ans=String.valueOf(A-B);
        }else if(operator.equals("x")){
            ans=String.valueOf(A*B);
        }else if(operator.equals("/")){
            ans=String.valueOf(A/B);
        }
        System.out.println(ans);
        return ans;
    }
}