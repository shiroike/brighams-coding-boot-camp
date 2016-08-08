package assignment01;

/**
 *
 * @author yujiharashima
 */
import java.awt.*;
import java.applet.Applet;
 
    public class sequence3 extends Applet
    {
       
        public void paint (Graphics g)       
        {
            g.setColor(Color.red);
            g.clearRect(50, 50, 30, 30);
            g.draw3DRect(10, 10, 60, 30, false);
            g.fillOval(50, 50, 30, 30);
            g.setColor(Color.blue);
            g.drawLine(50, 50, 100, 100);
            g.drawOval(50, 50, 50, 50);
            g.drawString(Hello, 50, 50);
            
            
            
            
        }
    }

