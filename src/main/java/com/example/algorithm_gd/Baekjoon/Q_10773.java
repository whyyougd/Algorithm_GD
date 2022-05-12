package com.example.algorithm_gd.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//// #10773 제로
public class Q_10773 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>(); // 스택

        int K = Integer.parseInt(bf.readLine()); // 케이스 수
        int cnt = 0;

        for (int k = 0; k < K; k++) {
            int num = Integer.parseInt(bf.readLine());

            if (num != 0) {
                stack.push(num);
                cnt++;
            } else if (num == 0) {
                stack.pop();
                cnt--;
            }
        }

        // 스택안의 원소들 합구하기
        int ans = 0;
        for (int i = 0; i < cnt; i++) {
            ans += stack.pop();
        }
        System.out.println(ans);

        // 찾아보니
//        int sum =0;
//        while(!stack.empty()) sum += stack.pop();
//        System.out.println(sum);

    }
}
