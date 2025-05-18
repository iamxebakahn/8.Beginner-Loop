/*Problem Description

Given two numbers, A and B, your task is to print all the numbers in the range from A to B (both inclusive), with each number followed by a space, including the last number.

Note : Try to solve this question using a while loop for learning purposes.


Problem Constraints

0 <= A <= B <= 500


Input Format

First line denotes the value of A
Second line denotes the value of B


Output Format

Print the number from A to B(both inclusive), with each number followed by a space, including the last number.


Example Input

5
9


Example Output

5 6 7 8 9


Example Explanation

A = 5
B = 9

Numbers from 5 to 9 are : 5 6 7 8 9 */
import java.lang.*;
import java.util.*;

public class Q2AP_Beginner_Loop{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        for(int i=A;i<=B;i++)
            System.out.print(i+" ");
    }
}