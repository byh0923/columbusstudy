package org.example.firstweek;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * 소수 구하기
 * */
public class Boj1929 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int M = sc.nextInt();
		int N = sc.nextInt();

		List<Integer> list = new ArrayList<>();

		// 반까지만 돌면서 구하면 됐던걸로 기억..
		for(int i=M; i<=N; i++) {
			boolean flag = true;

			if(i > 1) {
				for(int j=2; j <= Math.sqrt(i); j++) {
					if(i % j == 0) {
						flag = false;
						break;
					}
				}
			} else {
				flag = false;
			}

			if(flag) {
				list.add(i);
			}
		}

		list.stream().forEach(x -> System.out.println(x));
	}
}