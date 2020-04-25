package day06_Shorthnd_LogicalOperators;

public class ShorthandOperators {

    public static void main(String[] args) {

        int x = 20;
            x+=10; //x = x+ 10 = 30
        System.out.println(x ); //30

        x +=60;  x=30;
        System.out.println(x); // 90

        String schoolname = "CyberTek";
         schoolname += 12345;// schoolname+number
        System.out.println(schoolname); // Cybertek12345

        System.out.println('a'+'b');
        //                  97+ 98 ==>195

        char ch1 = 'a'; //97
             ch1 += 'b'; //98
          // char ch1 = 195;
        System.out.println(ch1); // charter

        int num = 'z'; //num = 122
            num +='x'; //num = num+ 120;
        System.out.println(num); //242

        int A = 100;
            A -= 90;
        System.out.println(A); //10

        int B = 200;
            B -= A;  // B = B - A
        System.out.println(B);  //190


        int x1 = 10;
        int y = x1 +=10*2; //x1 = x1+ 20
            //  x1 += 20 ==> 30
        System.out.println(y); //y = 30


        int  q = 20;
        int p = q*= 20*3;
             // q*= 60  // q = q * 60 ==> 1200

        int num1 = 300;
        num1 /= 2;  //num1 = num1/ 2 ==> 150

        int num2 = 400;
            num2 /= 20 + 10; // num2 = num2 / 30 =
                             // num2 = 400/ 20 +10 = 13.333 ==>13

        int num3 = 300;
         num3 %= 10+ 20; //num3 = num3 % 30 ==> 0

        int n1 = 400;
      //      n1 = %= 3*5;  400%15 ==>10







    }
}
