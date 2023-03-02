package bank.managment.system;
import java.sql.*;
public class Conn {
    Connection c;
    static Statement s;
    Conn(){
        try{
        c = DriverManager.getConnection("jdbc:mysql:///bankmanagment","root","Hrishi@2002");
        s = c.createStatement();
        }catch (Exception e){
            System.out.println(e);
        };

    }
}
