package assignment02;
import java.util.Scanner;
/**
 *
 * @author yujiharashima
 */
public class naturalLanguageCalculator {
   
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int first, second;
        
        System.out.println("Enter the first digit: ");
        first = keyboard.nextInt(); // ask user for first value, use keyboard.NextInt() ... look at hypotenuse2.java for keyboard
        
        System.out.println("Enter the second digit: ");
        second = keyboard.nextInt(); // ask user for second value
        
        //convert integer to word
        String firstword = integerToWord(first);
        String secondword = integerToWord(second);
        
        System.out.println("Enter an operation: ");
        String operator = keyboard.next(); // ask user for operator. use keyboard.Next()
        
        int result = calculateValues(first, second, operator);
        String sumword = integerToWord(result);
        
        String operatorword = operatorToWord(operator);
        
        String output = String.format("%s %s %s equals %s", firstword, operatorword, secondword, sumword);
        System.out.println(output);
        
        
    }
    
    /**
     * integerToWord converts a number to a word
     * 
     * @param number to convert
     * @return a string that represents the word
     */
    private static String integerToWord(int number) {
     switch(number) {
         case 1:
             return "one";
         case 2:
             return "two";
     }   // TODO: finish 0 and 3-9
     return "";
    }
    
    private static String operatorToWord(String operator) {
        if(operator.equals("+")) {
            return "plus";
        } else if (operator.equals("-")) {
            return "minus";
        }// TODO: finish mult and division
        
        return "";
    }
    
    private static int calculateValues(int value1, int value2, String operator) {
        if(operator.equals("+")) {
            return value1+value2;
        } else if (operator.equals("-")) {
            return value1-value2;
        } // TODO: finish mult and division
        return 0;
    }
    
    
    
    
    
    
    
    
    
}
