package day21_MultiDimensinalArrays;
import java.util.*;
public class Multi_DimensionalArrays {
    public static void main(String[] args) {

        int [] arr  ={1, 2, 3};

  //             index     0 1 2     0 1 2
        int[][] arr2D = { {1,2,3} ,{10,5,7} };
    //                      0          1

        System.out.println(arr2D.length); //2

         int [] arr1D= arr2D[0];  // {1,2,3};

    //      System.out.println(Arrays.toString());//[1,2,3]

        int num1 =   arr2D[1] [3];
        System.out.println(num1); //7

   //    {'A', 'B'};
    //                    0    1      0    1    2     0   1    2
        char[][]ch2D ={ {'A', 'B'} ,{'D', 'E', 'F'},{'G','H', 'I'}};
  //  index                  0               1            2


        char a =ch2D [1][0] ;
        System.out.println(a);  //D

        char[] ch2 =  ch2D[2];

        System.out.println(Arrays.toString(ch2)); // [g,h,i]
  //                        0   1   2      0   1   2      0   1    2
      String[][]str2D = {{ "A","B","C"}, {"D","E","F"}, {"J","H","I"}};
   //                           0              1              2

            String r1 =    str2D[2][1];
    //    System.out.println(ArraytoString);
    }

}
