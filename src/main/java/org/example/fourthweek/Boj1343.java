package org.example.fourthweek;

import java.util.Scanner;

public class Boj1343 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] arr = input.split("\\.");

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<arr.length; i++) {
            String tmp = arr[i];

            if(tmp.length() % 2 != 0) {
                sb = new StringBuilder("-1");
                break;
            } else if(tmp.length() % 4 == 0) {
                sb.append("AAAA".repeat(tmp.length()/4));
            } else {
                sb.append("AAAA".repeat(tmp.length()/4));
                sb.append("BB");
            }

            if(i != arr.length - 1) {
                sb.append(".");
            }
        }
        String result = sb.toString();
        if(!result.equals("-1")) {
            sb.append(".".repeat(input.length() - sb.toString().length()));
        }
        System.out.println(sb.toString());
    }
}
