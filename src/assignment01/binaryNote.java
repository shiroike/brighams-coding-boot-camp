package assignment01;
/**
 *
 * @author yujiharashima
 */
public class binaryNote {
    
        public static void main(String a[]){
            
        ///Refference from online site; http://beginnersbook.com/2014/07/java-program-to-convert-decimal-to-binary/
            
    	System.out.println("Binary representation of 124: ");
    	System.out.println(Integer.toBinaryString(124));
        System.out.println("\nBinary representation of 45: ");
        System.out.println(Integer.toBinaryString(45));
        System.out.println("\nBinary representation of 999: ");
        System.out.println(Integer.toBinaryString(999));

        /* answer by Brigahm
        
        import java.util.Scanner;
public class Binary {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int decimalNumber;
        String binaryNumber;

        System.out.print("Please enter the decimal number between 0-255: ");
        decimalNumber = keyboard.nextInt();

        /* We divide the number by 2 everytime
        and get the right-most bit by doing a modulus 2*/
        
        /*

        //firstBit
        binaryNumber = String.format("%d", decimalNumber % 2);
        decimalNumber = decimalNumber / 2;

        //Second Bit
        binaryNumber = String.format("%d%s", decimalNumber % 2, binaryNumber);
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
        */
                
        
        }
        
     
}