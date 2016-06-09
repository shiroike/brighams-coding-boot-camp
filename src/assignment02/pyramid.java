
package assignment02;

import javax.swing.JOptionPane;
import javax.swing.JApplet;
import java.awt.Graphics;
import java.awt.Color;

/**
 *
 * @author yujiharashima
 */
public class pyramid {



// is a is synonymous with extends
// has a is synonymous with implements

// Pyramid is a child of parent JApplet
// Pyramid derives its class from JApplet

public class Pyramid extends JApplet{
  int x;
  int y;
  int newSize;
 
// starting point of japplet
  public void init()  {
String x_pos = JOptionPane.showInputDialog(this, "X Position?");
// convert String to Integer and store in x
    x = Integer.parseInt(x_pos);
    y = Integer.parseInt(JOptionPane.showInputDialog(this, "Y Position?"));
    newSize = Integer.parseInt(JOptionPane.showInputDialog(this, "Size? (1-50)"));
  }
 
// paint gets called after init method is done
  public void paint(Graphics g)  {
    super.paint(g);
    
    // Draw First Pyramid (recommend that drawing start at top of pyramid)
    // Remember to look up drawline() method in the book for usage. I removed the parameters in the code below for you to implement.
    //top
    
    g.drawLine(x, y, x + newSize, y+newSize);
    g.drawLine(x, y, x - newSize, y+(newSize/2));
    g.drawLine(x, y, x + (newSize *2), y+(newSize/2));

    //bottom
    g.drawLine();
    g.drawLine();
    
    //middle
    
    
    //Second Pyramid
    x += //sliding the pyramid over slightly
    y += //sliding the pyramid over slightly
    
    newSize = newSize * 0.75;    //shrinking it 25%
    
    //top
    g.drawLine();
    g.drawLine();
    
    //bottom
    g.drawLine();
    g.drawLine();
    
    //middle
    g.drawLine();    
    
    //Third Pyramid
    x += //sliding the pyramid over slightly
    y += //sliding the pyramid over slightly
    
    newSize =     //shrinking it 25%
    

    //top
    //top
    g.drawLine();
    g.drawLine();
    
    //bottom
    g.drawLine();
    g.drawLine();
    
    //middle
    g.drawLine();    
  } 
}
 

}
