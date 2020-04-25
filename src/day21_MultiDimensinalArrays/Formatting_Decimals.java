package day21_MultiDimensinalArrays;


import java.text.DecimalFormat;
public class Formatting_Decimals {

    public static void main(String[] args) {
        DecimalFormat DF = new DecimalFormat("0.00");

        double a = 10.0 / 3.0;

        System.out.println(a);
        System.out.println(DF.format(a));
        System.out.println(2.34567899);
        System.out.println(DF.format(2.34567899));  //2.35


     //   DecimalFormat a = new DecimalFormat("0.00");

        System.out.println();
    }}