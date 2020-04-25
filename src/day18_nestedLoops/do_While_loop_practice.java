package day18_nestedLoops;

public class do_While_loop_practice {
    public static void main(String[] args) {
        /*
        print all th even number 0~100 in same line seprated space
         */

        int num = 0;
        do {
            if (num % 2 == 0) {
                System.out.println(num+" ");
            }

            num++;
          } while (num <= 100);

        System.out.println();
        System.out.println("===========================================");

        int i=1;
        do{

            System.out.println(i);
            i++;
         }while(i<=5);

        System.out.println("========================");

        int z =1;
        do{
            System.out.println(z);
            if(z==3){
               break;}
            z++;
        }while(z<= 5);




    }}