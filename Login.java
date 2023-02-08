import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    Login(){
        setTitle("Automated teller machine");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(130,20,100,100);
        add(label);

        getContentPane().setBackground(Color.white);
        JLabel welcome = new JLabel("Welcome to Bank");
        welcome.setFont(new Font("Osward", Font.BOLD,38));
        welcome.setBounds(230,55,400,40);
        add(welcome);

        JLabel Cardno = new JLabel("Card No:");
        Cardno.setFont(new Font("Raleway", Font.BOLD,38));
        Cardno.setBounds(150,120,400,100);
        add(Cardno);

        JLabel Pin = new JLabel("Pin:");
        Pin.setFont(new Font("Raleway", Font.BOLD,38));
        Pin.setBounds(150,200,400,100);
        add(Pin);

        setSize(800,480);
        setVisible(true);
        setLocation(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String [] args){
        new Login();
    }
}
