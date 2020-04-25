package OfficeHours.Practice_04_08_2020;

public class do_WhileLoop5 {
    public static void main(String[] args) {
        /*
              do{
                        statement;

                 }while(condition)
              execution order:
              1. statement;
              2. condition
                   if true: repeats
                   if false: stops the loop
         */
        boolean b = false;

        while (b) {
            System.out.println("Hello Wolrd ");
        }

        System.out.println("=============================================");

        do {
            System.out.println("Hello");
        } while (b);

        System.out.println("========================================");
             int j = 0;
        do {
            if(j%15 ==0){
             System.out.println(j+" ");}
             j++;
        }while(j<=100);
    }
}