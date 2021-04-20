/* PALLINDROME
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.
  
Sample Input

madam
Sample Output

Yes */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String reverse = "";
        Scanner sc=new Scanner(System.in);
        String original = sc.nextLine();   
        int length = original.length();   
        for ( int i = length - 1; i >= 0; i-- )  
         reverse = reverse + original.charAt(i);  
        if (original.equals(reverse))  
         System.out.println("Yes");  
        else  
         System.out.println("No");   
   }  
}  
