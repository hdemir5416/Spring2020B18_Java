import java.util.Scanner;
class practiceAthome {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi = scan.nextInt();

        int sum = 0;
        int b = 1;

        for(int i = 0; i < sayi; i++){
            //           1 1 2
            sum += b; // s1 s2
            b = sum-1;  // b1 b2
        }
        System.out.println(sum);


        }

        }
