package day32_Predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expressions5 {
    public static void main(String[] args) {
        Predicate<Integer> oddNumber = x -> x %2 !=0;

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,45,6,7,8,9,10));
         list.removeIf(oddNumber);
        System.out.println(list);
        System.out.println("============================");

        Predicate<Integer> lessThan5 = x -> x<5;
        ArrayList<Integer> list2 = new ArrayList<>();
            list2.addAll(Arrays.asList(1,2,3,4,56,7,8,9,10));

            list2.removeIf(lessThan5);

        System.out.println(list2); // [5,6,7,8,9,10]
        System.out.println("======================================");

        Predicate<String> startWithH= s->s.toLowerCase().startsWith("H");
        ArrayList<String> names =new ArrayList<>();

        names.addAll(Arrays.asList("Hilal", "osman","eren"));

      // names.removeIf(startsWithH);
        System.out.println(names);
        System.out.println("=====================================");

      Predicate <String> startsWithMorA = each ->each.startsWith("M") || each.startsWith("A");

     ArrayList<String> nameList = new ArrayList<>();
     nameList.addAll(Arrays.asList("Muhtar", "Alex", "Osman","Eren"));

      nameList.removeIf(startsWithMorA);
        System.out.println(nameList);
        System.out.println("=============================");

       Predicate<Character> digits = c-> c>=48 && c<=57;// Characters.isDigit(c)

       ArrayList<Character>chars = new ArrayList<>();

       chars.addAll(Arrays.asList('A','B','C','&','0'));
            chars.removeIf(digits);

            System.out.println(chars);
            System.out.println("====================================");

       ArrayList<Integer> nums =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
       nums.removeIf( p -> p>5);
        System.out.println(nums);




        }






    }

