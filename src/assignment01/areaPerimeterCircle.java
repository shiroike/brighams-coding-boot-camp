package assignment01;

/**
 *
 * @author yujiharashima
 */
public class areaPerimeterCircle {
 
    public static void main(String args[])
    {
        /* Hint: Look up formulas for calculating circle perimeter and area
         * Perimeter = ???
         * Area = ???
         */
        
        double  radius = 3.2;
        
        final double PI = 3.13159;
        
        double area = PI * radius * radius;
        
        double perimeter = PI * 2 * radius;
        
        System.out.println("The perimeter of the circle with a radius of 3.2 inches is " + perimeter );
        System.out.println("The area of the same circle is " + area );
    }
}