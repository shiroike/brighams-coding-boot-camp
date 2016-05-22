package assignment01;
/*
 * @author yujiharashima
 */
import java.util.Scanner;
public class Binary {
 
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int binaryNumber, binaryNumber2, binaryNumber3;
       
        decimalNumber = keyboard.nextInt();
        
                
         System.out.print( "Please enter the dedimal number between 0-255: " );
        binaryNumber = keyboard.nextInt();
        System.out.println("The binary number is " + Integer.toBinaryString(binaryNumber));
        
        System.out.print( "Please enter the dedimal number between 0-255: " );
        binaryNumber2 = keyboard.nextInt();
        System.out.println("The binary number is " + Integer.toBinaryString(binaryNumber2));
        
        binaryNumber3 = String.format("%d", decimalNumber % 2);
        decimalNumber3 = decimalNumber3 / 2;
        
    }
}