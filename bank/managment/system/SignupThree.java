package bank.managment.system;
import javax.swing.*;
import java.awt.*;

public class SignupThree extends JFrame{
    SignupThree(){

            setLayout(null);
            JLabel Accountdetail = new JLabel("Page 3: Account Details");
            Accountdetail.setFont(new Font("Raleway",Font.BOLD,22));
            Accountdetail.setBounds(290,80,400,30);
            add(Accountdetail);

            JLabel AccountType = new JLabel("Account Type:");
            AccountType.setFont(new Font("Raleway", Font.BOLD,22));
            AccountType.setBounds(100,140,150,30);
            add(AccountType);

            JRadioButton Saccount = new JRadioButton("Saving Account");
            Saccount.setBounds(150,190,200,30);
            Saccount.setBackground(Color.WHITE);
            add(Saccount);

            JRadioButton FDaccount = new JRadioButton("Fixed Deposit Account");
            FDaccount.setBackground(Color.WHITE);
            FDaccount.setBounds(350,190,250,30);
            add(FDaccount);

            JRadioButton CRaccount = new JRadioButton("Current Account");
            CRaccount.setBackground(Color.WHITE);
            CRaccount.setBounds(150,240,250,30);
            add(CRaccount);

            JRadioButton RDaccount = new JRadioButton("Recurring Deposit Account");
            RDaccount.setBackground(Color.WHITE);
            RDaccount.setBounds(350,240,300,50);
            add(RDaccount);

            ButtonGroup Actype = new ButtonGroup();
            Actype.add(Saccount);
            Actype.add(CRaccount);
            Actype.add(FDaccount);
            Actype.add(RDaccount);



            setSize(850,800);
            setLocation(300,0);
            setVisible(true);
            getContentPane().setBackground(Color.WHITE);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String [] agrs){
        new SignupThree();
    }
}
