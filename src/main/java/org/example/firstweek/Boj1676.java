package org.example.firstweek;

import java.util.Scanner;

/**
 * 팩토리얼 0의 개수
 *
 * 0이 나오는 경우 2*5일 때
 * 5의 배수마다 0의 값 증가
 * 25면 2개 증가
 * 5의 n승 마다 ++
 * */
public class Boj1676 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int count = 0;
		// 10
		// 10/5 = 2
		while(N >= 5) {
			count += N / 5;
			N /= 5;
		}
		System.out.println(count);

	}
}