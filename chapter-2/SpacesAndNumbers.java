/*
Write nested for loops to produce the following output:

    1
   22
  333
 4444
55555
*/

public class SpacesAndNumbers {

  public static void main(String[] args) {
      final int MAX_NUM_OF_LAYERS = 5;
      int numberPyramid = 1;
      int startingNumOfSpaces = 4; 
      
      for (int layer = 1; layer <= MAX_NUM_OF_LAYERS; layer++) {
          for (int space = 1; space <= startingNumOfSpaces; space++) {
              System.out.print(" ");
          }
          numSpaces--;
          for (int i = 1; i <= numberPyramid; i++) {
              System.out.print(numberPyramid);
          }
          numberPyramid++;
          System.out.println();
      }
   }
}
