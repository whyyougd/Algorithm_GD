package com.example.algorithm_gd.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 최대공약수와 최소공배수
public class Q_2609 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int G = 1;
        int L = 1;

//        if(A!=B){
//            for(int i=2; i<= Math.min(A,B); i++){
//                if(A%i==0 && B%i==0) {
//                    G *= i;
//                    A /= i; B /= i;
//                    L = G * A * B;
//                    i -= 1;
//                }
//            }
//        } else {
//            G = A; L = G;
//        }
//
//        if(G==1) L = A*B;

        G = getGCD(A, B);
        L = A * B / G;

        System.out.println(G);
        System.out.println(L);
    }

    public static int getGCD(int A, int B) {
        while (B > 0) {
            int tmp = A;
            A = B;
            B = tmp % B;
        }
        return A;
    }
}

