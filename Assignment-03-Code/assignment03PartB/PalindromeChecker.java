/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: PalindromeChecker.java
 * Author: Frank M. Carrano
 * Author: Timothy M. Henry
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment03PartB;

import java.util.Scanner;

//
// - Do not change the "main" method.
// - Please ADD CODE to complete implementing the program
//
public class PalindromeChecker {

    private static Object String;

    private static boolean isPalindrome(String string) {
        String = string.toLowerCase();
        String emptyString = "";
        OurStack<Character> theStack = new OurStack<Character>();
        
        for (int i = 0; i < string.length(); i++) {
            if (!isPunctuation(string.charAt(i))) {
                emptyString = emptyString + string.charAt(i);
                theStack.push(string.charAt(i));
            }

        }
        String palindromeString = "";
        while(!theStack.isEmpty()){
            palindromeString = palindromeString + theStack.pop();
        }
        if (emptyString.equals(palindromeString)){
            return true;
        } else {
            return false;
        }

    } 
    public static boolean isPunctuation (char character) {
        return !Character.isDigit(character) && !Character.isLetter(character);
    }

    //
    // - Do not change the "main" method.
    // - Please ADD CODE to complete implementing the program
    //
    public static void main(String[] args) {
        //
        // - Do not change the "main" method.
        // - Please ADD CODE to complete implementing the program
        //
        Scanner input = new Scanner(System.in);
        System.out.print("[>>] Enter a string (or a ! to exit): ");
        String string = input.nextLine();

        while (!string.equals("!")) {
            if (isPalindrome(string)) {
                System.out.println(" [+] Yes. \"" + string + "\" IS a palindrome!");
            } else {
                System.out.println(" [-] No. \"" + string + "\" is NOT a palindrome!");
            }
            System.out.print("[>>] Enter a string: ");
            string = input.nextLine();
        }

        System.out.println("[<<] Thank you!");
        //
        // - Do not change the "main" method.
        // - Please ADD CODE to complete implementing the program
        //
    }
}