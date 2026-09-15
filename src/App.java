import javax.swing.*;
import java.awt.*;

public class App extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        int offsetx = 80;
        int offsety = 80;
        for (int c = 0; c < 10; c++){
            g.drawLine(offsetx, offsety, offsetx, offsety + );
            offsetx += 20;
            offsety += 20;
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
