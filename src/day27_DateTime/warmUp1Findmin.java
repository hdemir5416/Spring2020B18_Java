package day27_DateTime;



/*

		1. write a return method that can return the minimum number from an int array
		2. write a return method that can return the minimum number from a double array
					NOTE: apply method overloading,  DO NOT USE SORT METHOD.


 */
public class warmUp1Findmin {
    public static void main(String[] args) {

        int[] arr = {5, 4, 7, 8, 9}; //4


        int[] arr2 = {100, 788, -49697, 689};
        System.out.println(minimum(arr2));

        double []arr3={293,59,8610,677.89};
        double num1= minimum(arr3);
        System.out.println(num1);
    }

    public static int minimum(int[] arr) {
        int min = arr[0];
        for (int each : arr) {
            if (each < min) {
                min = each;
            }
        }

        return min;
    }

    public static double minimum(double[] arr) {
        double minimum = arr[0];
        for (double each : arr) {
            if (each < minimum) {
                minimum = each;
            }
        }
        return minimum;
    }
}
