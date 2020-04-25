package OfficeHours.Practice_04_22_2020;

public class methodOverloding {
    public static void main(String[] args) {

        method1(true);
    }

    public static void method1(){
        System.out.println("hello world");
    }

    public static int method1(Boolean a){
        System.out.println("hello cybertek");
       return 123;
    }

    public static void method1(int a,int b){
        System.out.println("Hi");
    }
}
