package com.example.algorithm_gd.Baekjoon;

import java.util.Scanner;

//// #1011 Fly me to the Alpha Centauri
public class Q_1011 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int dist = y - x;
            int cnt = 0; // 공간이동 작동 횟수
            int sqrt = (int) Math.sqrt(dist);
            if (dist == sqrt * sqrt) {  //Math.pow(밑, 지수)
                cnt = 2 * sqrt - 1;   // 1 3 5 7 9 -> 2n -1 (등차수열)
            } else if (sqrt * sqrt < dist && dist <= sqrt * sqrt + sqrt) {   // sqrt가 3이면 10,11,12
                cnt = 2 * sqrt;
            } else
                cnt = 2 * sqrt + 1;

            System.out.println(cnt);
        }
    }
}
