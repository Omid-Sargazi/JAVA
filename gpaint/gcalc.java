package gpaint;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class gcalc extends JFrame {

    private JPanel lbl = new JPanel();
    private JPanel btns = new JPanel();
    private JLabel text = new JLabel();
    private JLabel text00 = new JLabel();
    private final static int gWidth = 600;
    private final static int gheight = 500;

    private gButton btnDigits[] = new gButton[10];
    private gButton btnc = new gButton(this);
    private gButton btnSum = new gButton(this);
    private gButton btnEqual = new gButton(this);

    private long n1, n2;

    public void setNumberToText(String s) {
        int ii = Integer.parseInt(s);
        long num = Long.parseLong(text.getText());
        if (((int) Math.log10(num) + 1) < 19) {
            num = num * 10 + ii;
            text.setText(num + "");
        }
    }

    public gcalc() {
        super("Gcalc...");
        this.setBounds(100, 100, gWidth, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        text.setBackground(Color.white);
        text.setPreferredSize(new Dimension(gWidth - 20, 30));
        text.setText("0");
        text.setOpaque(true);

        text00.setBackground(Color.cyan);
        text00.setPreferredSize(new Dimension(gWidth - 20, 30));
        text00.setOpaque(true);
        text00.setText("0");

        //////////////////////////////// lbl
        lbl.setPreferredSize(new Dimension(gWidth - 10, 100));
        lbl.setBackground(Color.red);
        lbl.setLayout(new FlowLayout());
        lbl.add(text00);
        lbl.add(text);

        //////////////////////////////// btns////////////
        btns.setPreferredSize(new Dimension(150, 300));
        btns.setBackground(Color.gray);
        btns.setLayout(new FlowLayout());

        for (int i = 0; i < 10; i++) {
            btnDigits[i] = new gButton(this);
            btnDigits[i].setPreferredSize(new Dimension(45, 30));
            btnDigits[i].setText("" + i);
            final int ii = i;
            btnDigits[i].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    setNumberToText(ii + "");
                    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
                }

            });
            btns.add(btnDigits[i]);

        }

        btnc.setPreferredSize(new Dimension(45, 30));
        btnc.setText("C");
        btnc.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                text.setText("0");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }

        });

        btnSum.setPreferredSize(new Dimension(45, 30));
        btnSum.setText("+");
        btnSum.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                n1 = Long.parseLong(text.getText());
                text.setText("0");
                text00.setText(n1 + "" + "+");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }

        });
        btnEqual.setPreferredSize(new Dimension(45, 30));
        btnEqual.setText("=");
        btnEqual.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                n2 = Long.parseLong(text.getText());
                text00.setText(text00.getText() + n2 + "=");
                text.setText((n1 + n2) + "");
                n1 = n1 + n2;
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }

        });

        btns.add(btnc);
        btns.add(btnSum);
        btns.add(btnEqual);

        //////////////////////////////// end btns/////////

        this.add(lbl);
        this.add(btns);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Gcalc");
        new gcalc();
    }

}
