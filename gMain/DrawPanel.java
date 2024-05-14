package gMain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JPanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;

public class DrawPanel extends JComponent implements MouseMotionListener, MouseListener {
    private InfoPanel info;
    private gLine lines[] = new gLine[100];
    private int cLine = 0;
    private int x1, y1;

    public DrawPanel(InfoPanel info) {
        super();
        // setOpaque(true);
        // setBackground(Color.black);
        this.info = info;
        setPreferredSize(new Dimension(gMain.gWIdth - 120, gMain.gHeight - 20));
        this.addMouseMotionListener(this);
        this.addMouseListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        gInitialize(g);

        for (int i = 0; i < cLine; i++) {
            g.setColor(lines[i].color);
            g.drawLine(lines[i].x1, lines[i].x2, lines[i].y1, lines[i].y2);
        }

    }

    private void gInitialize(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, gMain.gWIdth - 120, gMain.gHeight - 20);
        g.setColor(Color.red);
        g.drawRect(1, 1, getWidth() - 2, getHeight() - 2);

        g.drawLine(100, 100, 200, 200);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        info.setXY("(x,y):(" + e.getX() + "," + e.getY() + ")", 0); // Update the first label
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        info.setXY(" (x,y):(" + e.getX() + "," + e.getY() + ")", 0); // Update the second
        // label

    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        info.setXY(" (x1,y1):(" + e.getX() + "," + e.getY() + ")", 1); // Update the second
        x1 = e.getX();
        y1 = e.getY();

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        info.setXY(" (x2,y2):(" + e.getX() + "," + e.getY() + ")", 2); // Update the second
        gLine line = new gLine();
        line.x1 = x1;
        line.y1 = y1;
        line.x2 = e.getX();
        line.y2 = e.getY();
        line.color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
        lines[cLine++] = line;
        this.repaint();
    }
}
