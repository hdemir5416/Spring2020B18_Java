package day21_MultiDimensinalArrays;
/*
2. write a program that can return the logest string of text from an array
	3. write a program that can return the shortest string of text from an array

 */
public class Longest_Shortest_Words {
    public static void main(String[] args) {


        String[] names = {"Hilal", "OSman", "Eren", "Abdullah"};
        int maxLengthString = names[0].length();
        int minLengthString = names[0].length();

        String longestword = "";
        String shortestword = "";

        for (int i = 1; i <= names.length - 1; i++) {

            if (names[i].length() > maxLengthString) {
                maxLengthString = names[i].length();
                longestword = names[i];
            }

            if (names[i].length() < minLengthString) {
                minLengthString = names[i].length();

            }
            System.out.println(longestword);
            System.out.println(shortestword);
        }
    }
}
