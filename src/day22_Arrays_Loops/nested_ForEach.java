package day22_Arrays_Loops;
import java.util.Arrays;
public class nested_ForEach {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        //           0 1 2 3 4
        for (int each : arr) {
            System.out.println(each);
        }
        System.out.println("====================================");
        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}};
        //            0        1
        for (int[] each1Array : arr2D) {

      //      for (int eachElement; each1Array) {
                System.out.println();
            }

        }
   //     System.out.println("=========================");

        char[][] ch2D = {{'A', 'B'}, {'C', 'D', 'E'},{'F','J','H'}};
        //                   0            1

   //     for (char[] each1DArray : ch2D) {

       //     System.out.println(Arrays.toString(each1DArray));
   //     for(char eachElement: each1DArray){
  //          System.out.println(eachElement);
        }




