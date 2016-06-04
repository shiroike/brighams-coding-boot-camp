package assignment02;
/**
 *
 * @author yujiharashima
 */
import javax.swing.JOptionPane;
public class punctuation
{
  public static void main(String [] args)
  {
  /* JOptionPane makes it easy to show a popup dialog box that prompts the user for a value or shows information.
 
    showInputDialog takes 2 parameters, parentComponent and message. We don't have a parent component so passing null.
    The message should ask the user to type in a sentence that ends with a punctuation mark.
   */
  String sentence = JOptionPane.showInputDialog(null, "Enter a sentence with a punctuation at the end. (. ? or !) ");
 
   // here you need to write code that gets the last character in the String variable 'sentence'. Save it to 'lastChar'.
  char lastChar = sentence.charAt(sentence.length() - 1);
  
  
   switch ( lastChar )
  {
      case '.':
          JOptionPane.showMessageDialog( null, "You entered a period");
          break;
      case '?':
          JOptionPane.showMessageDialog( null, "You entered a question mark");
          break;
      case '!':
         JOptionPane.showMessageDialog( null, "You entered an exclamation mark");
          break;
      default:
          JOptionPane.showMessageDialog( null, "I don't know that punctuation");
          break;
          
                  

      
  }
      

      
  }
  
  
  }    
      
      
 
  // here you can use multiple if/else statements or a switch/case statement to determine the type of punctuation the user entered and then inform the user of the result.}