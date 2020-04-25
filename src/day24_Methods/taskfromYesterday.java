package day24_Methods;
import java.util.Arrays;

/*
   AccesMmodifier Specifier return type methodname(parameter){
    4. creata a function that can print the maximum number from any given array
	5. creata a function that can print the minimum number from any given array
	6. create a function that can print out the array in descending order
		[1,2,3] == > [3,2,1]

 */
public class taskfromYesterday {

    public static void Maxnumber(int[]array){
        Arrays.sort(array); //ascending order
        System.out.println("max number is: "+ array[array.length-1]);
    }

    public static void MinNumber(int[]array){
        Arrays.sort(array);   //ascending order
        System.out.println("min number is: "+ array[0]);
    }

    public static void Descending(int[]array){   //
        Arrays.sort(array);
        for(int i=array.length-1; i>=0; i--){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[]args){
        int[]arr={10,9,8,7,6,4,3};
     //   Maxnumber(10); //10 , if parameter is array,the argument must be array

        Maxnumber(arr);  //10
        MinNumber(arr);
         int[] arr2 ={100,20,50,70,8};
        Maxnumber(arr2);
        MinNumber(arr2);
        Descending(arr2);
    }


















}
