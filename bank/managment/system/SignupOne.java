package bank.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener {

    JButton next;
    JTextField nameTF,fnameTF,emailTF,pincodeTF,stateTF,addressTF,cityTF;
    long random;
    JRadioButton male,female,other,married,Unmarried;
    JDateChooser dobDC;
    SignupOne(){

        Random ran = new Random();
        random = Math.abs((ran.nextLong()%9000L)+1000L);

        JLabel formno = new JLabel("Application Form No. "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(200,20,600,40);
        add(formno);

        JLabel PersonalDetails = new JLabel("Page 1: Personal Details");
        PersonalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        PersonalDetails.setBounds(290,80,400,30);
        add(PersonalDetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

        nameTF = new JTextField();
        nameTF.setFont(new Font("Arial" ,Font.BOLD ,14));
        nameTF.setBounds(300,140,400,30);
        add(nameTF);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,150,30);
        add(fname);

        fnameTF = new JTextField();
        fnameTF.setFont(new Font("Arial" ,Font.BOLD ,14));
        fnameTF.setBounds(300,190,400,30);
        add(fnameTF);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,150,30);
        add(dob);

        dobDC = new JDateChooser();
        dobDC.setBounds(300,240,400,30);
        add(dobDC);

        JLabel Gender = new JLabel("Gender:");
        Gender.setFont(new Font("Raleway",Font.BOLD,20));
        Gender.setBounds(100,290,150,30);
        add(Gender);

        male = new JRadioButton("Male");
        male.setBounds(300,290,100,30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(450,290,100,30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,150,30);
        add(email);

        emailTF = new JTextField();
        emailTF.setFont(new Font("Arial" ,Font.BOLD ,14));
        emailTF.setBounds(300,340,400,30);
        add(emailTF);

        JLabel maritalstatus = new JLabel("Marital Status:");
        maritalstatus.setFont(new Font("Raleway",Font.BOLD,20));
        maritalstatus.setBounds(100,390,150,30);
        add(maritalstatus);

        married = new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);

        Unmarried = new JRadioButton("Unmarried");
        Unmarried.setBounds(450,390,100,30);
        Unmarried.setBackground(Color.WHITE);
        add(Unmarried);

        other = new JRadioButton("Other");
        other.setBounds(600,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup MStatus = new ButtonGroup();
        MStatus.add(married);
        MStatus.add(Unmarried);
        MStatus.add(other);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,150,30);
        add(address);

        addressTF = new JTextField();
        addressTF.setFont(new Font("Arial" ,Font.BOLD ,14));
        addressTF.setBounds(300,440,400,30);
        add(addressTF);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,150,30);
        add(city);

        cityTF = new JTextField();
        cityTF.setFont(new Font("Arial" ,Font.BOLD ,14));
        cityTF.setBounds(300,490,400,30);
        add(cityTF);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,150,30);
        add(state);

        stateTF = new JTextField();
        stateTF.setFont(new Font("Arial" ,Font.BOLD ,14));
        stateTF.setBounds(300,540,400,30);
        add(stateTF);

        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,150,30);
        add(pincode);

        pincodeTF = new JTextField();
        pincodeTF.setFont(new Font("Arial" ,Font.BOLD ,14));
        pincodeTF.setBounds(300,590,400,30);
        add(pincodeTF);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(650,670,100,30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setTitle("Sign up Form one");
        setSize(850,800);
        setLocation(300,10);
        getContentPane().setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = ""+random;
        String name = nameTF.getText();
        String fname = fnameTF.getText();
        String dob = ((JTextField)dobDC.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }
        else if(female.isSelected()){
            gender="Female";
        }
        String email = emailTF.getText();
        String marrital=null;
        if(married.isSelected()){
            marrital="Married";
        }
        else if(Unmarried.isSelected()){
            marrital="Unmarried";
        }
        else if(other.isSelected()){
            marrital="Other";
        }
        String address=addressTF.getText();
        String city =cityTF.getText();
        String state =stateTF.getText();
        String pincode = pincodeTF.getText();

        try{
            if (name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is Required");
            }else {
                Conn c=new Conn();
                String query ="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marrital+"','"+address+"','"+city+"','"+state+"','"+pincode+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new SignupTwo();
            }

        }catch (Exception g){
            System.out.println(g);
        }

    }

    public static void main(String [] args)
    {

        new SignupOne();
    }


}
