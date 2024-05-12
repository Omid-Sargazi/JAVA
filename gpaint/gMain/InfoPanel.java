package gpaint.gMain;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class InfoPanel extends JPanel {
    private JLabel infos[];

    public InfoPanel() {
        super();
        setOpaque(true);
        setBackground(Color.yellow);
        setPreferredSize(new Dimension(100, gMain.gHeight - 20));
        this.setLayout(new FlowLayout());

        infos = new JLabel[10];
        for (int i = 0; i < 10; i++) {
            infos[i] = new JLabel();
            infos[i].setPreferredSize(new Dimension(95, 30));
            infos[i].setOpaque(true);
            infos[i].setBackground(Color.red);
            this.add(infos[i]);
        }

    }

    public void setInfo(String s, int i) {
        infos[i].setText(s);
    }

}
