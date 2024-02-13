package org.example.firstweek;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 12 34 5 로 나눠서 더할 필요 없다.
 * */
public class Boj20154 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = sc.next();

        // map 에 모든 알파벳의 획을 넣어둠
		Map<String, Integer> map = new HashMap<>();

		map.put("A",3);
        map.put("B",2);
        map.put("C",1);
        map.put("D",2);
        map.put("E",3);
        map.put("F",3);
        map.put("G",3);
        map.put("H",3);
        map.put("I",1);
        map.put("J",1);
        map.put("K",3);
        map.put("L",1);
        map.put("M",3);
        map.put("N",3);
        map.put("O",1);
        map.put("P",2);
        map.put("Q",2);
        map.put("R",2);
        map.put("S",1);
        map.put("T",2);
        map.put("U",1);
        map.put("V",1);
        map.put("W",2);
        map.put("X",2);
        map.put("Y",2);
        map.put("Z",1);

		int tot = 0;

		for(int i=0; i<input.length(); i++) {
			String tmp = String.valueOf(input.charAt(i));
			tot += map.get(tmp);
		}
		tot %= 10;

		if(tot % 2 != 0) {
			System.out.println("I'm a winner!");
		} else {
			System.out.println("You're the winner?");
		}


	}
}
