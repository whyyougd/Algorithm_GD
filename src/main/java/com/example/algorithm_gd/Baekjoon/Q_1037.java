package com.example.algorithm_gd.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

//// #1037 약수
public class Q_1037 {
        public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine()); //약수개숫
        StringTokenizer st = new StringTokenizer(bf.readLine());
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i =0; i<N; i++){
            arr.add(Integer.parseInt(st.nextToken()));
        }
        int A = 0;
        if(N==1){
            A = arr.get(0)*arr.get(0);
        } else A = Collections.max(arr)*Collections.min(arr);

        System.out.println(A);

    }
}
