package practiceAtHome;
import java.util.*;
/*

In this assignment you will write a program to create a shopping list, count and prices.

Please read carefully! If you do not fully understand the requirement ask your classmates in Slack or ask your instructor!

You will use Scanner object and ask user to enter 3 items followed by its count, price and you will calculate total price and show as a report.

-Declare 4 String variables item1, item2, item3, report.

-Declare double variables price1, price2, price3, totalPrice

-Declare int variables count1, count2, count3

-Create a Scanner object named scan.

Execution flow using with example:

Use scanner to read all 3 values.

-Display prompt "Enter Item1, count and its price:"
Tomatoes
2
5.4
Explanation: (Item1 is "Tomatoes", count is 2, price is 5.4)


-Display prompt "Enter Item2, count and its price:"
Cheese
0
3.5
Explanation: (Item2 is "Cheese", count is 0, price is 3.5)


-Display prompt "Enter Item3, count and its price:"
Apples
5
6.3
Explanation: (Item3 is "Apples", count is 5, price is 6.3)


-calculate totalPrice for all items only if the item's count is more than 0!

-build the report variable by concatenating Strings and double price values:
-do not include items that have count 0, use if statement !
-Calculate total price for the item and concatenate like below

"Item1: Tomatoes Price: 10.8, Item3: Apples Price: 31.5"
Explanation: (Item2 "Cheese" is not included since its count is 0)

- Print the value of report variable

- Print total Price:
"Total price: 42.3"




 */
public class march_27 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String items = " ";

        System.out.println("Item1, count and its price:");
        String item1= scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();
        System.out.println("Item1 is "+"\""+item1+"\""+","+"count is "+count1+","+"price is "+price1);

        System.out.println("Item2, count and its price:");
        String item2= scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();
        System.out.println("Item2 is "+"\""+item2+"\""+","+"count is "+count2+","+"price is "+price2);

        System.out.println("Item3, count and its price:");
        String item3= scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();
        System.out.println("Item3 is "+"\""+item3+"\""+","+"count is "+count3+","+"price is "+price3);

        double item1Price= count1*price1;
        double item2Price= count2*price2;
        double item3Price= count3*price3;
        double totalPrice= (count1*price1)+(count2*price2)+(count3*price3);
         if(count1>0 && count2>0 && count3>0){

             System.out.println("Item1:"+item1+"Price: "+item1Price+", "+"Item2:"+item2+"Price: "+item2Price+
                                "Item3:"+item3+"Price: "+item3Price);
             System.out.println("Total price: "+totalPrice);
         }



    }}