/*Problem Description

Given a number N, Print all digits of number (from right to left) in new line.


Problem Constraints

-10000 <= N <= 10000


Input Format

Take N in single line


Output Format

Print Digits of Number in new line


Example Input

Input 1 :
2001

Input 2 :
-6985


Example Output

Output 1 :
1
0
0
2

Output 2 :
5
8
9
6


Example Explanation

Explanation 1 :
N is 2001, digits from right to left are 1, 0, 0, 2.

Explanation 2 :
N is -6985, N is in negative but digits of Number from right to left are 5, 8, 9, 6.
 */
import java.lang.*;
import java.util.*;

public class Q5_Beginner_Loop{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        
        if(N==0)
            System.out.print(0);


        if(N<0)
            N=N*-1;

        for(int i=N;i>0;i=i/10)
            System.out.println(i%10);

    }
}