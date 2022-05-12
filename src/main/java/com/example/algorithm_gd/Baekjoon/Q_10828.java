package com.example.algorithm_gd.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

// #10828 스택
public class Q_10828 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        int N = Integer.parseInt(bf.readLine()); // 케이스 수

        for(int t=0; t<N; t++){
            String str = bf.readLine(); // push 3 이면 push 3 한줄 다 출력

            if(str.contains("push")){
                stack.push(Integer.parseInt(str.split(" ")[1]));
            }
            else if(str.equals("pop")){
                System.out.println(stack.empty()?-1:stack.pop());
            }
            else if(str.equals("size")){
                System.out.println(stack.size());
            }
            else if(str.equals("empty")){
                System.out.println(stack.empty()?1:0);
            }
            else if(str.equals("top")){
                System.out.println(stack.empty()?-1:stack.peek());
            }

        }
    }
}