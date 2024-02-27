import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SimpleInterest {
    private JLabel p, t, r, result;
    private JTextField pf, tf, rf;
    private JButton b;

    public SimpleInterest() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        p = new JLabel("Enter Principal (Rs.):");
        pf = new JTextField();
        t = new JLabel("Enter Time(in year):");
        tf = new JTextField();
        r = new JLabel("Enter rate (%):");
        rf = new JTextField();
        b = new JButton("Calculate SI");
        result = new JLabel();

        p.setBounds(10, 10, 120,25 );
        pf.setBounds(150, 10, 100, 25);
        t.setBounds(10, 40, 150, 25);
        tf.setBounds(150, 40, 100, 25);
        r.setBounds(10, 70, 100, 25);
        rf.setBounds(150, 70, 100, 25);
        b.setBounds(10, 110, 120, 25);
        result.setBounds(150, 110, 400, 25);

        f.add(p);
        f.add(pf);
        f.add(t);
        f.add(tf);
        f.add(r);
        f.add(rf);
        f.add(b);
        f.add(result);

        b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                double prin = Double.parseDouble(pf.getText());
                double time = Double.parseDouble(tf.getText());
                double rate = Double.parseDouble(rf.getText());

                double SI = (prin * time * rate) / 100;
                result.setText("The simple interest is Rs." +' ' + SI);

            }
        });
        f.setLayout(null);
        f.setSize(450, 250);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new SimpleInterest();
    }
}
