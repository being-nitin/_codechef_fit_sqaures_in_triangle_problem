package com.codechef;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*
	   what is the maximum number of squares of size 2x2 that can be fit in a right
	   angled isosceles triangle of base B.
       One side of the square must be parallel to the base of the isosceles triangle.
       Base is the shortest side of the triangle
       Input
       First line contains T, the number of test cases.
       Each of the following T lines contains 1 integer B.

       Output
       Output exactly T lines, each line containing the required answer.
       Constraints
       1 ≤ T ≤ 103
       1 ≤ B ≤ 104
       Sample Input

       11
       1
       2
       3
       4
       5
       6
       7
       8
       9
       10
       11
	                  */
    Scanner sc = new Scanner(System.in);
    int t,b;
    t = sc.nextInt();
    while(t-->0){
        b = sc.nextInt();
        System.out.println(noOfTriangles(b,t));
    }
    }
    static int noOfTriangles(int b, int t){
        int total=0;
        for(int i=0;i<t;i++){
            b = b-2;
            b = b/2;
            total = (b*(b+1));
            return total;
        }
        return 0;
    }
}
