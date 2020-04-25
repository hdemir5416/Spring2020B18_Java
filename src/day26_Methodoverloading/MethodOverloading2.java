package day26_Methodoverloading;
import java.util.Arrays;
public class MethodOverloading2 {
    /*
    first method : print the sum of two int numbers
    second method : print the sum of three int numbers
    third method: print the sum four int number
     */
    public static void main(String[] args) {
           // 3,6
        sum2Numbers(3, 6);
          // 10, 5, 5
        sum3Numbers(10, 5, 5);

        int[] arr= {5,4,3,2};
        Arrays.sort(arr);











    }

    public static void sum2Numbers(int a, int b) {
        System.out.println(a + b);
    }

    public static void sum3Numbers(int a, int b, int c) {
        System.out.println(a + b + c);

    }

    //============================================================
  



}
