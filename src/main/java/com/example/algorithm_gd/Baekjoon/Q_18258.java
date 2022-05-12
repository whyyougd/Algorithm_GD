package com.example.algorithm_gd.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

//// #18258 큐2
public class Q_18258 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        // StringBuffer vs StringBuilder (멀티쓰레드 vs 단일쓰레드)

        int N = Integer.parseInt(bf.readLine()); // 케이스 수

//        Queue<Integer> queue = new LinkedList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int t = 0; t < N; t++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            String str = st.nextToken();

            switch (str) {
                case "push":
                    deque.add(Integer.parseInt(st.nextToken()));
                    break;

                case "pop":
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else sb.append(deque.poll()).append('\n');
                    break;

                case "size":
                    sb.append(deque.size()).append('\n');
                    break;

                case "empty":
                    if (deque.isEmpty()) sb.append(1).append('\n');
                    else sb.append(0).append('\n');
                    break;

                case "front":
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else sb.append(deque.peek()).append('\n');
                    break;

                case "back":
                    if (deque.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else sb.append(deque.peekLast()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}
