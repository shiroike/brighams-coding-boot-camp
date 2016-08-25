package assignment02;
/**
 *
 * @author yujiharashima
 */
public class naturalLanguageCalculator {
   
    
    public static void main(String[] args){
        
        int first = 1; // ask user for first value, use keyboard.NextInt() ... look at hypotenuse2.java for keyboard
        int second = 1; // ask user for second value
        String firstword = integerToWord(first);
        String secondword = integerToWord(second);
        
        String operator = "+"; // ask user for operator. use keyboard.Next()
        
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
