package gpaint.gMain;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class InfoPanel extends JPanel {

    public InfoPanel() {
        super();
        setOpaque(true);
        setBackground(Color.yellow);
        setPreferredSize(new Dimension(100, gMain.gHeight - 20));
    }

}
