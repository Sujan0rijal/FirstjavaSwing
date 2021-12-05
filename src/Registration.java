import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Registration extends JFrame implements ActionListener {
    JLabel F_name,L_name,Email,Address;
    JTextField textF_name,textL_name,textEmail,textAddress;
    JButton buttonRegister;

    Registration(){
        F_name = new JLabel("First Name");
        F_name.setBounds(100,30,150,20);
        add(F_name);

        textF_name = new JTextField();
        textF_name.setBounds(100,60,150,20);
        add(textF_name);

        L_name = new JLabel("Last Name");
        L_name.setBounds(100,90,150,20);
        add(L_name);

        textL_name = new JTextField();
        textL_name.setBounds(100,120,150,20);
        add(textL_name);

        Email = new JLabel("Email");
        Email.setBounds(100,150,150,20);
        add(Email);

        textEmail = new JTextField();
        textEmail.setBounds(100,180,150,20);
        add(textEmail);

        Address = new JLabel("Address");
        Address.setBounds(100,210,150,20);
        add(Address);

        textAddress = new JTextField();
        textAddress.setBounds(100,240,150,20);
        add(textAddress);

        buttonRegister = new JButton("Register");
        buttonRegister.setBounds(100,270,150,20);
        add(buttonRegister);

        buttonRegister.addActionListener(this);
        setLayout(null);
        setSize(600,400);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String Firstname = textF_name.getText();
        String lastname = textL_name.getText();
        String Email = textEmail.getText();
        String Address = textAddress.getText();
        JOptionPane.showMessageDialog(null,"Registered Successfully " + Firstname  + lastname  +
                Email  + Address );
        dispose();

    }

    public static void main(String[] args) {
        Registration registration = new Registration();
    }
}
