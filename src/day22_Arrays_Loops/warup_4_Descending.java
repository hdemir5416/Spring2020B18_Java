package day22_Arrays_Loops;

import java.util.Arrays;

/*

  2. write a program that sort the array in descending order
 */
public class warup_4_Descending {
    public static void main(String[] args) {
        // 1.sort the array in ascending
        // 2.reverse the array that's sorted in ascending ==>

        int []arr ={10,38,1 ,-1, 500 , 60};
        Arrays.sort(arr); //sorts in ascending

        System.out.println(Arrays.toString(arr));

        int[] RevArr = new int[arr.length];

        int j = arr.length-1;
        for(int i =0; i< arr.length; i++){
            RevArr[i] =arr[j];
            j--;
        }
        System.out.println(Arrays.toString(RevArr));





    }
}
