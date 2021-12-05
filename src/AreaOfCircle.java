import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AreaOfCircle extends JFrame implements ActionListener {
    JLabel jl1,jl2;
    JTextField jt;
    JButton jb;

    AreaOfCircle(){
        jl1 = new JLabel("Radius");
        jl1.setBounds(100,30,100,20);
        add(jl1);

        jt = new JTextField();
        jt.setBounds(100,60,100,20);
        add(jt);

        jl2 = new JLabel("Result ");
        jl2.setBounds(100,90,100,20);
        add(jl2);

        jb = new JButton("Area of Circle is :");
        jb.setBounds(100,120,200,20);
        add(jb);

        jb.addActionListener(this);

        setLayout(null);
        setSize(600,400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(jt.getText());
        int b = 0;
        if (e.getSource().equals(jb)){
            b = 22*a*a / 7;
            jl2.setText(String.valueOf(b));
        }
        else{
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        AreaOfCircle areaOfCircle = new AreaOfCircle();
    }
}
