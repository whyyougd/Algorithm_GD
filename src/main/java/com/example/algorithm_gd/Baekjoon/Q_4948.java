package com.example.algorithm_gd.Baekjoon;

import java.util.Scanner;

//// #4948 베르트랑공준
public class Q_4948 {
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

        while (true) {
            int n = sc.nextInt();
            int cnt = 0;
            if (n != 0) {
                for (int i = n + 1; i <= 2 * n; i++) {
                    if (isPrime(i) == true) cnt++;
                }
                System.out.println(cnt);
            } else break;
        }

    }
}
