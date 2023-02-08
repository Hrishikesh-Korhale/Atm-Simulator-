import javax.swing.*;
public class Login extends JFrame {
    Login(){
        setTitle("Automated teller machine");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        JLabel labe = new JLabel(i1);
        add(labe);
        setSize(800,480);
        setVisible(true);
        setLocation(300,100);
    }
    public static void main(String [] args){
        new Login();
    }
}
