import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.image.BufferedImage;

public class RadarGUI extends JComponent implements ActionListener {
    Timer timer;
    private double angle = 0;
    private double scale = 1;
    private double delta = 0.01;

    public RadarGUI() {
        timer = new Timer(10, this);
        timer.start();
        setPreferredSize(new Dimension(800, 800));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_SPEED);

        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, 1280, 1000);

        g2d.setColor(new Color(29, 194, 255));
        g2d.drawOval(0, 0, 800, 800);

        g2d.drawOval(100, 100, 600, 600);
        g2d.drawOval(200, 200, 400, 400);
        g2d.drawOval(300, 300, 200, 200);
        g2d.drawOval(400, 400, 1, 1);

        g2d.drawLine(0, 400, 800, 400);
        g2d.drawLine(400, 0, 400, 800);

        for (int i=0; i<Utils.BASES.size(); i++){
            g2d.setColor(new Color(255, 0, 0));
            //g2d.drawRect(Utils.BASES.get(i).abcisse, Utils.BASES.get(i).ordonne, 5, 5);
            g2d.fillRect(Utils.BASES.get(i).abcisse, Utils.BASES.get(i).ordonne, 5, 5);
            //add(new Label());
            g2d.setColor(new Color(161, 255, 88));
            g.drawString(Utils.BASES.get(i).identifiant, Utils.BASES.get(i).abcisse, Utils.BASES.get(i).ordonne);
        }
        g2d.setColor(new Color(29, 194, 255));
        Line2D aiguille = new Line2D.Double(400, 400, 400, 0);

        BufferedImage img = new BufferedImage(1,1, 20); //generateGlow(width, height, 20, Color.YELLOW, 1f);
        g2d.drawImage(img, 400, 400, this);
        g2d.setColor(Color.WHITE);
        //g2d.fillRect(x, y, width, height);
        //g2d.draw(aiguille);


        g2d.rotate(angle, 400, 400);

        //g2d.fill(aiguille);
        g2d.draw(aiguille);

    }

    public static BufferedImage generateGlow(int width, int height, int size, Color glow, float alpha) {
        BufferedImage source = createCompatibleImage(width, height);
        Graphics2D g2d = source.createGraphics();
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);
        g2d.dispose();
        return generateGlow(source, size, glow, alpha);
    }



    public void rotateAiguille(int x1, int y1) {
        AffineTransform.getRotateInstance(
                Math.toRadians(30), x1, y1);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        angle += 0.01;

        repaint();
    }
}