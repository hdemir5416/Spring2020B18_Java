package day05_Unary_ShorthandOperators;

public class VariablesPractice {
    public static void main(String[] args) {

   // whole numbers: byte, short, int, long
   //decimals: float, double

   long a1 = 100L;
   float f1 = (float)a1;
   // f1 = 100L;  // 100.0
        System.out.println(f1);


        long l1=(long) f1;
        //l1 = 100
        System.out.println(l1); // 100

        String name;

        System.out.println("name");// local variables cannot be used without initializing

        name = "Cybertek"; // in java: first come first serve
        System.out.println(name);

    }
}
