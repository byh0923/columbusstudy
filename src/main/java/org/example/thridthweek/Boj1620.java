package org.example.thridthweek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
첫째 줄에는 도감에 수록되어 있는 포켓몬의 개수 N이랑 내가 맞춰야 하는 문제의 개수 M이 주어져.
N과 M은 1보다 크거나 같고, 100,000보다 작거나 같은 자연수인데, 자연수가 뭔지는 알지? 모르면 물어봐도 괜찮아. 나는 언제든지 질문에 답해줄 준비가 되어있어.
*/
public class Boj1620 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Map<Integer, String> map = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=N; i++) {
			String input = br.readLine();
			map.put(i, input);
			map2.put(input, i);
		}

		for(int i=0; i<M; i++) {
			String question = br.readLine();
			boolean isNum = true;
			if(Character.isAlphabetic(question.charAt(0))) {
				isNum = false;
			}
			// 숫자면 포켓몬 이름 출력
			if(isNum) {
				sb.append(map.get(Integer.parseInt(question))).append("\n");
			// 영어면 숫자 출력
			} else {
				sb.append(map2.get(question)).append("\n");
			}
		}
		System.out.println(sb.toString());
	}
}
