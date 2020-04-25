package day24_Methods;

import java.util.Arrays;

public class returnMethods_Practice5 {
  /*
  create a function that can return the max number from any given array
   */


    public static void main(String[] args) {
        int[] arr= {4,6,7,88,90};

        int max = maxNumber(arr);
        System.out.println(max);

       int min =  minNumber(arr);

        System.out.println(min);
    }

        public static int maxNumber(int[]arr){
      Arrays.sort(arr);
      return arr[arr.length-1];
    }


        public static int minNumber(int[]arr){
        Arrays.sort(arr);
        return arr[0];
        }

}
