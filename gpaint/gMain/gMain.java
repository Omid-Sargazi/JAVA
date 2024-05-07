package gpaint.gMain;

import javax.swing.JFrame;
import java.awt.FlowLayout;

public class gMain extends JFrame {

    public static final int gWidth = 700;
    public static final int gHeight = 700;

    private ToolBox tools;
    private DrawPanel draw;
    private InfoPanel info;

    public gMain() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 200, gWidth, gHeight);
        this.setTitle("GMain");
        this.setLayout(new FlowLayout());
        ////////////////////////////////////////////////////////////////////////
        tools = new ToolBox();
        draw = new DrawPanel();
        info = new InfoPanel();

        ///////////////////////////////////////////////

        this.add(tools);
        this.add(draw);
        this.add(info);
        setVisible(true);
    }

    public static void main(String[] args) {
        System.err.println("gMain");
        new gMain();
    }
}
