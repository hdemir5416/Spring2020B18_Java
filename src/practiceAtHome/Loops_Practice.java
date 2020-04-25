package practiceAtHome;



import java.util.*;

public class Loops_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO Type your code below:

        for (int i = 0; i < 5; i++) {

            if (nums[i] == 5 && nums[i+1] ==5){
                System.out.println("true");
            }  else {
                System.out.println("false");
            }
        }
    }}
 //System.out.println(studentsAge[i]);}



















