package practiceAtHome;


import java.time.LocalDate;
import java.util.Arrays;
public class bosPage {

    public static void main(String[] args) {


        LocalDate a = LocalDate.of(2020, 10, 25);

        LocalDate birthday = LocalDate.of(1987, 02, 01);
        boolean result = a.isAfter(birthday);
        System.out.println(result);

        boolean result2 = a.isEqual(birthday);
        System.out.println(result2);

    }



}

