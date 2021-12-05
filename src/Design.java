
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Design extends JFrame implements ActionListener {

    JTextField jt1,jt2;
    JLabel lbl;
    JButton jb;

    Design(){
        jt1 = new JTextField();
        jt1.setBounds(100,40,100,20);
        jt1.setForeground(Color.black);
        jt1.setBackground(Color.yellow);
        add(jt1);

        jt2 = new JTextField();
        jt2.setBounds(100,70,100,20);
        jt2.setForeground(Color.black);
        jt2.setBackground(Color.yellow);
        add(jt2);

        lbl = new JLabel("Result :");
        lbl.setBounds(100,120,100,20);
        lbl.setForeground(Color.blue);
        lbl.setBackground(Color.yellow);
        add(lbl);

        jb = new JButton(" - ");
        jb.setBounds(100,160,100,20);
        jb.setForeground(Color.black);
        jb.setBackground(Color.blue);
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
            c = a - b;
            lbl.setText(String.valueOf(c));

        }
        else {
            System.out.println("Error");
        }
    }
    public static void main(String args[]) {
        Design design = new Design();

    }
}


