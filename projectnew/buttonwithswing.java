package projectnew;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class buttonwithswing extends JFrame {

    JComponent comp = new JLabel("Test label");
    JButton b1 = new JButton("Login");
    JButton b2 = new JButton("Panel add");
    JPanel panel = new JPanel();
    JTextField txt = new JTextField("enter a text");
    JButton b3[] = new JButton[10];
    JPanel panel2 = new JPanel();

    public buttonwithswing() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i <= 9; i++) {
            b3[i] = new JButton(i + "");
        }

        this.setLayout(new FlowLayout());
        panel.setLayout(new FlowLayout());
        this.setBounds(100, 200, 700, 700);

        // b1.setBounds(50, 50, 20, 100);
        comp.setBorder(new TitledBorder("Calculator"));
        comp.setPreferredSize(new Dimension(300, 300));
        b1.setPreferredSize(new Dimension(140, 30));
        panel.setPreferredSize(new Dimension(300, 400));
        panel2.setPreferredSize(new Dimension(200, 200));
        txt.setPreferredSize(new Dimension(140, 30));
        txt.setBackground(Color.white);
        panel.setBackground(Color.gray);
        panel2.setBackground(Color.MAGENTA);

        this.getContentPane().add(panel);
        panel.add(b2);
        panel.add(txt);
        panel.add(panel2);
        for (int i = 0; i <= 9; i++) {
            panel2.add(b3[i]);
        }
        this.getContentPane().add(comp);
        this.getContentPane().add(b1);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new buttonwithswing();
    }
}
