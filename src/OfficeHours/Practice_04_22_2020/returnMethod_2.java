package OfficeHours.Practice_04_22_2020;

import java.util.Arrays;

public class returnMethod_2 {
    public static void main(String[] args) {

        int[] arr2={100,25,67,80,56,60};
        int a= lastIndexNum(arr2);
        System.out.println(a);
    }

         public static  int lastIndexNum(int []arr) {
               Arrays.sort(arr);

             System.out.println(Arrays.toString(arr));

             int lastIndexNum= arr.length-1;

             System.out.println(arr[arr.length-1]);



            return lastIndexNum; }

         }



