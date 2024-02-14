package org.example.firstweek;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 단어공부
 * */
public class Boj1157 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        // 대문자로 치환
        input = input.toUpperCase();
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // 알파벳인지 check
            if(Character.isAlphabetic(ch)) {
                // key가 있으면 값을 반환 없으면 0 반환
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        int maxCount = 0;
        // default로 ?
        char mostFrequentChar = '?';

        // entry에 key value를 넣음
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            // maxCount 찾기
            if(entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentChar = entry.getKey();
                // 같은 값이 있으면 ?로
            } else if(entry.getValue() == maxCount) {
                mostFrequentChar = '?';
            }
        }

        System.out.println(mostFrequentChar);
    }

}