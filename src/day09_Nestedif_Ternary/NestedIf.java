package day09_Nestedif_Ternary;

public class NestedIf {

    public static void main(String[] args) {
        int age = 17;
        boolean USCitizen = true;

        if (USCitizen) {

            if (age > 17) {
                System.out.println("You are eligible to vote");
            } else {
                System.out.println("Grow up, then vote");
            }

        } else {
            System.out.println("Only the US .......");
        }

        System.out.println("===========================");

        int score = 20;
        String grade = " ";

        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                grade = "A";
            } else if (score >= 80) {
                grade = "B";
            } else if (score >= 70) {
                grade = "C";
            } else if (score >= 60) {
                grade = "D";

            } else {
                grade = "F";
            }


        } else { //score<0 or score> 100
            grade = "Invalid";}

          int score2 = 75;
        String grade2 = "";

        if (score2>=0 && score2<=100) {
            grade2 = (score2 >= 90) ? "A" : (score2 >= 80) ? "B" : (score >= 70) ? "C"
                    : (score2 >= 60) ? "D" : "F";
        }else{
            grade2="Invalid";
            System.out.println(grade2); //D
        }


        }
    }
