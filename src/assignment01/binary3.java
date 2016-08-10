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
     
     //first bit 13%2=1
     binaryNumber = String.format("%d", decimalNumber %2 );
     decimalNumber = decimalNumber /2;
     
     //second bit 6%2=0
     binaryNumber = String.format("%s%s", decimalNumber %2, binaryNumber);
     decimalNumber = decimalNumber /2;
     
     //third bit 3%2=1
     binaryNumber = String.format("%s%s", decimalNumber %2, binaryNumber);
     decimalNumber = decimalNumber /2;
     
     //fourth bit 1%2=1
      binaryNumber = String.format("%s%s", decimalNumber %2, binaryNumber);
     decimalNumber = decimalNumber /2;
     
     //fifth bit 0%2=0
      binaryNumber = String.format("%s%s", decimalNumber %2, binaryNumber);
     decimalNumber = decimalNumber /2;
     
     //sixth bit 0%2=0
      binaryNumber = String.format("%s%s", decimalNumber %2, binaryNumber);
     decimalNumber = decimalNumber /2;
     
     //seventh bit 0%2=0
      binaryNumber = String.format("%s%s", decimalNumber %2, binaryNumber);
     decimalNumber = decimalNumber /2;
     
     //eighth bit 0%2=0
      binaryNumber = String.format("%s%s", decimalNumber %2, binaryNumber);
     decimalNumber = decimalNumber /2;
     
     System.out.println("The binary number is " + binaryNumber );
     
    
     
    }
    
    
    
    
}
