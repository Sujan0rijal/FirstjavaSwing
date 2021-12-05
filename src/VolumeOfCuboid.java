import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VolumeOfCuboid extends JFrame implements ActionListener {
    JTextField jt;
    JLabel jl,jl1;
    JButton jb;

    VolumeOfCuboid(){
        jl = new JLabel("Length");
        jl.setBounds(100,30,100,20);
        add(jl);

        jt = new JTextField();
        jt.setBounds(100,60,100,20);
        add(jt);

        jl1 = new JLabel("Length");
        jl1.setBounds(100,90,100,20);
        add(jl1);

        jb = new JButton("Volume of Cuboid :");
        jb.setBounds(100,120,100,20);
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
            b = a*a*a;
            jl1.setText(String.valueOf(b));
        }
        else{
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        VolumeOfCuboid volumeOfCuboid = new VolumeOfCuboid();
    }
}
