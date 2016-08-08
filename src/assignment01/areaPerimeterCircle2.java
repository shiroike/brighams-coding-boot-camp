package assignment01;

/**
 *
 * @author yujiharashima
 */
public class areaPerimeterCircle2 {
    
public static void main(String args[])
    {
        /* Hint: Look up formulas for calculating circle perimeter and area
         * Perimeter = 2*pi*r
         * Area = pi*r^2
         */
        
         double  radius = 3.2;
         double area = Math.PI * Math.pow(radius,2);
         double perimeter = 2 * Math.PI * radius;
               
       System.out.println("The perimeter of a circle with a radius of 3.2 inches is " + perimeter + " inches");
       System.out.println("The area of the same circle is " + area);
       
        
    }
}
