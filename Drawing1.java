/*Melissa Guzman
 * ITC 155
 * Assignment 1
 * April 21, 2020
 */
import java.awt.*;

public class Drawing1 {
	public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(220, 150);
        // window fill yellow
        panel.setBackground(Color.yellow);
        
        //set graphic in the window
        Graphics g = panel.getGraphics();
        
        //draw and fill ovals
        g.setColor(Color.blue);
        g.fillOval(50, 25, 40, 40);
        
        
        g.setColor(Color.blue);
        g.fillOval(130, 25, 40, 40);


        // draw and fill rectangle
        g.setColor(Color.red);
        g.fillRect(70, 42, 80, 84);
        
        //draw black horizontal line
        g.setColor(Color.black);
        g.drawLine(70, 84, 150, 84);
    }
}
