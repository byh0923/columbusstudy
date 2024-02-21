package org.example.secondweek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Stack;

public class Boj1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        int[] arr = new int[N+1];
        for(int i=1; i<=N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int tmp = 1;
        for (int i = 1; i <= N; i++) {
			stack.push(i);
			sb.append("+").append("\n");
			while (!stack.empty() && stack.peek() == arr[tmp]) {
				stack.pop();
				sb.append("-").append("\n");
				tmp++;
			}
		}

        if(!stack.isEmpty()) {
            System.out.println("NO");
        } else {
            System.out.println(sb.toString());
        }


    }
}
