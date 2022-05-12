package com.example.algorithm_gd.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// #1436 영화감독 숌
public class Q_1436 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine()); // 케이스 수

        int num = 0;

        while(N>0){
            num++;
            if(Integer.toString(num).contains("666")) N--;
        }
        System.out.println(num);
    }
}
