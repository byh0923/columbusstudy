package org.example.firstweek;

import java.util.Scanner;

/**
 * 최대공약수와 최소공배수
 * */
public class Boj2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		// 비교를 쉽게 하기 위해 자리 바꿔줌
		if(num1 < num2) {
			int tmp = 0;
			tmp = num1;
			num1 = num2;
			num2 = tmp;

		}

		System.out.println(gcd(num1, num2));
		System.out.println(lcm(num1, num2));
	}

	// num1 num2의 나머지가 0이 될 때 까지 계속 나눔
	// a(num1, num2) -> a(num2, 나머지(div)) -> a(div, (num2%div)) => 0이 될 때 까지 반복하고 a(_, 0) 일 때 _가 최대공약수
	public static int gcd(int num1, int num2) {
		while(num2 != 0) {
			int div = num1%num2;
			num1 = num2;
			num2 = div;
		}
		return num1;
	}

	// 두 수의 곱 / 최대공약수 = 최소공배수
	public static int lcm(int num1, int num2) {
		return num1 * num2 / gcd(num1, num2);
	}
}