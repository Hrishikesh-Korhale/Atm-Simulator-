package bank.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {
        JButton submit , cancel;
        JCheckBox c1,c2,c3,c4,c5,c6,c7;
        JRadioButton r1,r2,r3,r4;
        String formno;
    SignupThree(String fomrno){
            this.formno=fomrno;
            setLayout(null);
            JLabel Accountdetail = new JLabel("Page 3: Account Details");
            Accountdetail.setFont(new Font("Raleway",Font.BOLD,22));
            Accountdetail.setBounds(290,30,400,30);
            add(Accountdetail);

            JLabel accounttype = new JLabel("Account Type:");
            accounttype.setFont(new Font("Raleway", Font.BOLD,22));
            accounttype.setBounds(100,90,150,30);
            add(accounttype);

            r1 = new JRadioButton("Saving Account");
            r1.setBounds(150,130,200,30);
            r1.setBackground(Color.WHITE);
            add(r1);

            r2 = new JRadioButton("Fixed Deposit Account");
            r2.setBackground(Color.WHITE);
            r2.setBounds(350,130,250,30);
            add(r2);

            r3 = new JRadioButton("Current Account");
            r3.setBackground(Color.WHITE);
            r3.setBounds(150,170,250,30);
            add(r3);

            r4 = new JRadioButton("Recurring Deposit Account");
            r4.setBackground(Color.WHITE);
            r4.setBounds(350,170,300,50);
            add(r4);

            ButtonGroup Actype = new ButtonGroup();
            Actype.add(r1);
            Actype.add(r2);
            Actype.add(r3);
            Actype.add(r4);

            JLabel cardno = new JLabel("Card Number:");
            cardno.setFont(new Font("Raleway",Font.BOLD,22));
            cardno.setBounds(100,250,150,30);
            add(cardno);

            JLabel scardno = new JLabel("XXXX-XXXX-XXXX-3220");
            scardno.setFont(new Font("Raleway",Font.BOLD,22));
            scardno.setBounds(300,250,250,30);
            add(scardno);

            JLabel cardno16 = new JLabel("Your 16 digit card no");
            cardno16.setFont(new Font("Arial",Font.ITALIC,12));
            cardno16.setBounds(110,275,150,30);
            add(cardno16);

            JLabel pin = new JLabel("Pin:");
            pin.setFont(new Font("Raleway",Font.BOLD,22));
            pin.setBounds(100,320,150,30);
            add(pin);

            JLabel pin4 = new JLabel("Your 4 digit password");
            pin4.setFont(new Font("Arial",Font.ITALIC,12));
            pin4.setBounds(110,345,150,30);
            add(pin4);

            JLabel pinno = new JLabel("XXXX");
            pinno.setFont(new Font("Raleway",Font.BOLD,22));
            pinno.setBounds(300,320,150,30);
            add(pinno);

            JLabel Rservices = new JLabel("Services Required:");
            Rservices.setFont(new Font("Raleway",Font.BOLD,22));
            Rservices.setBounds(100,400,200,30);
            add(Rservices);

            c1 = new JCheckBox("ATM Card");
            c1.setFont(new Font("Raleway",Font.BOLD,14));
            c1.setBackground(Color.WHITE);
            c1.setBounds(150,450,150,30);
            add(c1);

            c2 = new JCheckBox("Internet Banking");
            c2.setFont(new Font("Raleway",Font.BOLD,14));
            c2.setBackground(Color.WHITE);
            c2.setBounds(350,450,150,30);
            add(c2);

            c3 = new JCheckBox("Mobile Banking");
            c3.setFont(new Font("Raleway",Font.BOLD,14));
            c3.setBackground(Color.WHITE);
            c3.setBounds(150,480,150,30);
            add(c3);

            c4 = new JCheckBox("Email & SMS Alert");
            c4.setFont(new Font("Raleway",Font.BOLD,14));
            c4.setBackground(Color.WHITE);
            c4.setBounds(350,480,150,30);
            add(c4);

            c5 = new JCheckBox("Chequebook");
            c5.setFont(new Font("Raleway",Font.BOLD,14));
            c5.setBackground(Color.WHITE);
            c5.setBounds(150,510,150,30);
            add(c5);

            c6 = new JCheckBox("e-Statement");
            c6.setFont(new Font("Raleway",Font.BOLD,14));
            c6.setBackground(Color.WHITE);
            c6.setBounds(350,510,150,30);
            add(c6);

            c7 = new JCheckBox("I hereby declares that the above enter details are correct to the best of my knowledge");
            c7.setBackground(Color.WHITE);
            c7.setFont(new Font("Raleway",Font.BOLD,12));
            c7.setBounds(100,560,600,30);
            add(c7);

            submit = new JButton("Submit");
            submit.setBackground(Color.BLACK);
            submit.setForeground(Color.WHITE);
            submit.setFont(new Font("Raleway",Font.BOLD,14));
            submit.setBounds(250,670,100,30);
            submit.addActionListener(this);
            add(submit);

            cancel = new JButton("Cancel");
            cancel.setBackground(Color.BLACK);
            cancel.setForeground(Color.WHITE);
            cancel.setFont(new Font("Raleway",Font.BOLD,14));
            cancel.setBounds(420,670,100,30);
            cancel.addActionListener(this);
            add(cancel);

            setSize(850,800);
            setLocation(300,0);
            setVisible(true);
            getContentPane().setBackground(Color.WHITE);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource()==submit){
                String AccountType=null;
                if (r1.isSelected()){
                        AccountType="Saving Account";
                }
                else if(r2.isSelected()){
                        AccountType="Fixed Deposit Account";
                }
                else if(r3.isSelected()){
                        AccountType="Current Account";
                }
                else if(r4.isSelected()){
                        AccountType="Recurring Deposit Account";
                }
                Random random = new Random();

                String CardNo =""+Math.abs((random.nextLong()% 90000000L) + 5040936000000000L);
                String PinNo =""+ Math.abs((random.nextLong()% 9000L) +1000L);
                String RServices=null;
                if (c1.isSelected()){
                        RServices="ATM Card";
                } else if (c2.isSelected()){
                        RServices=RServices+" Internet Banking";
                } else if (c3.isSelected()){
                        RServices=RServices+" Mobil Banking";
                } else if (c4.isSelected()) {
                        RServices=RServices+" Email & SMS Alert";
                } else if (c5.isSelected()) {
                        RServices=RServices+" Cheque";
                } else if (c6.isSelected()){
                        RServices=RServices+" e-Statement";
                }
                    try{
                        if (c7.isSelected()==false){
                        JOptionPane.showMessageDialog(null ,"Please Select Declaration");
                        }
                        else {
                            Conn c = new Conn();
                            String query1 = "insert into signupthree values ('"+formno+"','"+AccountType+"','"+CardNo+"','"+PinNo+"','"+RServices+"')";
                            c.s.executeUpdate(query1);

                            JOptionPane.showMessageDialog(null,"Card Number "+CardNo+"\nPin : "+PinNo);

                            String query2 = "insert into login values ('"+formno+"','"+CardNo+"','"+PinNo+"')";
                            c.s.executeUpdate(query2);
                        }
                }catch (Exception j){
                        System.out.println(j);
                }
            }
            else if(e.getSource()==cancel){

            }

        }
    public static void main(String [] agrs){

            new SignupThree("");
    }
}
