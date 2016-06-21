package uDemy.JavaTutorialForCompleteBeginners;

import java.util.Scanner;

/**
 *
 * @author yujiharashima
 */
public class gettingUserInput {
    public static void main(String[] args){
        
        // Create scanner object
        Scanner input = new Scanner(System.in);
        
        // Output the prompt
        System.out.println("Enter a line of text: ");
        
         // Wait for the user to enter a line of text
        String line = input.nextLine();
        
       // Tell them what they entered.
        System.out.println("You entered: " + line);
        
        System.out.println("Enter the integer: ");
        
        int value = input.nextInt();
        
        System.out.println("You entered: " + value);
        
        System.out.println("Enter a demical number: ");
        
        double value2 = input.nextDouble();
        
        System.out.println("You entered: " + value2);
        
    }
}
