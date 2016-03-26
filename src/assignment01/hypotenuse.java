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
        
        System.out.print( "Enter side A: " );
        String a = keyboard.next();
        System.out.println( "Side A: "+ a );
        
        System.out.print( "Enter side B:" );
        String b = keyboard.next();
        System.out.println( "Side B: " + b );
        // scanner class is found textbook pg.129
        
        
        
        
    }
}
