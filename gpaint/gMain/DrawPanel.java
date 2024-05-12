package gpaint.gMain;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JComponent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;

public class DrawPanel extends JComponent implements MouseListener, MouseMotionListener {

    private InfoPanel info;
    private gLine lines[] = new gLine[100];
    private int cLines = 0;
    private int x1, y1;

    public DrawPanel(InfoPanel info) {
        super();
        // setOpaque(true);
        // setBackground(Color.black);
        setPreferredSize(new Dimension(gMain.gWidth - 120, gMain.gHeight - 20));
        this.info = info;
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        initialize(g);
        g.setColor(Color.red);
        g.drawLine(100, 100, 200, 200);
        // g.setColor(Color.green);
        // g.fillRect(1, 1, getWidth() - 2, getHeight() - 2);
        for (int i = 0; i < cLines; i++) {
            g.setColor(Color.red);
            g.drawLine(lines[i].x1, lines[i].y1, lines[i].x2, lines[i].y2);
        }
    } // DrawPanel

    private void initialize(Graphics g) {
        g.setColor(new Color(0, 0, 0));
        g.fillRect(1, 1, getWidth() - 2, getHeight() - 2);
        g.setColor(Color.red);
        g.drawRect(1, 1, getWidth() - 2, getHeight() - 2);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        info.setInfo("(" + e.getX() + "," + e.getY() + ")", 1);
        x1 = e.getX();
        y1 = e.getY();
        throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        info.setInfo("(" + e.getX() + "," + e.getY() + ")", 2);
        gLine a = new gLine();
        a.x1 = x1;
        a.y1 = y1;
        a.x2 = e.getX();
        a.y2 = e.getY();
        lines[cLines++] = a;
        this.repaint();
        throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        info.setInfo("(" + e.getX() + "," + e.getY() + ")", 0);
        throw new UnsupportedOperationException("Unimplemented method 'mouseDragged'");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub
        info.setInfo("(" + e.getX() + "," + e.getY() + ")", 1);
        throw new UnsupportedOperationException("Unimplemented method 'mouseMoved'");
    }
}
