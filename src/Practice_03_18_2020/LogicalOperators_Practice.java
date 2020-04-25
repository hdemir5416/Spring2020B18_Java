package Practice_03_18_2020;

public class LogicalOperators_Practice {

    public static void main(String[] args) {
        // || && !

        boolean r1 = "Muhtar" == "Bad Guy"; //false
        boolean r2 = "Muhtar" != "Good Guy"; // true
        boolean r3 = 10 >= 9;  //true
        boolean r4 = !false == !true ; //false

        // || : as long as condition is true

        boolean result1 = 9 != 8 || 9==8;
                       //    t   ||  f =>   t

        boolean result2 = 'a' == 'A' || 'A' == 'b';
                      //      f      ||   f  =>  f

        boolean result3 = 6 > 5 && 6 < 4 ;
                     //      t  &&   f  => f
        boolean result4 =  !false != false && !true == false;
                    //            t        &&     t    =>  t

     }
}
