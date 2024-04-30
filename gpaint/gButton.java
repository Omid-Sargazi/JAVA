package gpaint;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class gButton extends JButton implements KeyListener {
    private gcalc frm;

    public gButton(gcalc frm) {
        super();
        this.frm = frm;
        this.addKeyListener(this);

    }

    public static void main(String[] e) {
        System.out.println("GButton");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        // if (e.getKeyChar() >= 0 && e.getKeyChar() <= 9) {

        // }
        frm.setNumberToText(e.getKeyChar() + "");
        throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

}
