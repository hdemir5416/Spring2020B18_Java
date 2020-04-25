package day09_Nestedif_Ternary;

public class Loan_NestedIf {
    public static void main(String[] args) {
        double salary =120000;
        byte workHistory = 3;
        if(salary>=30000){ //might be qualified
            if(workHistory>=2){
                System.out.println("You are qualified for loan");
            }else{
                System.out.println("Get 2 years experience");
            }

        }else{
            System.out.println("You are not qualified");
        }
    }
}
