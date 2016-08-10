package assignment01;
import java.util.Scanner;
/**
 *
 * @author yujiharashima
 */
public class binary3 {
    
    public static void main(String[] args){
     Scanner keyboard = new Scanner(System.in);
     
     int    decimalNumber;
     String binaryNumber;
     
     System.out.println("Please enter the decimal number between 0-255: ");
     decimalNumber = keyboard.nextInt();
     
     //first bit
     binaryNumber = String.format("%d", decimalNumber %2 );
     decimalNumber = decimalNumber /2;
     
     //second bit
     binaryNumber = String.format("%s%s", decimalNumber %2, decimalNumber);
     decimalNumber = decimalNumber /2;
     
     
     
    
     
    }
    
    
    
    
}
