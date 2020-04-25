package day20_ArrayContinue;



import java.util.Arrays;
public class Array_Sorting {
    public static void main(String[] args) {


        int[] arr1 = {9, 8, 7, 6, 5, 4, 3, 2, 1,};
        //   Arrays.sort(arr1);

        System.out.println(Arrays.toString(arr1));

        System.out.println("first min number is:" +arr1[0]);
        System.out.println("Second min number is:"+arr1[1]);
        System.out.println("First max number is:"+ arr1[arr1.length-1]);
        System.out.println("Second max number is:"+ arr1[arr1.length-2]);


        char[] ch = {'Z','D','W','Y', 'A','B','E',};

        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));

        String[]names ={"Deniz","Osman","Ahmed", "Eren"};
        Arrays.sort(names);

         System.out.println(Arrays.toString(names));

        System.out.println("=====================================");

          int[]arr ={3,1,4,-1,100,200,155};

          int[]arrDesc = new int[arr.length];  // 0,0, 0, 0, 0, 0, 0 ,0
                                 // index:          0  1 2  3  4  5  6  7


          Arrays.sort(arr); // -100, -1 , 1 3 ........
          //         index       0    1   2  3 ...............

         System.out.println(Arrays.toString(arr));

         int j =0;

         for(int i = arr.length-1 ; i>=0; i--){
           // System.out.print(arr[i]+ " ");
           arrDesc[j] = arr[i];

        }


    }





}
