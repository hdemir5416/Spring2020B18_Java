package day22_Arrays_Loops;

public class Nested_Loops {
    public static void main(String[] args) {
 //                         0   1      0  1   2     0   1   2   3
        char[][] arr2D ={ {'A','B'},{'C','D','E'},{'F','J','H','I'}};
        //                    0           1              2
        //each index in arr2D must be single dimensional array

      // arr2D[0]  ==> {'A','B'}

        for(int i=0; i<arr2D[0].length; i++){

            System.out.println(arr2D[0][i]); //A B

       // arr2D[1] ==>{'C','D','E'}
  //          for(int i =0; i<arr2D[1].length; i++){
                System.out.println(arr2D[1][i]); //C,D,E


 //          for(int i =0; i<arr2D[2].length; i++) {
               System.out.println(arr2D[2][i]); //F,J,H,I
  }

                System.out.println("==============================================");


     for(int j=0;j<arr2D.length; j++){

         for(int i =0; j<arr2D[1].length; i++){//arr2D[0], arr2D[1],....
             System.out.println(arr2D[j][i]); //C,D,E

//          j==>index number of 1D array
 //         i==> index


                }


        }







    }
}
