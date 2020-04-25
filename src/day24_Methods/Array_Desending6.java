package day24_Methods;

import java.util.Arrays;

public class Array_Desending6 {

    int[] arr1 = {1, 10, 8, 9, 34};

    int[] arr2 = {200, 100, 150, 300};

    int[] arr3 = {100, 456, 67, 300};



   public static void sortDecending(int[]arr) {
       Arrays.sort(arr); //{1,2,3,4}; ==>{4,3,2,1}
       int[] RevArr = new int[arr.length];
/*
                  i        j
           RevArr[0] = arr[3]
           RevArr[1] = arr[2]
           RevArr[2] = arr[i];
           RevArr[3] =  arr[0];
 */
                 int j= arr.length-1;
                for(int i=0; i<arr.length;i++){
                  RevArr[i]=arr[j] ;
                  j--;
                }
       System.out.println(Arrays.toString(arr));



   }}

