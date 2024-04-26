package projectnew;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class gmaincalc extends JFrame implements KeyListener {
    private int gWidth = 600;
    private int gHeight = 600;
    private JButton b1 = new JButton();
    private JButton b2 = new JButton();
    private JTextField txt = new JTextField();

    public gmaincalc() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200, 100, gHeight, gWidth);
        this.setLayout(new FlowLayout());
        this.addKeyListener(this);

        b1.setPreferredSize(new Dimension(45, 30));
        b2.setPreferredSize(new Dimension(45, 30));
        b2.setFont(new Font("tahoma", 1, 10));
        b1.setFont(new Font("tahoma", 1, 10));
        b1.setText("1");
        b2.setText("2");
        b1.setFocusable(true);
        b2.setFocusable(true);

        txt.setPreferredSize(new Dimension(250, 30));

        this.setFocusable(true);

        b1.addKeyListener(this);
        b2.addKeyListener(this);
        txt.addKeyListener(new KeyListener() {

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                if (e.getKeyChar() < 0 || e.getKeyChar() > 9)
                    e.setKeyChar('\0');
                throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
            }

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
                if (e.getKeyChar() < 0 || e.getKeyChar() > 9)
                    e.setKeyChar('\0');
                throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
            }

        });

        this.add(b1);
        this.add(b2);
        this.add(txt);

        this.setVisible(true);

    }

    public static void main(String[] args) {
        System.out.println("Test...");
        new gmaincalc();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        this.setTitle(this.getTitle() + " P" + e.getKeyChar());
        this.setTitle(" " + e.getKeyChar());
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        this.setTitle(this.getTitle() + " R" + e.getKeyChar());
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        this.setTitle(this.getTitle() + " T" + e.getKeyChar());
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }
}
