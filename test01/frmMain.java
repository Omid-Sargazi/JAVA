package test01;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JFrame;

public class frmMain extends JFrame implements MouseListener, MouseMotionListener {

    public frmMain() {
        super();
        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(400, 400));
        this.setLocation(1000, 1000);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new frmMain();
    }/// end of main
}// end of class frmMain
