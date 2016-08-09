package assignment01;
/*
 * @author yujiharashima
 */
import java.util.Scanner;
public class Binary {
 
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int binaryNumber, binaryNumber2, binaryNumber3;
          
         System.out.print( "Please enter the dedimal number between 0-255: " );
        binaryNumber = keyboard.nextInt();
        System.out.println("The binary number is " + Integer.toBinaryString(binaryNumber));
        
        System.out.print( "Please enter the dedimal number between 0-255: " );
        binaryNumber2 = keyboard.nextInt();
        System.out.println("The binary number is " + Integer.toBinaryString(binaryNumber2));
        
        /*binaryNumber3 = String.format("%d", decimalNumber % 2)
        decimalNumber3 = decimalNumber3 / 2
        */
        
       /*Brighams Answer
        import java.util.Scanner;
public class Binary {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int decimalNumber;
        String binaryNumber;

        System.out.print("Please enter the decimal number between 0-255: ");
        decimalNumber = keyboard.nextInt();

        /* We divide the number by 2 everytime
        and get the right-most bit by doing a modulus 2

        firstBit
        binaryNumber = String.format("%d", decimalNumber % 2)
        decimalNumber = decimalNumber / 2

        Second Bit
        binaryNumber = String.format("%d%s", decimalNumber % 2, binaryNumber)
        decimalNumber = decimalNumber / 2

        //Third Bit
        binaryNumber = String.format("%d%s", decimalNumber % 2, binaryNumber)
        decimalNumber = decimalNumber / 2

        //Fourth Bit
        binaryNumber = String.format("%d%s", decimalNumber % 2, binaryNumber)
        decimalNumber = decimalNumber / 2

        //Fifth Bit
        binaryNumber = String.format("%d%s", decimalNumber % 2, binaryNumber)
        decimalNumber = decimalNumber / 2

        //Sixth Bit
        binaryNumber = String.format("%d%s", decimalNumber % 2, binaryNumber)
        decimalNumber = decimalNumber / 2

        //Seventh Bit
        binaryNumber = String.format("%d%s", decimalNumber % 2, binaryNumber)
        decimalNumber = decimalNumber / 2

        //Eigth Bit
        binaryNumber = String.format("%d%s", decimalNumber % 2, binaryNumber)
        decimalNumber = decimalNumber / 2

        System.out.println("The binary number is " + binaryNumber)
  
        */

    }
}