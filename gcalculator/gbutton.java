package gcalculator;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;

public class gbutton extends JButton implements KeyListener {
    private Main frm;

    public gbutton(Main frm) {
        super();
        this.frm = frm;
        this.addKeyListener(this);

    }

    public static void main(String[] args) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        e.getSource
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }
}
