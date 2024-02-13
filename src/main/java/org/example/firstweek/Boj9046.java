package org.example.firstweek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj9046 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for(int i=0; i<N; i++) {
            arr[i] = br.readLine();
        }

        for(int i=0; i<N; i++) {
            Map<String, Integer> map = new HashMap<>();

            for(int j=0; j<arr[i].length(); j++) {
                String tmp = String.valueOf(arr[i].charAt(j));
                if(!tmp.equals(" ")) {
                   if(!map.containsKey(tmp)) {
                    map.put(tmp, 1);
                    } else {
                        map.put(tmp, map.get(tmp) + 1);
                    }
                }

            }
            List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
            list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

            String result = list.get(0).getKey();

            // 한글자만 들어오면 두번째를 비교했을 때 exception 발생
            if(list.size() > 1) {
                if(list.get(0).getValue() == list.get(1).getValue()) {
                    result = "?";
                }
            }

            System.out.println(result);
        }

    }
}
