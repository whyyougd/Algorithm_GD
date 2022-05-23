package com.example.algorithm_gd.Baekjoon;

import java.io.*;
import java.util.*;

// #1934 최소공배수
public class Q_1934 {

    // 반복문으로 GCD 구현
    public static int getGCD(int A, int B) {
        while (B > 0) {
            int tmp = A;
            A = B;
            B = tmp % B;
        }
        return A;
    }

    // 재귀로 GCD 구현
    public static int GCD(int A, int B){
        if(A%B==0) return B;
        return GCD(B, A % B);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine()); // 케이스 수

        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

//            int L = A * B / getGCD(A,B) ;
            int L = A * B / GCD(A,B);
            System.out.println(L);
        }

    }
}