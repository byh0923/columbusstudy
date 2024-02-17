package org.example.firstweek;

import java.util.Scanner;

public class Boj2960 {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int K = sc.nextInt();

      boolean[] primeNum = new boolean[N+1];

      int count = 0;

      for(int i = 2; i <= N; i++) {
          primeNum[i] = true;
      }

      for(int i = 2; i <= N; i++) {
          // i 만큼 증가시키면서 지움
          // 2 4 6 8
          for(int j = i; j <= N; j += i) {
              if(!primeNum[j]) {
                  continue;
              }
              primeNum[j] = false;
              count++;
              if(count == K) {
                  System.out.println(j);
                  System.exit(0);
              }
          }
      }
  }
}