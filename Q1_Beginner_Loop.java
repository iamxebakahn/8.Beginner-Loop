/*Problem Description

Write a program that takes a positive integer N as input from the user and prints all natural numbers from 1 to N, with each number followed by a space (including the last number).


Problem Constraints

1 <= N <= 1000000



Input Format

A single line representing N



Output Format

N space separated integers from 1 to N, with each number followed by a space, including the last number.



Example Input

Input 1:

5
Input 2:

10


Example Output

Output 1:

1 2 3 4 5 
Output 2:

1 2 3 4 5 6 7 8 9 10  */
import java.lang.*;
import java.util.*;

public class Q1_Beginner_Loop{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        for(int i=1;i<=N;i++)
            System.out.print(i+" ");
            
        
    }
}