package day26_Methodoverloading;


import java.util.Scanner;
class Main {



    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }
        //#2 Your code here
        isPos(3);

    }

    public static void isPos(int num)
    {
        //#1 your code here
        if(num>0){
            System.out.println("positive");
        }else{
            System.out.println("not positive");
        }

    }

}








    /*  public static String uniques(String str){

      for(int i=0; i<str.length(); i++) {
           int num = frequency(str, str.charAt(0));
           if (num == 1) {
               result += str.charAt(0);
           }
       }
           return "Cybertek";}

    } */