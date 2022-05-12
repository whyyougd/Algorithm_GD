package com.example.algorithm_gd.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

//// #1927 최소 힙
public class Q_1927 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());

        PriorityQueue<Integer> que = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(bf.readLine()); // 입력 값

            if (num == 0)
                sb.append(que.size() == 0 ? 0 : que.poll()).append('\n'); // 0일때 비어있으면 0출력, 안비어있으면 최댓값 출력
            else que.add(num);
        }
        System.out.println(sb);
    }
}
