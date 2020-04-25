package OfficeHours.Practice_04_22_2020;

public class voidMethod {

     public static void main(String[] args) {
       print();

       eligible (true,32);
       eligibleCigara(32);
     }

    public static void print(){

        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");

        System.out.println("=========================================="); }

    public static void eligible(boolean USCitizen, int age){
         boolean eligibleToVote = age>=18 && USCitizen == true;
          if(eligibleToVote){
              System.out.println("you area eligible to vote");
          }else{
              System.out.println("not eligible");
          }

      }

      public static void eligibleCigara(int a){
         if(a>18){
             System.out.println("eligible");
         }else{
             System.out.println("not eligible");
         }
      }










}
