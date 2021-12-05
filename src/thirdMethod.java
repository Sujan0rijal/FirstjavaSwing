import javax.swing.*;
import java.awt.*;

public class thirdMethod  extends JFrame {
    JLabel labelHello;
    JLabel labelBye;
    public thirdMethod(){
        setTitle("Sujan Rijal");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(400,190,800,600);
        setResizable(false);

        //for welcome
        labelHello = new JLabel("Hello World");
        labelHello.setForeground(Color.black);
        labelHello.setFont(new Font("Arial",Font.BOLD,20));
        labelHello.setBounds(10,0,100,27);
        add(labelHello);

        //for Bye
        labelBye = new JLabel("Bye World");
        labelBye.setForeground(Color.black);
        labelBye.setFont(new Font("Arial",Font.BOLD,20));
        labelBye.setBounds(0,100,100,27);
        add(labelBye);

    }
    public static void main(String[] args){
        new thirdMethod().setVisible(true);
    }
}
