package gpaint;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JComponent;

public class DrawPanel extends JComponent {
    public DrawPanel() {
        super();
        setOpaque(true);
        setBackground(Color.black);
        setPreferredSize(new Dimension(gpaint.gWidth - 220, gpaint.gHeight - 20));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.red);
        g.drawRect(1, 1, getWidth() - 2, getHeight() - 2);
    }

}
