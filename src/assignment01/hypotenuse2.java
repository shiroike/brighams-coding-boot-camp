package assignment01;
import java.util.Scanner;
/**
 *
 * @author yujiharashima
 */
public class hypotenuse2 {
    public static void main(String[] args)
    {
        // use the scanner class to request user input. Be sure to accept double values in case user enters numbers with decimals!
        Scanner keyboard = new Scanner(System.in);
        
        double side1, side2, hypotenuse;
        
        System.out.println("Enter side A: ");
        side1 = keyboard.nextDouble();
        System.out.println("Side A: " + side1);
        
        System.out.println("Enter side B:" );
        side2 = keyboard.nextDouble();
        System.out.println("Side B: " + side2);
        
        hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.println("The hypotenuse of the triangle is " + hypotenuse);
        
    }
}
