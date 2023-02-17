package bank.managment.system;

import javax.swing.*;
import java.awt.*;

public class SignupTwo extends JFrame {
    JComboBox religionbox, categoryBox, occupationBox, incomeBox,EQBox;
    JRadioButton Eyes,Eno,Syes,Sno;
    JButton next;
    JTextField panTF,aadharTF;
    SignupTwo(){
        JLabel PersonalDetails = new JLabel("Page 2: Other Details");
        PersonalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        PersonalDetails.setBounds(290,80,400,30);
        add(PersonalDetails);

        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway",Font.BOLD,20));
        religion.setBounds(100,140,150,30);
        add(religion);

        String [] relgions = {"Muslim","Hindu","Sikh","Buddh","Christian","Jain","Other"};
        religionbox = new JComboBox(relgions);
        religionbox.setFont(new Font("Raleway",Font.BOLD,12));
        religionbox.setBackground(Color.WHITE);
        religionbox.setSelectedIndex(1);
        religionbox.setBounds(310,140,400,30);
        add(religionbox);

        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100,190,150,30);
        add(category);

        String [] categorys = {"General","SC","ST","OBC","Other"};
        categoryBox = new JComboBox(categorys);
        categoryBox.setFont(new Font("Raleway", Font.BOLD, 12));
        categoryBox.setBackground(Color.WHITE);
        categoryBox.setBounds(310,190,400,30);
        add(categoryBox);

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100,240,150,30);
        add(income);

        String [] incomes = {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
        incomeBox = new JComboBox(incomes);
        incomeBox.setFont(new Font("Raleway", Font.BOLD,12));
        incomeBox.setBackground(Color.WHITE);
        incomeBox.setBounds(310,240,400,30);
        add(incomeBox);

        JLabel educational = new JLabel("Educational");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100,290,150,30);
        add(educational);

        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD, 20));
        qualification.setBounds(100,315,150,30);
        add(qualification);

        String [] EQs = {"Non-Graduate","Graduate","Post-Graduate","Doctorate","Other"};
        EQBox = new JComboBox(EQs);
        EQBox.setFont(new Font("Raleway",Font.BOLD,12));
        EQBox.setBackground(Color.WHITE);
        EQBox.setBounds(310,315,400,30);
        add(EQBox);

        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD,20));
        occupation.setBounds(100,365,150,30);
        add(occupation);

        String [] occupations = {"Salaried","Self-Employed","Businessman","Retired-Person","Other"};
        occupationBox = new JComboBox(occupations);
        occupationBox.setFont(new Font("Raleway",Font.BOLD,12));
        occupationBox.setBackground(Color.WHITE);
        occupationBox.setBounds(310,365,400,30);
        add(occupationBox);

        JLabel panno = new JLabel("PAN No:");
        panno.setFont(new Font("Raleway", Font.BOLD, 20));
        panno.setBounds(100,415,150,30);
        add(panno);

        panTF = new JTextField();
        panTF.setFont(new Font("Arial", Font.BOLD, 14));
        panTF.setBounds(310,415,400,30);
        add(panTF);

        JLabel aadharno = new JLabel("Aadhar No:");
        aadharno.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharno.setBounds(100,465,150,30);
        add(aadharno);

        aadharTF = new JTextField();
        aadharTF.setFont(new Font("Arial",Font.BOLD,14));
        aadharTF.setBounds(310,465,400,30);
        add(aadharTF);

        JLabel seniorC = new JLabel("Senior Citizen:");
        seniorC.setFont(new Font("Raleway", Font.BOLD,20));
        seniorC.setBounds(100,515,150,30);
        add(seniorC);

        Syes = new JRadioButton("Yes");
        Syes.setBackground(Color.WHITE);
        Syes.setBounds(310,515,50,30);
        add(Syes);

        Sno = new JRadioButton("No");
        Sno.setBackground(Color.WHITE);
        Sno.setBounds(460,515,50,30);
        add(Sno);

        ButtonGroup Seniorcitizen = new ButtonGroup();
        Seniorcitizen.add(Sno);
        Seniorcitizen.add(Syes);

        JLabel existingA = new JLabel("Existing Account:");
        existingA.setFont(new Font("Raleway", Font.BOLD, 20));
        existingA.setBounds(100,565,200,30);
        add(existingA);

        Eyes = new JRadioButton("Yes");
        Eyes.setBackground(Color.WHITE);
        Eyes.setBounds(310,565,50,30);
        add(Eyes);

        Eno = new JRadioButton("NO");
        Eno.setBackground(Color.WHITE);
        Eno.setBounds(460,565,50,30);
        add(Eno);

        ButtonGroup exictinAccount = new ButtonGroup();
        exictinAccount.add(Eno);
        exictinAccount.add(Eyes);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(650,600,100,30);
        add(next);

        setTitle("SignUp Form 2");
        setSize(850,800);
        setLocation(300,10);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    public static void main(String [] args){
        new SignupTwo();
    }
}
