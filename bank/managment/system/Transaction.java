package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaction extends JFrame implements ActionListener {
    JButton Deposit , CashWithdrawal, FCash, MStatement, PinChange,BEnquiry, Exit;
    String pinnumber;
    Transaction(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel AtmImg = new JLabel(i3);
        AtmImg.setBounds(0,0,900,900);
        add(AtmImg);

        JLabel intro = new JLabel("Please select you Transaction");
        intro.setForeground(Color.WHITE);
        intro.setFont(new Font("System",Font.BOLD,16));
        intro.setBounds(235,300,700,35);
        AtmImg.add(intro);

        Deposit = new JButton("Deposit");
        Deposit.setBackground(Color.WHITE);
        Deposit.setForeground(Color.BLACK);
        Deposit.setBounds(170,415,150,30);
        Deposit.addActionListener(this);
        AtmImg.add(Deposit);

        CashWithdrawal = new JButton("Cast Withdrawal");
        CashWithdrawal.setBackground(Color.WHITE);
        CashWithdrawal.setForeground(Color.BLACK);
        CashWithdrawal.setBounds(355,415,150,30);
        AtmImg.add(CashWithdrawal);

        FCash = new JButton("Fast Cash");
        FCash.setBackground(Color.WHITE);
        FCash.setForeground(Color.BLACK);
        FCash.setBounds(170,450,150,30);
        AtmImg.add(FCash);

        MStatement = new JButton("Mini Statement");
        MStatement.setBackground(Color.WHITE);
        MStatement.setForeground(Color.BLACK);
        MStatement.setBounds(355,450,150,30);
        AtmImg.add(MStatement);

        PinChange = new JButton("Pin Change");
        PinChange.setBackground(Color.WHITE);
        PinChange.setForeground(Color.BLACK);
        PinChange.setBounds(170,485,150,30);
        AtmImg.add(PinChange);

        BEnquiry = new JButton("Balance Enquiry");
        BEnquiry.setBackground(Color.WHITE);
        BEnquiry.setForeground(Color.BLACK);
        BEnquiry.setBounds(355,485,150,30);
        AtmImg.add(BEnquiry);

        Exit = new JButton("Exit");
        Exit.setBackground(Color.WHITE);
        Exit.setForeground(Color.BLACK);
        Exit.setBounds(355,520,150,30);
        Exit.addActionListener(this);
        AtmImg.add(Exit);

        setSize(900,900);
        setLocation(250,0);
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==Exit){
            System.exit(0);
        }
        else if(e.getSource()==Deposit){
            setVisible(false);
            new Deposit(pinnumber);
        }

    }
    public static void main(String [] args){

        new Transaction("");
    }



}
