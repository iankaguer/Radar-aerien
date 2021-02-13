import org.w3c.dom.css.RGBColor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Main extends JFrame {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            public void run() {
                JFrame fenetre = new JFrame("Radar Aerien");
                fenetre.add(new RadarGUI());
                fenetre.pack();
                fenetre.setSize(1280, 1000);
                fenetre.setBackground(Color.black);
                fenetre.setResizable(false);
                fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                fenetre.setVisible(true);
            }
        };
        runnable.run();

    }


}
