package org.example.fourthweek;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Boj20115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Integer[] arr = new Integer[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        // 3 2 10 9 6
        // 14.5
        // 14.5 +3
        // 17.5 + 1.5
        // 19
        Arrays.sort(arr, Collections.reverseOrder());

        double result = arr[0];

        for(int i=1; i<N; i++) {
            result += (double)arr[i]/2;
        }
        System.out.println(result);

    }
}
