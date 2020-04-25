package day05_Unary_ShorthandOperators.practice;

public class home {

    public static void main(String[] args) {

        int a = 10;
        a = -a--;
        System.out.println(a--);
        System.out.println(a--);
        System.out.println(--a);


        int askim = 10;    //11    //12    //11

        askim = askim++ + -askim++ + --askim + -askim--;
        //      = 10 + -11 +         +     11      + -11 //1
        System.out.println(askim);



        int canim = 10;
                           // 9     // 10    //9
        canim = -canim-- + canim++ * canim-- / - canim++;
     //         = -10 + 9 * 10 / -9
      //          = -20



        System.out.println(canim);

        int x= 2;
        int y= x++;
        System.out.println(y+" "+ x);


    }


}
