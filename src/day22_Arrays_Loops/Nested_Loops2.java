package day22_Arrays_Loops;

public class Nested_Loops2 {
    public static void main(String[] args) {
        int[][] numbers = {{9, 8, 7}, {6}, {5, 4, 3, 2, 1, 0}};
   /*      k
   numbers[0] ==> {9,8,7}  numbers[0][i] i need to be repeated 3 times
   number[1] ==> {6}      numbers [1][i] i needs to be repeated 1 times
   number[2] ==>{5,4,3,2,1,0] numbers [2][i] i needs to be repeated 6 times
  */
    for(int k=0;k<numbers.length; k++){

        for(int i =0; i<numbers[k].length; i++){
            System.out.print(numbers[k][i]+" ");
    }
        System.out.println();


 //  for(int i =0; i<numbers[0].length; i++){
 //      System.out.println(numbers[0][i]);







    }



















    }
}