package gMain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JLabel;

public class InfoPanel extends JPanel {

    private JLabel infos[];

    public InfoPanel() {
        super();
        setOpaque(true);
        setBackground(Color.blue);
        setPreferredSize(new Dimension(150, gMain.gHeight - 20));
        this.setLayout(new FlowLayout());

        infos = new JLabel[10];
        for (int i = 0; i < 10; i++) {
            infos[i] = new JLabel();
            infos[i].setPreferredSize(new Dimension(120, 30));
            infos[i].setOpaque(true);
            infos[i].setBackground(Color.red);
            this.add(infos[i]);
        }
    }

    public void setXY(String s, int i) {
        infos[i].setText(s);
        // System.out.println("" + "Omid");
    }

}
