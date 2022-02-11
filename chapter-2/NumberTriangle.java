/*
Write for loops to produce the following output:

1
22
333
4444
55555
666666
7777777
*/

public class NumberTriangle {

  public static void main(String[] args) {
  
      final int MAX_NUM_OF_LAYERS = 7;
      int numberPyramid = 1;
      
      for (int layer = 1; layer <= MAX_NUM_OF_LAYERS; layer++) {
          for (int i = 1; i <= numberPyramid; i++) {
              System.out.print(numberPyramid);
          }
          numberPyramid++;
          System.out.println();
      }
   }
}
