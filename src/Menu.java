import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
    JButton buttonlogin,buttonregistration,buttonsimpleintrest,buttonexit;

    public Menu(){
        buttonexit = new JButton("Exit");
        buttonexit.setBounds(250,60,100,40);
        buttonexit.setForeground(Color.white);
        buttonexit.setBackground(Color.red);
        add(buttonexit);

        buttonlogin = new JButton("Log In");
        buttonlogin.setBounds(40,30,150,20);
        buttonlogin.setForeground(Color.white);
        buttonlogin.setBackground(Color.blue);
        add(buttonlogin);

        buttonregistration = new JButton("Registration");
        buttonregistration.setBounds(40,60,150,20);
        buttonregistration.setForeground(Color.black);
        buttonregistration.setBackground(Color.yellow);
        add(buttonregistration);

        buttonsimpleintrest = new JButton("Simple Intrest");
        buttonsimpleintrest.setBounds(40,90,150,20);
        buttonsimpleintrest.setForeground(Color.black);
        buttonsimpleintrest.setBackground(Color.green);
        add(buttonsimpleintrest);

        buttonlogin.addActionListener(this);
        buttonregistration.addActionListener(this);
        buttonsimpleintrest.addActionListener(this);
        buttonexit.addActionListener(this);
        setLayout(null);
        setBackground(Color.blue);
        setSize(400,200);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //for login
        if (e.getSource() == buttonlogin){
            new PasswordShow().setVisible(true);
        }
        else if(e.getSource() == buttonregistration){
            new Registration().setVisible(true);
        }
        else if (e.getSource() == buttonsimpleintrest){
            new Intrest().setVisible(true);
        }
        else if(e.getSource() == buttonexit){
            dispose();
        }


    }

    public static void main(String[] args) {
        Menu menu = new Menu();
    }
}
