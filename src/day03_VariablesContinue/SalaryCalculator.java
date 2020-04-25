package day03_VariablesContinue;

public class SalaryCalculator {
    /*
     ex;
     hourlyrate =55;
     stateTaxRate=  0.04;
     federalTaxRate= 0.22;
     weeklyHours = 40;
     then output will be:

         your salary is: 105600 USD
         your total tax is : 27456 USD
         your income after tax is : 78144USD

     */


    public static void main (String[] args){

        // DataType variableNAme = DAta;

          double  hourlyRate = 55;
          double stateTaxRate = 0.04;
          double federalTaxRate = 0.22;
          byte weeklyHours = 40;
          byte totalWeeksInAyear = 52;

           // salary = hourlyRate * weeklyHours * 52
             double salary = hourlyRate * weeklyHours * 52 ;
             // salary before tax (gross income)


            //  stateTax = salary * stateTaxRate
            double stateTax = salary * stateTaxRate;


            //federalTax = salary * federalTaxRate;
            double federalTax = salary * federalTaxRate;

            // totalTax = stateTax +federalTax ;
            // double salaryAfterTax = salary - (totalTax);

            //salaryAfterTax = salary - stateTax - federalTax;
           // double salaryAfterTax = salary - (stateTax + federalTaxRate);//

        System.out.println("Your salary is: $" + salary); // concatenation
        System.out.println("State tax is: $" + stateTax); // concatenation
        System.out.println("Federal Tax is: $" + federalTax);
        System.out.println("Total Tax is: $" + (federalTax + stateTax) );
      //  System.out.println("Salary After Tax is:  $" + salaryAfterTax );
    /*
        System.out.println("9"+ 3);  //93, concatenation
        System.out.println(9 + "3");  //93, concate
        System.out.println( 9 + 3);  //12, addition
    */




    }






}
