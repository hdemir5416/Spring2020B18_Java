package day24_Methods;

public class StringReverse {
    public static void main(String[] args) {

    }

    public static void Reevrse(String str) { //ABCD
        String Reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            Reverse += str.charAt(i);
        }
        System.out.println(Reverse);

    }

}