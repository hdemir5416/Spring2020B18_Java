package day22_Arrays_Loops;
/*  4. write a program that can count the even and odd number from an array of integers
                        MUST use for each loop*/


public class Count_odd_even {
    public static void main(String[] args) {
       int []arr={1,2,3,4,5,6,7,8,9,10};

       int countOddNumbers = 0;
       int countEvenNumber = 0;

       for(int each : arr){
         if(each%2 !=0){
               countOddNumbers++;
           }else{
               countEvenNumber++;
           }



       }
        System.out.println(countEvenNumber);
        System.out.println(countOddNumbers);

       /*
       for(each%2==0)

        */


    }
}
