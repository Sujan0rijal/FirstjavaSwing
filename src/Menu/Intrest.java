package Menu;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Intrest extends JFrame implements ActionListener {
    JTextField textprincipal,textrate,texttime;
    JLabel principal,rate,time;
    JButton buttonSimple;

    Intrest() {
        principal = new JLabel("Principal");
        principal.setBounds(100,30,100,20);
        add(principal);

        textprincipal = new JTextField();
        textprincipal.setBounds(100,60,100,20);
        add(textprincipal);

        rate = new JLabel("Rate");
        rate.setBounds(100,90,100,20);
        add(rate);

        textrate = new JTextField();
        textrate.setBounds(100,120,100,20);
        add(textrate);

        time = new JLabel("Time");
        time.setBounds(100,150,100,20);
        add(time);

        texttime = new JTextField();
        texttime.setBounds(100,180,100,20);
        add(texttime);

        buttonSimple = new JButton("Simple Menu.Intrest is: ");
        buttonSimple.setBounds(100,240,200,20);
        add(buttonSimple);

        buttonSimple.addActionListener(this);

        setLayout(null);
        setSize(600,400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(textprincipal.getText());
        int b = Integer.parseInt(textrate.getText());
        int c = Integer.parseInt(texttime.getText());
        int d = 0;

        if (e.getSource().equals(buttonSimple)){
            d = a * b * c /100;
            Integer result = d;
            JOptionPane.showMessageDialog(null,"Simple Menu.Intrest is  " + d );
            dispose();
        }
        else{
            System.out.println("Error");
        }

    }
    public static void main(String args[]){
        Intrest intrest = new Intrest();
    }

}
