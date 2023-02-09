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
        Cardno.setFont(new Font("Raleway", Font.BOLD,28));
        Cardno.setBounds(150,120,150,100);
        add(Cardno);

        JTextField CardTextField = new JTextField();
        CardTextField.setBounds(300,160,250,30);
        add(CardTextField);

        JLabel Pin = new JLabel("Pin:");
        Pin.setFont(new Font("Raleway", Font.BOLD,28));
        Pin.setBounds(150,200,150,100);
        add(Pin);

        JPasswordField PasswordField = new JPasswordField();
        PasswordField.setBounds(300,240,250,30);
        add(PasswordField);

        setSize(800,480);
        setVisible(true);
        setLocation(300,100);

        JButton Login = new JButton("Sign In");
        Login.setBackground(Color.BLACK);
        Login.setForeground(Color.WHITE);
        Login.setBounds(300,300,100,30);
        add(Login);

        JButton ClearButton = new JButton("Clear");
        ClearButton.setBackground(Color.BLACK);
        ClearButton.setForeground(Color.WHITE);
        ClearButton.setBounds(450,300,100,30);
        add(ClearButton);

        JButton SignupButton = new JButton("Sign Up");
        SignupButton.setBackground(Color.BLACK);
        SignupButton.setForeground(Color.WHITE);
        SignupButton.setBounds(370,350,100,30);
        add(SignupButton);



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String [] args){
        new Login();
    }
}
