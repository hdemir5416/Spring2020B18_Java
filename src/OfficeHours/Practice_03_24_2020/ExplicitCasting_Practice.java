package OfficeHours.Practice_03_24_2020;

public class ExplicitCasting_Practice {
    public static void main(String[] args) {

        byte bnum = 100;
        short snum = bnum;  //implicit casting

        int iNum = 200;
        short sNum = (short)iNum; // explicit casting

        float fNum =(float)0.5;
        System.out.println(fNum);  //0.5

        float fNum2 = (long)0.5;
              //fNum2 = 0;
              //fNum2 = 0.0 ;
        System.out.println(fNum2); // 0.0
        // long,int,short, byte ==>whole number

                long lNum1 =(long) 4.5;
                System.out.println(lNum1); //4
                System.out.println(9/2); //4
                System.out.println( 9/(float) 2); //4.5

                System.out.println(10.0 / 3); // 3.333333
                System.out.println(10/3.0); /// 3.3333






    }



}
