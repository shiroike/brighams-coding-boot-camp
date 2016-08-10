package assignment01;

/**
 *
 * @author yujiharashima
 */
import java.util.Scanner;
public class binary2 {
 
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
         int decimalNumber;
        String binaryNumber;

        System.out.print("Please enter the decimal number between 0-255: ");
        decimalNumber = keyboard.nextInt();
        
         //firstBit
        binaryNumber = String.format("%d", decimalNumber % 2);
        decimalNumber = decimalNumber / 2;

        //Second Bit
        binaryNumber = String.format("%s%s", decimalNumber % 2, binaryNumber);
        decimalNumber = decimalNumber / 2;

        //Third Bit
        binaryNumber = String.format("%d%s", decimalNumber % 2, binaryNumber);
        decimalNumber = decimalNumber / 2;

        //Fourth Bit
        binaryNumber = String.format("%d%s", decimalNumber % 2, binaryNumber);
        decimalNumber = decimalNumber / 2;

        //Fifth Bit
        binaryNumber = String.format("%d%s", decimalNumber % 2, binaryNumber);
        decimalNumber = decimalNumber / 2;

        //Sixth Bit
        binaryNumber = String.format("%d%s", decimalNumber % 2, binaryNumber);
        decimalNumber = decimalNumber / 2;

        //Seventh Bit
        binaryNumber = String.format("%d%s", decimalNumber % 2, binaryNumber);
        decimalNumber = decimalNumber / 2;

        //Eigth Bit
        binaryNumber = String.format("%d%s", decimalNumber % 2, binaryNumber);
        decimalNumber = decimalNumber / 2;

        System.out.println("The binary number is " + binaryNumber);   
        
        
    }
}