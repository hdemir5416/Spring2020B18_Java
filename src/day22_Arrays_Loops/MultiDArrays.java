package day22_Arrays_Loops;
import java.util.*;
public class MultiDArrays {
    public static void main(String[] args) {
      int[][] arr = {{1,2,3},{4,5,6}};
      //           0 1 2
        // n dimensinal array contains (n-1) di

        // 2D array:  [index num od 1D array] []
         int[][] arr2D={ {1,2,3,4}};
//                          0

         int[] arr1D = arr2D[0]; //{1,2,3}
   System.out.println(Arrays.toString(arr1D));
        System.out.println(Arrays.toString(arr2D[0]));//single dimensional array from arr2D
        System.out.println(arr2D[0][2]); // 3

    for(int each: arr2D[0]){
        System.out.println(each); //
    }



















    }
}
