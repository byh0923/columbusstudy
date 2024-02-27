package org.example.thridthweek;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Boj4358 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> map = new HashMap<>();
		int total = 0;
		while(sc.hasNextLine()) {
			String input = sc.nextLine();
			if(input.isEmpty()) {
				break;
			} else {
				map.put(input, map.getOrDefault(input, 0)+1);
				total++;
			}
		}

		// treemap을 사용하여 오름차순 정렬
		Map<String, Integer> sortMap = new TreeMap<String, Integer>(map);

		for (Entry<String, Integer> entry : sortMap.entrySet()) {
            System.out.print(entry.getKey() + " ");
            System.out.printf("%.4f", entry.getValue()/(double)total * 100);
            System.out.println();
        }

	}

}
