package day24_Methods;

public class returnMethod4 {

         public static void maxNum(int a, int b){

             if(a>b){
                 System.out.println(a);
             }else{
                 System.out.println(b);
             }
         }

    public static void main(String[] args) {

     //      int a=  maxNum(10,20);

          int result = Addition(10,20);

        System.out.println(result);

              int result2= result+2000; //5000
        System.out.println(result2);

    }
     public static int Addition(int a, int b){

             return a+b ;
     }



}
