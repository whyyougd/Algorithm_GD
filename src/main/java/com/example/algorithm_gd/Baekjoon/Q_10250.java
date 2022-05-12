package com.example.algorithm_gd.Baekjoon;

import java.util.Scanner;

//// #10250 ACM 호텔
public class Q_10250 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int ans = 0;

        for (int t = 0; t < T; t++) {

            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            if (N % H != 0) {
                ans = N % H * 100 + N / H + 1;
            } else
                ans = H * 100 + N / H;  // 만약 꼭대기층일 경우 (N/H 나머지가 0 일 경우)

            System.out.println(ans);
        }
    }
}
