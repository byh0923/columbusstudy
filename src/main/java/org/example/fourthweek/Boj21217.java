package org.example.fourthweek;

import java.util.Arrays;
import java.util.Scanner;

public class Boj21217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int max = 0;
        // 무조건 전체 로프를 다 쓰는게 아님
        // 2 5 10 15 20 30
        // 12 25 40 45 40 30
        for(int i=0; i<N; i++) {
            arr[i] = arr[i] * (N-i);

            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
