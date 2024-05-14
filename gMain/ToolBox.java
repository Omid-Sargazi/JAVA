package gMain;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class ToolBox extends JPanel {

    public ToolBox() {
        super();
        setOpaque(true);
        setBackground(Color.green);
        setPreferredSize(new Dimension(100, gMain.gHeight - 20));
    }

}
