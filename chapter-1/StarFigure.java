/*
Write a complete Java program in a class named StarFigures that generates the following output. Use static methods to show structure and eliminate redundancy in your solution.

*****
*****
 * *
  *
 * *

*****
*****
 * *
  *
 * *
*****
*****

  *
  *
  *
*****
*****
 * *
  *
 * *
 */
 
 public class StarFigures {
 
    public static void main(String[] args) {
        twoLines();
        xShape();
        System.out.println(); //space
        twoLines();
        xShape();
        twoLines();
        System.out.println(); //space
        verticalLine();
        twoLines();
        xShape();
    }
    
    public static void twoLines() {
        System.out.println("*****");
        System.out.println("*****");
    }
    
    public static void xShape() {
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }
    
    public static void verticalLine() {
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
        
    }
}
