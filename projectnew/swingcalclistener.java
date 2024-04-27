package projectnew;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class swingcalclistener extends JFrame implements KeyListener {

    JFrame frame = new JFrame("Test");
    private JButton b1 = new JButton("1");
    private JButton b2 = new JButton("2");
    JPanel panel = new JPanel();

    public swingcalclistener() {
        super("Test");
        panel.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(110, 110, 700, 700);
        this.addKeyListener(this);
        panel.setPreferredSize(new Dimension(300, 400));
        panel.setBackground(Color.gray);

        b1.setPreferredSize(new Dimension(140, 140));
        b1.setText("1");
        b2.setPreferredSize(new Dimension(140, 140));
        b2.setText("2");
        this.getContentPane().add(panel);

        this.add(b1);
        this.add(b2);

        this.setVisible(true);

    }

    public static void main(String[] args) {
        new swingcalclistener();
        System.out.println("Hello");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        this.setTitle(this.getTitle() + "P" + e.getKeyCode());
        if (e.getKeyChar() == KeyEvent.VK_1) {

            System.out.println("97");
            this.setTitle("Color.red");
        }
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        this.setTitle(this.getTitle() + "R:" + e.getKeyChar());
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        this.setTitle(this.getTitle() + "T" + e.getKeyChar());
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }
}
