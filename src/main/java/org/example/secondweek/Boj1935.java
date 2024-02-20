package org.example.secondweek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Boj1935 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<String, Double> map = new HashMap<>();

        int N = Integer.parseInt(br.readLine());

        String input = br.readLine();

        Double[] arr = new Double[N];
        for(int i=0; i<N; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }

        Stack<Double> stack = new Stack<>();

        //ABC*+DE/-
        // a b c
        for(int i=0; i<input.length(); i++) {
            char tmp = input.charAt(i);
            if(tmp >= 'A' && tmp <= 'Z') {
                stack.push(arr[tmp - 'A']);
            } else {
                double first = stack.pop();
                double second = stack.pop();
                if(tmp == '+') {
                    stack.push(second + first);
                } else if(tmp == '-') {
                    stack.push(second - first);
                } else if(tmp == '*') {
                    stack.push(second * first);
                } else if(tmp == '/') {
                    stack.push(second / first);
                }
            }
        }
        System.out.printf("%.2f", stack.pop());
    }
}
