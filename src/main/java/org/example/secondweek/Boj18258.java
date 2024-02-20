package org.example.secondweek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Boj18258 {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		Deque<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<N; i++) {
			String in = br.readLine();
			if(in.startsWith("push")) {
				String[] pushArr = in.split(" ");
				queue.add(Integer.parseInt(pushArr[1]));
			} else if(in.equals("pop")) {
				if(queue.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(queue.poll()).append("\n");
				}
			} else if(in.equals("size")) {
				sb.append(queue.size()).append("\n");
			} else if(in.equals("empty")) {
				if(queue.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			} else if(in.equals("front")) {
				if(queue.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(queue.peek()).append("\n");
				}
			} else if(in.equals("back")) {
				if(queue.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(queue.peekLast()).append("\n");
				}
			}
		}
		System.out.println(sb.toString());

	}
}
