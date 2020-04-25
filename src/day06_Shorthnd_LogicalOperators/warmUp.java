package day06_Shorthnd_LogicalOperators;


public class warmUp {

    public static void main(String[] args) {

        double numberOfGallons = 1;
        double gallonsToLiters = 1 * 3.785;
        String result = numberOfGallons + "is equal to: "+ gallonsToLiters+ "Liters" ;
        System.out.println(result);

        System.out.println("===================================");

        double numberOfLiters = 100;
        double litersToGallons = numberOfLiters / 3.785;
        String result2 = numberOfLiters + "liters equal to  "+litersToGallons+"gallons";
        System.out.println(result2);

        System.out.println("====================================================");

        int a = 200;//201     //200
        int b = -a++ + - --a * a-- % 2;
            // -200  + -200  * 200 % 2;
         //   =-200-4000 % 2
         //   =-200
       //  System.out.println(a); // 199

        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        //  z =300+ 400 -300 * 400 + 300 /400  300/400==>0.75
        //  z =300 + 400 -120000 + 0
        //  z = -119300









        /*    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y; */

/*
        System.out.println(10/3);
        System.out.println(10/3.0);
        System.out.println((int)(10.0/3));*/

       /* String str = "10.5" +3;
        int num = (int)str;
        System.out.println(num);*/


    }}



