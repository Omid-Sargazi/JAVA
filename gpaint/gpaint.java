package gpaint;

import java.awt.*;
import javax.swing.*;

import test01.JFram;

public class gpaint extends JFrame {
    public static final int gWidth = 800;
    public static final int gHeight = 500;

    private toolBox tools;
    private InfoPanel info;
    private DrawPanel draw;

    public gpaint() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, gWidth, gHeight);
        this.setTitle("gPaint");
        this.setLayout(new FlowLayout());

        ////////////////////////// TOOLS...
        tools = new toolBox();
        info = new InfoPanel();
        draw = new DrawPanel(info);

        this.add(tools);
        this.add(draw);
        this.add(info);
        setVisible(true);
    }

    public static void main(String[] args) {
        new gpaint();

    }

}
