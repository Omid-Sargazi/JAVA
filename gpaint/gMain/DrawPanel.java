package gpaint.gMain;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JComponent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;

public class DrawPanel extends JComponent {

    public DrawPanel() {
        super();
        // setOpaque(true);
        // setBackground(Color.black);
        setPreferredSize(new Dimension(gMain.gWidth - 120, gMain.gHeight - 20));
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawRect(1, 1, getWidth() - 2, getHeight() - 2);

    } // DrawPanel
}
