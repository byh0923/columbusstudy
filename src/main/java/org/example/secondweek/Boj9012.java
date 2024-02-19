package org.example.secondweek;

import java.util.Scanner;
import java.util.Stack;

public class Boj9012 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            String in = sc.next();
            Stack<Character> stack = new Stack<>();
            String result = "YES";

            for (int j = 0; j < in.length(); j++) {
                char tmp = in.charAt(j);
                // (일 경우는 쌓아줌
                if (tmp == '(') {
                    stack.push('(');
                } else if (tmp == ')') {
                    // 앞에 )가 있으면 그냥 실패
                    if (stack.isEmpty() || stack.pop() != '(') {
                        result = "NO";
                        break;
                    }
                }
            }
            // 스택이 덜 비워져 있으면 짝이 맞지 않다는 것
            if (!stack.isEmpty()) {
                result = "NO";
            }
            System.out.println(result);
        }


    }
}
