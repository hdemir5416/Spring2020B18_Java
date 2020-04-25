package OfficeHours.Practice_03_24_2020;

public class multiBranchIf {
    public static void main(String[] args) {
         int number= 0;

         if(number>0){
             System.out.println("It is positive number");
         }else if(number<0) {
             System.out.println("negative");
         }else{
             System.out.println("zero");

         }

             int num1 = 100;
             int num2= 200;

             if(num1>num2){
                 System.out.println(num1+" is greater than"+ num2);
             }else if(num2>num1){
                 System.out.println(num2+" is greater"+num1);
             }else{
                 System.out.println(num1+"is equal to"+num2);
             }



    }
}
