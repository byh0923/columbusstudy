package org.example.firstweek;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * map에는 중복된 키 값을 허용하지 않으므로 map 에 값을 넣고 확인하는 방법
 * 같은 단어가 2번 나오면 안됨.
 * */
public class Boj1316 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] arr = new String[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.next();
		}
		// aba a 1 =>
		// map(k,v)
		// map.put(a,1)
		// map.put(b,1)
		// map.put(a, 1->2)

		int result = 0;

        // 배열만큼 for문
		for(int i=0; i<N; i++) {
            // 임시변수
			String check = arr[i];
            // 글자가 몇 번 등장했는지 체크할 map
			Map<String, Integer> map = new HashMap<String, Integer>();
			for(int j=0; j<check.length(); j++) {
				// k 번까지 map에 넣기 위해 사용
				int k = 0;
				for(k = j+1; k<check.length(); k++) {
                    // 글자가 다르면 break;
					if(check.charAt(j) != check.charAt(k)) {
						break;
					}
				}
				// 2
                // abbc의 경우 a / bb / c
				// yyyzyzy => key yyy
				String key = check.substring(j, k);
				// 문자를 넣어라 1
				// a b a
				if(map.containsKey(key)) {
					map.put(key, map.get(key)+1); // => getOrDe
				} else {
					map.put(key, 1);
				}
			}
			// map
			boolean flag = true;
			for(String key : map.keySet()) {
				if(map.get(key) > 1) {
					flag = false;
				}
			}
			
			if(flag) {
				result++;
			}
		}
		System.out.println(result);
	}
}