package com.example.algorithm_gd.Baekjoon;

import java.util.Scanner;

//// #1929 소수구하기
public class Q_1929 {
    public static boolean isPrime(int num) {
        if (num < 2)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        for (int i = M; i <= N; i++) {
            if (isPrime(i) == true)
                System.out.println(i);
            ;
        }
    }
}
