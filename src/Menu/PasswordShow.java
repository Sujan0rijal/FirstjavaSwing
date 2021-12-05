package Menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PasswordShow extends JFrame implements ActionListener {
    JLabel labelUsername,labelpassword;
    JTextField textUsername;
    JPasswordField textPassword;
    JButton buttonLogin;
    JCheckBox checkPassword;

    public PasswordShow(){
        labelUsername = new JLabel("User name");
        labelUsername.setBounds(100,30,200,20);
        add(labelUsername);

        textUsername = new JTextField();
        textUsername.setBounds(100,60,150,20);
        add(textUsername);

        labelpassword = new JLabel("Password");
        labelpassword.setBounds(100,90,200,20);
        add(labelpassword);

        textPassword = new JPasswordField();
        textPassword.setBounds(100,120,150,20);
        add(textPassword);

        checkPassword = new JCheckBox("Show Password");
        checkPassword.setBounds(100,180,200,20);
        add(checkPassword);

        buttonLogin = new JButton("Log In");
        buttonLogin.setBounds(100,210,200,20);
        add(buttonLogin);

        buttonLogin.addActionListener(this);
        setLayout(null);
        setSize(600,400);
        setVisible(true);

        checkPassword.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED){
                    textPassword.setEchoChar((char) 0);
                }else{
                    textPassword.setEchoChar('X');
                }

            }
        });
    }


    public static void main(String[] args) {
        PasswordShow passwordShow = new PasswordShow();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        if (checkPassword.isSelected()){
//            textPassword.setEchoChar((char) 0);
//
//        }else{
//            textPassword.setEchoChar('X');
//        }
        String username = textUsername.getText();
        JOptionPane.showMessageDialog(null,"Logged in as " + username );
           dispose();
//        new Design().setVisible(true);

        //new HelloWorld

    }
}
