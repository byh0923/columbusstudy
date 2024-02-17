package org.example.firstweek;

import java.util.Scanner;


// n!/(n-m)!m!
// n - n-m - m
public class Boj2004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        long count_5 = divFive(n) - divFive(n-m) - divFive(m);
        long count_2 = divTwo(n) - divTwo(n-m) - divTwo(m);

        System.out.println(Math.min(count_2, count_5));
    }

    public static long divFive(long num) {
        long count = 0;
        while(num >= 5) {
            count += num / 5;
            num /= 5;
        }
        return count;
    }

    public static long divTwo(long num) {
        long count = 0;
        while(num >= 2) {
            count += num / 2;
            num /= 2;
        }
        return count;
    }
}
