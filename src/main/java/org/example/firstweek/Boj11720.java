package org.example.firstweek;

import java.util.Scanner;

public class Boj11720 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        String num = scan.next();

        int tot = 0;

        for(int i=0; i<N; i++) {
            tot += Integer.parseInt(String.valueOf(num.charAt(i)));
        }
        System.out.println(tot);
    }
}
