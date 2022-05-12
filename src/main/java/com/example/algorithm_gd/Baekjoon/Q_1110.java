package com.example.algorithm_gd.Baekjoon;

import java.util.Scanner;

//// #1110 더하기 사이클
public class Q_1110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = N;
        int cnt = 0;

        while (true) {
            N = N % 10 * 10 + (N / 10 + N % 10) % 10;
            cnt++;
//            System.out.println(N);
            if (a == N) break;
        }
        System.out.println(cnt);
    }
}

