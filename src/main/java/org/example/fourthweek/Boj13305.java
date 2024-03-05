package org.example.fourthweek;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int countryNum = Integer.parseInt(br.readLine());
        String roadLength = br.readLine();
        String[] road = roadLength.split(" ");
        String gasPrice = br.readLine();
        String[] gas = gasPrice.split(" ");

        long totalPrice = 0;

        long minCost = Long.parseLong(gas[0]);
        for(int i = 0; i < countryNum - 1; i++) {

            if(Long.parseLong(gas[i]) < minCost) {
                minCost = Long.parseLong(gas[i]);
            }

            totalPrice += (minCost * Long.parseLong(road[i]));
        }

        System.out.println(totalPrice);
    }
}
