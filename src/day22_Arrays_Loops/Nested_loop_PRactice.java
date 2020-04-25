package day22_Arrays_Loops;

public class Nested_loop_PRactice {
    public static void main(String[] args) {

        int[][] numbers = {
                {1, 2, 3},
                {4, 5, 6, 7, 8, 9},
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21}
        };

        //1.print all even numbers in a same line
        //2. count odd numbers==> return the total odd number

        int countodd = 0;
        for (int a = 0; a < numbers.length; a++) { //a:index num of 1D arrat

            for (int k = 0; k < numbers[a].length; k++) { //k:index num of elements in 1D array
                int num = numbers[a][k];

                if (num % 2 == 0) {
                    System.out.print((num + " "));
                } else {
                    countodd++;
                }
            }


        }
        System.out.println();
        System.out.println(countodd);
    }
}