package com.example.algorithm_gd.Baekjoon;

import java.util.Scanner;

//// #2839 설탕배달
public class Q_2839 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 0;
        while (true) {
            if (N % 5 == 0) {
                System.out.println(N / 5 + cnt);
                break;
            } else if (N < 0) {
                System.out.println(-1);
                break;
            }
            N -= 3;
            cnt++;
        }
    }
}
