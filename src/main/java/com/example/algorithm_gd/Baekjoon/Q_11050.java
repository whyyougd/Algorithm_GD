package com.example.algorithm_gd.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_11050 {
// #11050 이항 계수 1
    public static int factorial(int n) {
        if (n <= 1) return 1; // 0! = 1
        else return factorial(n - 1) * n;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int ans = factorial(N) / (factorial(K)*factorial(N-K)); //
        System.out.println(ans);

        int ans2 = 1;
        for (int j = 0; j < K; j++) {
            ans2 *= N - j;  //
            ans2 /= j + 1;
        }
        System.out.println(ans2);

    }

}
