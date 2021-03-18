package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class RegistrationForm{
    public static void main(String[]args){
        JFrame frame=new JFrame();
        frame.setBounds(500,30,1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c=frame.getContentPane();
        c.setBackground(new Color(255, 255, 102));
        c.setLayout(null);
        ComponentsOfForm componentsOfForm=new ComponentsOfForm(c);
        frame.setVisible(true);
    }
}
class ComponentsOfForm implements ActionListener {
    JLabel registrationFrom;
    JLabel name;
    JLabel mobile;
    JLabel gender;
    JLabel dob;
    JLabel address;
    JTextField nameTextField;
    JTextField mobileTextField;
    JRadioButton male;
    JRadioButton female;
    JComboBox date;
    JComboBox month;
    JComboBox year;
    JTextArea addressTextArea;
    JButton submitButton;
    JButton resetButton;
    JTextArea DetailTextArea;
    JTextField successResult;
    String[] monthArray;
    String[] yearArray;
    String[] dateArray;

    ComponentsOfForm(Container c){
        registrationFrom=createJLabel(c,"Ragistration Form",60,250,80,570,70);
        registrationFrom.setForeground(new Color(255,64,0));
        name=createJLabel(c,"Name",20,70,200,100,50);
        nameTextField=createJTextField(c,15,190,200,230,40);
        mobile=createJLabel(c,"Mobile",20,70,300,100,50);
        mobileTextField=createJTextField(c,15,190,300,230,40);
        gender=createJLabel(c,"Gender",20,70,400,100,50);
        male=createJRadioButton(c,"Male",13,190,400,60,50);

        female=createJRadioButton(c,"Female",13,320,400,83,50);
        dob=createJLabel(c,"DOB",20,70,500,100,50);
        dateArray=new String[32];
        dateArray[0]="";
        for(int i=1;i<32;i++){

            dateArray[i]=String.valueOf(i);
        }
        date=createJComboBox(c,15,190,512,60,20,dateArray);
        monthArray= new String[]{"", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        month=createJComboBox(c,15,300,512,60,20,monthArray);
        yearArray= new String[]{"", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2005", "2004", "2021", "2021", "2021", "2021", "2021", "2021", "2021"};
        year=createJComboBox(c,15,410,512,60,20,yearArray);
        address=createJLabel(c,"Address",20,70,600,100,50);
        addressTextArea=createJTextArea(c,15,190,600,300,70);
        submitButton=createJButton(c,15,190,700,100,30,"Submit");
        submitButton.setBackground(new Color(26, 255, 26));
        submitButton.addActionListener(this);
        resetButton=createJButton(c,15,340,700,100,30,"Reset");
        resetButton.setBackground(new Color(255, 51, 0));

        resetButton.setForeground(Color.white);
        resetButton.addActionListener(this);
        successResult=createJTextFieldForResult(c,14,100,800,600,90);
        successResult.setEditable(false);
        DetailTextArea=createJTextArea(c,15,600,197,300,500);
        DetailTextArea.setEditable(false);
    }


    public JLabel createJLabel(Container c,String s,int size,int x,int y,int width,int height){
        JLabel label=new JLabel(s);
        label.setBounds(x,y,width,height);
        label.setForeground(new Color(255, 0, 102));
        Font font=new Font("Arial",Font.BOLD,size+5);
        label.setFont(font);
        c.add(label);
        return label;
    }


    public JTextField createJTextField(Container c,int size,int x,int y,int width,int height){
        JTextField textField=new JTextField();
        textField.setBounds(x,y,width,height);
        textField.setFont(new Font("Arial",Font.BOLD,size));
        c.add(textField);
        return textField;
    }
    public JTextField createJTextFieldForResult(Container c,int size,int x,int y,int width,int height){
        JTextField textField=new JTextField();
        textField.setBounds(x,y,width,height);
        textField.setBackground(Color.YELLOW);
        textField.setFont(new Font("Arial",Font.BOLD,size));
        c.add(textField);
        return textField;
    }

    public JRadioButton createJRadioButton(Container c,String s,int size,int x,int y,int width,int height){
        JRadioButton radioButton=new JRadioButton(s);
        radioButton.setBounds(x,y,width+15,height);

        radioButton.setBackground(new Color(255, 255, 102));
        radioButton.setForeground(new Color(0,255,255));
        radioButton.setFont(new Font("Airal",Font.BOLD,size+7));
        c.add(radioButton);
        return radioButton;
    }

    public JComboBox createJComboBox(Container c,int size,int x,int y,int width,int height,String[] strArray){
        JComboBox comboBox=new JComboBox(strArray);
        comboBox.setBounds(x,y,width,height);

        comboBox.setFont(new Font("Arial",Font.ITALIC,size));
        c.add(comboBox);
        return comboBox;
    }

    public JTextArea createJTextArea(Container c,int size,int x,int y,int width,int height){
        JTextArea textArea=new JTextArea();
        textArea.setBounds(x,y,width,height);
        textArea.setFont(new Font("Arial",Font.PLAIN,size));
        textArea.setLineWrap(true);
        c.add(textArea);
        return textArea;
    }

    public JButton createJButton(Container c,int size,int x,int y,int width,int height,String s){
        JButton jButton=new JButton(s);
        jButton.setBounds(x,y,width,height);
        jButton.setBorderPainted(false);
        jButton.setFont(new Font("Arial",Font.PLAIN,size));
        c.add(jButton);
        return jButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submitButton){
            if(!nameTextField.getText().equals("") && !mobileTextField.getText().equals("") && !dateArray[date.getSelectedIndex()].equals("") && !monthArray[month.getSelectedIndex()].equals("") && !yearArray[year.getSelectedIndex()].equals("") && !addressTextArea.getText().equals("")){
                successResult.setText("         Submitted successfully");
                successResult.setFont(new Font("Arial",Font.BOLD,33));
                successResult.setBackground(Color.GREEN);
                System.out.println(nameTextField.getText());
                System.out.println(mobileTextField.getText());
                System.out.println(male.getText());
                System.out.println(female.getText());
                System.out.println(dateArray[date.getSelectedIndex()]);
                System.out.println(monthArray[month.getSelectedIndex()]);
                System.out.println(yearArray[year.getSelectedIndex()]);
                System.out.println(addressTextArea.getText());
                DetailTextArea.setText(nameTextField.getText()+"\n"+mobileTextField.getText()+"\n"+dateArray[date.getSelectedIndex()]+"/"+monthArray[month.getSelectedIndex()]+"/"+yearArray[year.getSelectedIndex()]+"\n"+addressTextArea.getText());
                //DetailTextArea.setText(nameTextField.getText());
            }else{
                successResult.setText("                    Not submitted");
                successResult.setFont(new Font("Arial",Font.BOLD,33));
                successResult.setBackground(Color.RED);
                successResult.setForeground(Color.white);
            }
        }else if(e.getSource()==resetButton){

            nameTextField.setText("");
            mobileTextField.setText("");
            date.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            addressTextArea.setText("");
            successResult.setBackground(Color.YELLOW);
            successResult.setText("");
            DetailTextArea.setText("");
        }

    }
}