package assignment01;

/**
 *
 * @author yujiharashima
 */
import java.util.Scanner;
 
public class hypotenuse {
 
    public static void main(String[] args)
    {
        // use the scanner class to request user input. Be sure to accept double values in case user enters numbers with decimals!
        Scanner keyboard = new Scanner(System.in);
        double side1, side2, hypotenuse;
       
        // scanner class is found textbook pg.129
        System.out.print( "Enter side A: " );
        side1 = keyboard.nextDouble();
        System.out.println( "Side A: "+ side1 );
        
        System.out.print( "Enter side B:" );
        side2 = keyboard.nextDouble();
        System.out.println( "Side B: " + side2 );
        
        /*Math class is found textbook pg.140
          Also the equation is found below
                http://javauk.blogspot.com/2013/07/java-hypotenuse-right-triangle.html
                */
        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        
        System.out.println("The hypotenuse of the triangle is " + hypotenuse );
    }
}
