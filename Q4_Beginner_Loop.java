/*Problem Description

Given a number N, print the last digit of Number.


Problem Constraints

0 <= N <= 1000000


Input Format

Number N in single line


Output Format

Print last digit in single line


Example Input

Input 1 :
1973

Input 2 :
530


Example Output

Output 1 :
3

Output 2 :
0


Example Explanation

Explanation 1 :
Last Digit of 1973 is 3.

Explanation 2 :
Last Digit of 530 is 0. */
import java.lang.*;
import java.util.*;

public class Q4_Beginner_Loop{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        
        

            System.out.print(N%10);
    }
}