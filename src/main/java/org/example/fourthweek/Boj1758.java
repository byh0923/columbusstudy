package org.example.fourthweek;

import java.util.Arrays;
import java.util.Scanner;

public class Boj1758 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        long result = 0;
        //  생각했던 돈 - (받은 등수 - 1)
        // 1 1 1 1 2
        Arrays.sort(arr);
        int[] tips = new int[N];
        for(int i=N-1; i>=0; i--) {
            tips[i] = arr[i] - (N - i - 1);

            if(tips[i] > 0) {
                result += tips[i];
            }
        }



        System.out.println(result);
    }
}
