package day27_DateTime;
import java.time.LocalDate;
import java.time.Month;

public class Dates {
    public static void main(String[] args) {

        LocalDate date1= LocalDate.of(2020,5,6);
        System.out.println(date1);
        LocalDate birthday=LocalDate.of(1987, 2,1);
        System.out.println(birthday);

        //isAfter(date2)

          boolean result1 = date1.isAfter(birthday);
        System.out.println(result1); //true

        boolean result2 = date1.isBefore(birthday);
        System.out.println(result2); //false

        boolean result3 = date1.isEqual(birthday);
        System.out.println(result3); // false

        boolean result4 = birthday.isLeapYear();
        System.out.println(result4); // false

        System.out.println("==========================================");

         LocalDate now = LocalDate.now(); //2020-04-23
         System.out.println("today is:"+ now);

         String str= now.toString();
        System.out.println(str.replace("-"," "));

        //month/day/year



















    }
}
