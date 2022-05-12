package com.example.algorithm_gd.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//// #1010 다리놓기
public class Q_1010 {
    public static long factorial (long n){
        if(n<=1) return n;
        else return factorial(n-1)*n;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(bf.readLine()); // 케이스 수

        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(bf.readLine());
            long N = Integer.parseInt(st.nextToken());
            long M = Integer.parseInt(st.nextToken());
            long ans =1;
//            if(N!=M) ans = factorial(M) / (factorial(M-N)*factorial(N));
//            System.out.println(ans);

            for(int j=0; j<N; j++){
                ans *= M-j;
                ans /= j+1;
            }
            System.out.println(ans);
        }

    }
}
