package org.example.secondweek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
push_front X: 정수 X를 덱의 앞에 넣는다.
push_back X: 정수 X를 덱의 뒤에 넣는다.
pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 덱에 들어있는 정수의 개수를 출력한다.
empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 * */
public class Boj10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 덱은 양방향 양방향으로 in out 가능
        Deque<Integer> deque = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<N; i++) {
            String input = br.readLine();
            if(input.startsWith("push_front")) {
                String[] inputArr = input.split(" ");
                deque.addFirst(Integer.parseInt(inputArr[1]));
            } else if(input.startsWith("push_back")) {
                String[] inputArr = input.split(" ");
                deque.addLast(Integer.parseInt(inputArr[1]));
            } else if(input.equals("pop_front")) {
                if(deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.pollFirst()).append("\n");;
                }
            } else if(input.equals("pop_back")) {
                if(deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.pollLast()).append("\n");
                }
            } else if(input.equals("size")) {
                sb.append(deque.size()).append("\n");
            } else if(input.equals("empty")) {
                if(deque.isEmpty()) {
                    sb.append(1).append("\n");
                } else {
                   sb.append(0).append("\n");
                }
            } else if(input.equals("front")) {
                if(deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.peekFirst()).append("\n");
                }
            } else if(input.equals("back")) {
                if(deque.isEmpty()) {
                    sb.append(-1).append("\n");
                } else {
                    sb.append(deque.peekLast()).append("\n");
                }
            }

        }
        System.out.println(sb.toString());
    }
}
