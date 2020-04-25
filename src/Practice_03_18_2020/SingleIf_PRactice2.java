package Practice_03_18_2020;

public class SingleIf_PRactice2 {
    public static void main(String[] args) {

        byte age = 30;

        boolean eligibleToBuy = age > 21 || age == 21; // age>=21
        if (eligibleToBuy) {
            System.out.println("here is your Vodka");
        }


        if (age < 21) {
            System.out.println("GO drink your milk");
        }

        boolean feelingHappy = false;

        if (feelingHappy == false) {
            System.out.println("do not be sad");
        }

        if (feelingHappy == true) {
            System.out.println("Stay happy");
        }
    }
}

