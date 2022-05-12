package com.example.algorithm_gd.Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;
// #1292 쉽게 푸는 문제
public class Q_1292 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int cnt = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<B;i++){
            for(int j=0;j<=i;j++){
                arr.add(cnt);
            }
            cnt++;
        }
        System.out.println(arr);

        int sum =0;
        for(int i=A;i<=B;i++){
            sum += arr.get(i-1);
        }
        System.out.println(sum);
    }
}