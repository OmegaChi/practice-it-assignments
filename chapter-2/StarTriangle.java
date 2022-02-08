/*
Write for loops to produce the following output:

*
**
***
****
*****
*/
public class StarTriangle {
  
    public static void main(String[] args) {
      
        for (int layers = 1; layers <= 5; layers++) {
            for (int asterisk = 1; asterisk <= layers; asterisk++) {
                System.out.print("*");
            }
        System.out.println();
        }
      
   }
}
