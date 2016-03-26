package assignment01;

/**
 * @description inches to millimeters
 * @author yujiharashima
 */
public class inchesToMillimeters {

    public static void main(String[] args) {
        // Hint: 1 inch = 25.4mm
        int a = 2, //inches
                b = 5,
                c = 10;
              
        final double inch = 25.4;
    
        double d = a * inch,
            e = b * inch,
            f = c * inch;  
           
            System.out.println("2 inches is " + d + " millimeters." );
            System.out.println("5 inches is " + e + " millimeters." );
            System.out.println("10 inches is " + f + " millimeters." );
    }
}
