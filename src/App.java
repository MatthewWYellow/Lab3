import javax.swing.*;
import java.awt.*;

public class App extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        super.paintComponent(g2d);
        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(2, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        int offset = 40;
        int offsetx = offset;
        int offsety = offset;
        for (int c = 0; c < 11; c++){
            g2d.drawLine(offsetx, offsety, offsetx, offsety + 320);
            offsetx += 32;
        }
        offsetx = offset;
        for (int r = 0; r < 11; r++){
            g2d.drawLine(offsetx, offsety, offsetx + 320, offsety);
            offsety += 32;
        }
        //g.setColor(Color.BLUE);
        //g.fillRect(50, 50, 200, 100);
        //g.setColor(Color.RED);
        //g.drawString("Hello, World!", 100, 100);

    }

    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame("My Application");

        frame.add(new App());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640, 480);
        frame.setVisible(true);
    }
}
