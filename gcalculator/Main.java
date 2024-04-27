package gcalculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame {
    private JPanel lbl;
    private JPanel btns;
    private final static int gWidth = 600;
    private final static int gHeight = 500;
    private gbutton btnDigits[];
    private gbutton btnC;
    private gbutton btnSum;
    private gbutton btnEquals;
    private int n1, n2;

    private JLabel txt;
    private JLabel txt00;

    public Main() {
        super("Main");
        this.setBounds(100, 100, gWidth, gHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        ////////////////////////// lbl
        lbl = new JPanel();
        lbl.setPreferredSize(new Dimension(gWidth - 10, 100));
        lbl.setBackground(Color.red);
        txt = new JLabel();
        txt.setBackground(Color.white);
        txt.setPreferredSize(new Dimension(gWidth - 20, 35));
        txt.setOpaque(true);
        txt.setText("0");
        txt00 = new JLabel();
        txt00.setBackground(Color.red);
        txt00.setPreferredSize(new Dimension(gWidth - 20, 45));
        txt00.setOpaque(true);
        txt00.setText("0");
        lbl.add(txt00);
        lbl.add(txt);

        //////////////////////// btn
        btns = new JPanel();
        btns.setPreferredSize(new Dimension(150, 300));
        btns.setBackground(Color.lightGray);
        btns.setLayout(new FlowLayout());
        btnDigits = new gbutton[10];
        for (int i = 0; i < 10; i++) {
            btnDigits[i] = new gbutton();
            btnDigits[i].setPreferredSize(new Dimension(45, 30));
            btnDigits[i].setFont(new Font("tahoma", 1, 10));
            btnDigits[i].setText(i + "");
            final int ii = i;
            btnDigits[i].addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    int num = Integer.parseInt(txt.getText());
                    if (((int) Math.log10(num) + 1) < 19) {
                        num = num * 10 + ii;
                        txt.setText(num + "");
                    }
                    throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
                }

            });
            btns.add(btnDigits[i]);
        }

        btnC = new gbutton();
        btnC.setPreferredSize(new Dimension(45, 30));
        btnC.setFont(new Font("tahome", 1, 10));
        btnC.setText("C");
        btns.add(btnC);

        btnSum = new gbutton();
        btnSum.setPreferredSize(new Dimension(45, 30));
        btnSum.setFont(new Font("tahoma", 1, 10));
        btnSum.setText("+");
        btns.add(btnSum);
        btnSum.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                n1 = Integer.parseInt(txt.getText());
                txt.setText("0");
                txt00.setText(n1 + "+");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }

        });
        btnEquals = new gbutton();
        btnEquals.setPreferredSize(new Dimension(45, 30));
        btnEquals.setFont(new Font("tahoma", 1, 10));
        btnEquals.setText("=");
        btns.add(btnEquals);
        btnEquals.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                n2 = Integer.parseInt(txt.getText());
                txt00.setText(txt00.getText() + n2 + "=");
                txt.setText(n1 + n2 + "");
                n1 = n1 + n2;
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }

        });

        btnC.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                txt.setText("0");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }

        });

        ///////////////////////////////////

        this.add(lbl);
        this.add(btns);
        // this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {
        System.out.println("Hello world");
        new Main();
    }// end of main
}// end of class
