package projectnew;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class simplejframe {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simplest Swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setSize(400, 400);
        // frame.setLocation(1500, 1500);
        frame.setBounds(400, 400, 500, 500);
        frame.setVisible(true);
    }
}
