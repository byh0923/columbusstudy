package org.second.firstweek;

import java.util.Scanner;

/**
 * https://www.acmicpc.net/problem/25501
 * */

// 앞으로 뒤로 읽어도 똑같은게 팰린드롬
public class 재귀의_귀재 {

    static int count;
    public static int recursion(String s, int l, int r){
        count++;
        if(l >= r) {
            return 1;
        } else if(s.charAt(l) != s.charAt(r)) {
            return 0;
        } else {
            return recursion(s, l+1, r-1);
        }
    }
    public static int isPalindrome(String s){
        count = 0;
        return recursion(s, 0, s.length()-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0; i<N; i++) {
            String s = sc.next();
            System.out.println(isPalindrome(s) + " " + count);

        }
    }
}
