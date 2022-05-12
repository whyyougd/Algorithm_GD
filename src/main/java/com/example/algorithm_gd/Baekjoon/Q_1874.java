package com.example.algorithm_gd.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;

//// #1874 스택 수열
public class Q_1874 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Stack<Integer> stack = new Stack<>();
        ArrayList<String> ans = new ArrayList<>();

        int N = Integer.parseInt(bf.readLine()); // 케이스 수

        int[] input = new int[N + 1];
        for (int i = 0; i < N; i++) {
            input[i] = Integer.parseInt(bf.readLine()); // 입력값 받아오기
        }

        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            stack.push(i);
            ans.add("+");
            while (!stack.empty() && stack.peek() == input[cnt]) { // 4를 push했는데 input값과 같아지면면
                stack.pop();
                ans.add("-");
                cnt++;
            }
        }

        if (stack.empty()) {
            for (int i = 0; i < ans.size(); i++)
                System.out.println(ans.get(i));
        } else
            System.out.println("NO");

    }
}
