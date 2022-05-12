package com.example.algorithm_gd.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

//// #9012 괄호
public class Q_9012 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Character> stack = new Stack<>();

        int T = Integer.parseInt(bf.readLine()); // 케이스 수

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String str = st.nextToken();

            for (int i = 0; i < str.length(); i++) {

                switch (str.charAt(i)) {
                    case '(':
                        stack.push('(');
                        break;

                    case ')':
                        if (stack.empty()) {
                            stack.push('x');
                        } else {
                            if (stack.peek() != 'x') stack.pop();
                        }
                        break;
                }
            }
            if (stack.empty()) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
            stack.clear();
        }
        System.out.println(sb);
    }
}
