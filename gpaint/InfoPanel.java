package gpaint;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class InfoPanel extends JPanel {
    public InfoPanel() {
        super();
        setOpaque(true);
        setBackground(Color.green);
        setPreferredSize(new Dimension(100, gpaint.gHeight - 20));

    }
}
