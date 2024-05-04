
package gpaint;

import javax.swing.JPanel;
import java.awt.*;

public class toolBox extends JPanel {

    public toolBox() {
        super();
        setOpaque(true);
        setBackground(Color.blue);
        setPreferredSize(new Dimension(100, gpaint.gHeight - 20));
    }

    public static void main(String[] args) {
        System.out.println("Heloo");
    }
}