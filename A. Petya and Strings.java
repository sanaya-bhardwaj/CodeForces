//Little Petya loves presents. His mum bought him two strings of the same size for his birthday. 
//The strings consist of uppercase and lowercase Latin letters. 
//Now Petya wants to compare those two strings lexicographically. 
//The letters' case does not matter, that is an uppercase letter is considered equivalent to the corresponding lowercase letter. Help Petya perform the comparison.

//Input
//Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin letters.

//Output
//If the first string is less than the second one, print "-1". 
//If the second string is less than the first one, print "1". 
//If the strings are equal, print "0". 
//Note that the letters' case is not taken into consideration when the strings are compared.

//Solution:

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input two strings
        String s1 = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison
        String s2 = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitive comparison
        
        // Compare the strings lexicographically
        int result = s1.compareTo(s2);
        
        // Output the result
        if (result < 0) {
            System.out.println("-1");
        } else if (result > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
