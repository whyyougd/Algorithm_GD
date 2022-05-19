package com.example.algorithm_gd.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 블랙잭
public class Q_2798 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()); // 카드의 개수
        int M = Integer.parseInt(st.nextToken()); // 딜러의 외침 (3장으로 M이하 수 가깝게 만들기

        ArrayList<Integer> arr = new ArrayList<>();

        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for(int n=0; n<N; n++){
            int card = Integer.parseInt(st2.nextToken());
            arr.add(card);
        }
        int sum = 0;
        int tmp = 0;
        for(int i =0; i<N; i++){
            for(int j=i+1; j<N; j++){
                for(int k=j+1; k<N; k++){
                    sum = arr.get(i) + arr.get(j) + arr.get(k);
                    if(sum <= M && sum > tmp){
                        tmp = sum;
                    }
                }
            }
        }
        System.out.println(tmp);
    }
}
