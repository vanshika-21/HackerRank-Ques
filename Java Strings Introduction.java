/* "A string is traditionally a sequence of characters, either as a literal constant or as some kind of variable." — Wikipedia: String (computer science)

This exercise is to test your understanding of Java Strings. A sample String declaration:

String myString = "Hello World!"

The elements of a String are called characters. The number of characters in a string is called the length, and it can be retrieved with the String.length() method.

Some important methods for Strings in Java:

stringName.charAt(index) : returns char value for the particular index
stringName.isEmpty() : checks if string is empty.(Return type boolean).
Learn more about strings and its methods by clicking here.

Task:

Given two strings of lowercase English letters, A  and B, perform the following operations:

Sum the lengths of A and B.
Determine if A is lexicographically larger than B (i.e.: does B come before A in the dictionary?).
Capitalize the complete string A and B and print them on a single line, separated by a space.

Input Format

The first line contains string A. The second line contains another string B. The strings are comprised of only lowercase English letters.


Output Format

There are three lines of output:

For the first line, sum the lengths of A and B.

For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.

For the third line, Capitalize the complete string A and B and print them on a single line, separated by a space.


Sample Input 0

hello
java

Sample Output 0
9
No
Hello Java

Example Explanation

Explanation 0:

 Length of A = 3 and B = 3 so len(A) + len(B) = 6
 String "abc" is lexicographically smaller than "def"

String A is "hello" and B is "java".

A has a length of 5, and B has a length of 4; the sum of their lengths is 9 .
When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, A is not greater than B and the answer is No.

When you capitalize the first letter of both A and B and then print them separated by a space, you get "Hello Java". */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        int i=A.compareTo(B);
        if (i>0)
        System.out.println("Yes");
        else
        System.out.println("No");
        String atemp = A.substring(0,1).toUpperCase()+A.substring(1);
        String btemp = B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(atemp+" "+btemp);
    }
}
