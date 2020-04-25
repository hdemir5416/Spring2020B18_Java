package day25_Methodss;

public class return_methods {
    public static void main(String[] args) {
        max2(10,5);
    }


    public static int max(int a, int b) {
        int max = 0;
        if (a >= b) {
            max = a;
        } else {
            max = b;
        }
        return max;
    }


    public static int max2(int a, int b) {
        if (a >= b) {
            return a;
        }
            return b;
        }
}