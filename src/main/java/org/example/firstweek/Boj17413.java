package org.example.firstweek;

import java.util.Scanner;
import java.util.Stack;
/**
 * 단어뒤집기2
<open>tag<close>
<open>gat<close>

<ab cd>ef gh<ij kl>
<ab cd>fe hg<ij kl>
 * */
public class Boj17413 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		int len = input.length();

		// 후입선출
		Stack<String> stack = new Stack<>();

		StringBuilder sb = new StringBuilder();

		boolean isIn = false;

		for(int i=0; i<len; i++) {
			String tmp = String.valueOf(input.charAt(i));

			//<ab cd>ef gh<ij kl>
			// < 일 때
			if(tmp.equals("<")) {
				// <> 사이에 있다고 boolean 값 변경
				isIn = true;
				// 담겨져 있는 스택 sb에 추가
				while(!stack.empty()) {
					sb.append(stack.pop());	// sb <ab cd> fe hg stack 비워짐
				}
				sb.append(tmp);	// <	// sb <ab cd> fe hg<
				// > 일 때
			} else if(tmp.equals(">")) {
				// <> 밖으로 나가졌다고 변경, > 추가만
				isIn = false;
				sb.append(tmp);	// <ab cd> sb <ab cd> fe hg<ij kl>
				// <>의 안에 있을 때
			} else if(isIn) {
				sb.append(tmp);	// <ab cd 2) sb <ab cd> fe hg<ij kl
				// <>의 밖일 때
			} else if(!isIn) {
				// 공백이면 단어 분리
				if(tmp.equals(" ")) {
					while(!stack.empty()) {
						sb.append(stack.pop());	// sb <ab cd> fe stack 비워짐
					}
					sb.append(tmp);	// sb <ab cd> fe  stack 비워짐
				} else {
					stack.push(tmp); // sb <ab cd> stack ef  2) sb <ab cd> fe stack gh
				}
			}
		}
		// 남아 있는 문자 처리
		while(!stack.empty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb.toString());

	}

}