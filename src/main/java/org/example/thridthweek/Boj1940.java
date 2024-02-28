package org.example.thridthweek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1940 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());

		String input = br.readLine();
		int result = 0;
		String[] arr = input.split(" ");
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(Integer.parseInt(arr[i]) + Integer.parseInt(arr[j]) == M) {
					result++;
					break;
				}
			}
		}
		System.out.println(result);
	}
}