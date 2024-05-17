package gMain;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ToolBox extends JPanel {
    JButton btns[] = new JButton[100];
    private DrawPanel draw;

    public ToolBox(DrawPanel draw) {
        super();
        this.draw = draw;
        setOpaque(true);
        setBackground(Color.green);
        setPreferredSize(new Dimension(100, gMain.gHeight - 20));
        this.setLayout(new FlowLayout());
        for (int i = 0; i < 10; i++) {
            btns[i] = new JButton();
            btns[i].setPreferredSize(new Dimension(90, 30));
            btns[i].setFont(new Font("table-layout", 1, 9));
            btns[i].setOpaque(true);
            btns[i].setBackground(Color.yellow);
            this.add(btns[i]);
        }
        btns[0].setText("Clear");
        btns[0].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                draw.clear();
            }
        });
        btns[1].setText("UndoClear");
        btns[1].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                draw.Undo();
            }

        });

        btns[2].setText("ClearLast");
        btns[2].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                draw.clearLast();
            }

        });

        btns[3].setText("UndoLast");
        btns[3].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                draw.UndoLast();
            }

        });

        btns[4].setText("Line");
        btns[4].addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                draw.setTools(1);
            }

        });
    }

}
