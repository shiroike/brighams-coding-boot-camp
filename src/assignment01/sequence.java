package assignment01;
/**
 * 
 * The main method in this class shows three circles of different colors and sizes to the screen
        
 * @author yujiharashima
 */
import java.awt.*;
import java.applet.Applet;
 
    public class sequence extends Applet
    {
       
        public void paint (Graphics g)
        {
            g.setColor(Color.red);
            g.drawLine(75,60, 350,95);
            g.setColor(Color.blue);
            g.drawOval(80,190,50,50);
            g.setColor(Color.green);
            g.drawRect(300,215,100,100);
            g.setColor(Color.yellow);
            g.fillOval(200, 200, 100, 100);
            g.setColor(Color.blue);
            g.fillRect(400, 400, 100, 100);
            g.setColor(Color.pink);
            g.fillArc(170, 520, 100, 100, 270, 300);
            g.fillOval(400, 400, 200, 200);
            g.drawOval(200, 200, 200, 200);
            g.drawOval(200, 400, 200, 200);
            g.drawOval(400, 200, 200, 200);
            g.fillArc(500, 150, 100, 100, 90, 300);
            g.fillArc(170, 170, 100, 100, 180, 300);
            
        }
    }