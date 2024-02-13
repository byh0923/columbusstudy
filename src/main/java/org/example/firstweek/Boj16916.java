package org.example.firstweek;

import java.util.Scanner;

public class Boj16916 {

    static int ans=0;

    static int[] table;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String tmp = scan.next();
        String pattern = scan.next();

        KMP(tmp,pattern);
		System.out.println(ans);

    }

	static int[] getPi(String pattern) {
		int[] pi = new int[pattern.length()];
		int j=0;
		for(int i=1; i<pattern.length(); i++) {
			while(j>0 && pattern.charAt(i)!=pattern.charAt(j)) {
				j = pi[j-1];
			}
			if(pattern.charAt(i)==pattern.charAt(j))
				pi[i] = ++j;
		}
		return pi;
	}

	static void KMP(String origin, String ptn) {
		int[] pi = getPi(ptn);
		int j=0;
		for(int i=0;i<origin.length();i++) {
			while(j>0 && origin.charAt(i)!=ptn.charAt(j)) {
				j=pi[j-1];
			}
			if(origin.charAt(i)==ptn.charAt(j)) {
				if(j==ptn.length()-1) {
					ans=1;
					break;
				}
				else
					j++;
			}
		}
	}
}
