package day05_Unary_ShorthandOperators;

public class leapYear {
  /*  1. create a class called LeapYear, and write a program that can identify if the given is Leap Year, print true if it's leap year, otherwise print false
        Ex:
            year = 2020
        output:
            2020 is leap year: true

   */
    public static void main(String[] args) {


      short year = 2020;

      //leapYear: year %4 ==0
      // if returns true==> leapYear, if it returns false ==>not leapYear

      boolean leapYear = year % 4 == 0; // if the year can be divided by without any reminder, then it is leap year
      //System.out.println( year + "is leap year:  "+ leapYear);//2020 is leap is true

      String result = year + "is leap year: " + leapYear;
      System.out.println(result);


    }
}
