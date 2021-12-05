package Menu;

import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {

    JButton jb1,jb2;
    JTextField jt1, jt2;
    JLabel lbl, lbl1,lbl2;


    LoginPage() {
        setTitle("Login Menu.Registration Page");


        lbl = new JLabel("login Page");
        lbl.setBounds(150, 30, 200, 20);
        lbl.setForeground(Color.red);
        add(lbl);

        lbl1 = new JLabel("Email");
        lbl1.setBounds(150, 60, 150, 30);
        lbl1.setForeground(Color.red);
        add(lbl1);

        lbl2 = new JLabel("Password");
        lbl2.setBounds(150, 120, 150, 30);
        lbl2.setForeground(Color.red);
        add(lbl2);

        jt1 = new JTextField();
        jt1.setBounds(150, 90, 150, 30);
        jt1.setForeground(Color.black);
        add(jt1);

        jt2 = new JTextField();
        jt2.setBounds(150, 150, 150, 30);
        jt2.setForeground(Color.black);
        add(jt2);

        jb1 = new JButton("Login ");
        jb1.setBounds(180, 180, 100, 30);
        jb1.setForeground(Color.blue);
        add(jb1);

        jb2 = new JButton("Sign Up");
        jb2.setBounds(180, 210, 100, 30);
        jb2.setForeground(Color.blue);
        add(jb2);


        setLayout(null);
        setSize(600, 400);
        setVisible(true);

    }

    public static void main(String args[]) {LoginPage loginPage = new LoginPage();
    }

}