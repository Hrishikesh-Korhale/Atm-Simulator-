package bank.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    JButton Deposit, Back;
    JTextField DepositTF;
    String Pinnumber;
    Deposit(String Pinnumber){
        this.Pinnumber=Pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(0,0,900,900);
        add(img);

        JLabel intro = new JLabel("Enter the amount you want to Deposit");
        intro.setForeground(Color.WHITE);
        intro.setFont(new Font("System",Font.BOLD,16));
        intro.setBounds(200,300,700,35);
        img.add(intro);

        DepositTF = new JTextField();
        DepositTF.setBounds(200,340,300,30);
        DepositTF.setFont(new Font("Raleway",Font.BOLD,16));
        img.add(DepositTF);

        Deposit = new JButton("Deposit");
        Deposit.setBackground(Color.WHITE);
        Deposit.setForeground(Color.BLACK);
        Deposit.setBounds(355,485,150,30);
        Deposit.addActionListener(this);
        img.add(Deposit);

        Back = new JButton("Back");
        Back.setBackground(Color.WHITE);
        Back.setForeground(Color.BLACK);
        Back.setBounds(355,520,150,30);
        Back.addActionListener(this);
        img.add(Back);

        setSize(900,900);
        setLocation(250,0);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setUndecorated(true);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Deposit){
            String number=DepositTF.getText();
            Date date = new Date();
            if (number==""){
                JOptionPane.showMessageDialog(null,"Please Enter the amount");
            }
            else {
                Conn conn = new Conn();
                try {
                    String query = "insert into Bank values('" + Pinnumber + "','" +date+ "','Deposit','"+number+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Rs "+number+" Deposited Successfully");
                }catch (Exception j){
                    System.out.println(j);
                }
            }
        }
        else if(e.getSource()==Back){
            setVisible(false);
            new Transaction(Pinnumber);
        }
    }
    public static void main(String [] args){
        new Deposit("");
    }

}
