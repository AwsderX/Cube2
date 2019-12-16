import javax.swing.*;
import java.awt.*;

public class Viewer extends JFrame {
    private Cube cube;

    public Viewer(int width, int height, Cube cube){
        this.setSize(width, height);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Куб");
        this.cube = cube;
    }

    public void paint(Graphics g){
        Graphics2D g2d= (Graphics2D) g;
        g.setColor(new Color(0,0,0));
        g.clearRect(0,0, getWidth(), getHeight());
        g.translate(getWidth()/2, getHeight()/2);
        g.drawLine(0,-getHeight(),0,getHeight());
        g.drawLine(-getWidth(),0,getWidth(),0);
        cube.draw(g2d);
    }
}