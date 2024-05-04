package gpaint;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class InfoPanel extends JPanel {
    private JLabel xy;

    public InfoPanel() {
        super();
        setOpaque(true);
        setBackground(Color.green);
        setPreferredSize(new Dimension(100, gpaint.gHeight - 20));
        this.setLayout(new FlowLayout());

        xy = new JLabel();
        xy.setPreferredSize(new Dimension(90, 30));
        xy.setOpaque(true);
        xy.setBackground(Color.red);
        this.add(xy);

    }

    public void setxy(String s) {
        xy.setText(s);
    }
}
