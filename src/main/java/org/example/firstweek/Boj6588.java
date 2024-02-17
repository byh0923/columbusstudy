package org.example.firstweek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Boj6588 {
    public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		boolean[] isPrime = new boolean[1000001];
		isPrime[0] = true;
		isPrime[1] = true;

		for (int i = 2; i <= (int) Math.sqrt(1000000); i++) {
			for (int j = 2; i * j < 1000001; j++) {
				isPrime[i * j] = true; // 소수가 아님
			}
		}

		while (true) {
			int n = Integer.parseInt(in.readLine());
			if (n == 0) {
				break;
			}
			boolean flag = false;
			for (int i = 2; i <= n / 2; i++) {
				if (!isPrime[i] && !isPrime[n - i]) {
					System.out.println(n + " = " + i + " + " + (n - i));
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("Goldbach's conjecture is wrong.");
			}
		}
	}

}