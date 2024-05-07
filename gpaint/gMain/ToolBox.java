package gpaint.gMain;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

public class ToolBox extends JPanel {

    public ToolBox() {
        super();
        setOpaque(true);
        setBackground(Color.green);
        setPreferredSize(new Dimension(100, gMain.gHeight - 20));
    }
}
