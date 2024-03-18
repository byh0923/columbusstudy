package org.second.firstweek;

import java.util.Scanner;

public class 피보나치_수_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();


        System.out.println(recursion(N));
    }
    public static int recursion(int N) {

        if(N == 0) {
            return 0;
        } else if(N == 1) {
            return 1;
        } else {
            return recursion(N - 1) + recursion(N - 2);
        }
    }
}
