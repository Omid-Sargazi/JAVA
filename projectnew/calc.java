package projectnew;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComponent;
import javax.swing.border.TitledBorder;

public class calc extends JFrame {

    JComponent comp = new JLabel("Test Label");
    JComponent lbl1 = new JLabel("0");
    JButton b1 = new JButton("Login");
    JTextField tetx1 = new JTextField();
    JButton[] b = new JButton[10];

    public calc() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i <= 9; i++) {
            b[i] = new JButton(i + "");
        }

        // this.setLayout(null);
        this.setLayout(new FlowLayout());

        JPanel panel = new JPanel();// for keep some objects
        JPanel panel2 = new JPanel();// for keep some objects
        this.getContentPane().add(comp);
        this.getContentPane().add(b1);
        this.getContentPane().add(panel);
        comp.setBorder(new TitledBorder("Button by omid"));
        this.setBounds(110, 210, 400, 400);
        // comp.setBorder(new TitledBorder("Button"));
        // JFrame frame = new JFrame("JFrame Example");
        // JPanel panel = new JPanel();
        // panel.setLayout(new FlowLayout());
        // JLabel label = new JLabel("JFrame By Example");
        // JButton button = new JButton();
        // button.setText("Button");
        // panel.add(label);
        // panel.add(button);
        // frame.add(panel);
        // frame.setSize(200, 300);
        // frame.setLocationRelativeTo(null);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setVisible(true);
        // JButton button = new JButton();
        // button.setText("Button");
        // this.add(button);
        comp.setPreferredSize(new Dimension(130, 60));
        b1.setPreferredSize(new Dimension(130, 60));
        panel.setPreferredSize(new Dimension(500, 500));
        panel2.setPreferredSize(new Dimension(250, 250));
        lbl1.setPreferredSize(new Dimension(50, 50));
        lbl1.setOpaque(true);
        lbl1.setBackground(Color.white);
        tetx1.setPreferredSize(new Dimension(200, 100));
        panel.setBackground(Color.yellow);
        panel2.setBackground(Color.magenta);
        panel.add(b1);
        panel.add(tetx1);
        panel.add(lbl1);
        panel.add(panel2);
        for (int i = 0; i <= 9; i++) {
            panel2.add(b[i]);
        }
        panel2.add(b[0]);

        this.setSize(800, 800);
        // this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new calc();
    }
}
