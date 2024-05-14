package gMain;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class gMain extends JFrame {
    public static final int gWIdth = 700;
    public static final int gHeight = 600;

    private ToolBox toolBox;
    private DrawPanel draw;
    private InfoPanel info;

    public gMain() {
        super();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, gWIdth, gHeight);
        this.setTitle("gMain");
        this.setLayout(new FlowLayout());

        /////////////////////////// tools
        toolBox = new ToolBox();
        info = new InfoPanel();
        draw = new DrawPanel(info);

        this.add(toolBox);
        this.add(draw);
        this.add(info);
        setVisible(true);
    }

    public static void main(String[] args) {
        new gMain();
    }
}
