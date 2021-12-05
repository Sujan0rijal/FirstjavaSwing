import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMI extends JFrame implements ActionListener {
    JLabel jl1,jl2,jl3;
    JTextField jt1,jt2;
    JButton jb;

    BMI(){
        jl1 = new JLabel("Mass of Person");
        jl1.setBounds(100,30,200,20);
        add(jl1);

        jt1 = new JTextField();
        jt1.setBounds(100,60,100,20);
        add(jt1);

        jl2 = new JLabel("Height of Person");
        jl2.setBounds(100,90,200,20);
        add(jl2);

        jt2 = new JTextField();
        jt2.setBounds(100,120,100,20);
        add(jt2);

        jl3 = new JLabel("Result");
        jl3.setBounds(100,150,200,20);
        add(jl3);

        jb = new JButton("BMI");
        jb.setBounds(100,180,100,20);
        add(jb);

        jb.addActionListener(this);
        setLayout(null);
        setSize(600,400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(jt1.getText());
        int b = Integer.parseInt(jt2.getText());
        int c = 0;
        if (e.getSource().equals(jb)){
            c = a/b;
            jl3.setText(String.valueOf(c));
        }
        else{
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        BMI bmi = new BMI();
    }
}
