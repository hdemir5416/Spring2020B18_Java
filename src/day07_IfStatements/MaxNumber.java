package day07_IfStatements;

/*         2. write a java program that accepts three numbers and return the maximum number
            (assume that none of them are equal) */

public class MaxNumber {
        public static void main(String[] args) {

       double a = 100;
       double b = 200;
       double c = 300;

       boolean aGreater = a>b && a>c;
       boolean bGreater = b>a && b>c;// if b is greater than both a and c
      // boolean bGreater = b>a || b>c; if b greater than either a and c,then b is max

       boolean cGreater = c>a && c>a;

           if(aGreater){
            System.out.println(a+"is greater number");}
           if(bGreater){

            System.out.println(b+"is greater number"); }
           if(cGreater){

            System.out.println(c+"is greater number");}







        }





}
