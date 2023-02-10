import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
    JButton SignupButton,Login,ClearButton;
    JLabel Cardno,Pin,label,welcome;
    JTextField CardTextField,PasswordField;
    Login(){
        setTitle("Automated teller machine");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        label = new JLabel(i3);
        label.setBounds(130,20,100,100);
        add(label);

        getContentPane().setBackground(Color.white);
        welcome = new JLabel("Welcome to Bank");
        welcome.setFont(new Font("Osward", Font.BOLD,38));
        welcome.setBounds(230,55,400,40);
        add(welcome);

        Cardno = new JLabel("Card No:");
        Cardno.setFont(new Font("Raleway", Font.BOLD,28));
        Cardno.setBounds(150,120,150,100);
        add(Cardno);

        CardTextField = new JTextField();
        CardTextField.setFont(new Font("Arial" ,Font.BOLD ,14));
        CardTextField.setBounds(300,160,250,30);
        add(CardTextField);

        Pin = new JLabel("Pin:");
        Pin.setFont(new Font("Raleway", Font.BOLD,28));
        Pin.setBounds(150,200,150,100);
        add(Pin);

        PasswordField = new JPasswordField();
        PasswordField.setFont(new Font("Arial" ,Font.BOLD ,14));
        PasswordField.setBounds(300,240,250,30);
        add(PasswordField);


        Login = new JButton("Sign In");
        Login.setBackground(Color.BLACK);
        Login.setForeground(Color.WHITE);
        Login.setBounds(300,300,100,30);
        Login.addActionListener(this);
        add(Login);

        ClearButton = new JButton("Clear");
        ClearButton.setBackground(Color.BLACK);
        ClearButton.setForeground(Color.WHITE);
        ClearButton.setBounds(450,300,100,30);
        ClearButton.addActionListener(this);
        add(ClearButton);

        SignupButton = new JButton("Sign Up");
        SignupButton.setBackground(Color.BLACK);
        SignupButton.setForeground(Color.WHITE);
        SignupButton.setBounds(370,350,100,30);
        SignupButton.addActionListener(this);
        add(SignupButton);

        setSize(800,480);
        setVisible(true);
        setLocation(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ClearButton){
            CardTextField.setText("");
            PasswordField.setText("");
        } else if (e.getSource()== Login) {

        } else if (e.getSource()==SignupButton) {

        }

    }
    public static void main(String [] args){
        new Login();
    }


}
