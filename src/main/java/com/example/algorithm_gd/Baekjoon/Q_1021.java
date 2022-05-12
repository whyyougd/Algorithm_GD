package com.example.algorithm_gd.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

//// #1021 회전하는 큐
public class Q_1021 {
    public static void main(String[] args) throws IOException {

        // 뒤에서도 뽑으려면 deque 사용!
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

//        Deque<Integer> deque = new LinkedList<>();
        LinkedList<Integer> deque = new LinkedList<>();
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken()); // 큐 크기
        int M = Integer.parseInt(st.nextToken()); // 뽑으려는 갯수수

        for (int i = 1; i <= N; i++) {
            deque.offer(i);     // 숫자 1부터 N까지 큐 입력
        }

        int[] seq = new int[M];    // 뽑고자 하는 수를 담은 배열

        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < M; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {

            int target = 0;
//            if(deque.contains(seq[i])) target = i;
            target = deque.indexOf(seq[i]);

            if (target < deque.size() / 2) {
                // idx 보다 앞에 있는 원소들을 모두 뒤로 보낸다. (2번 연산)
                for (int j = 0; j < target; j++) {
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    cnt++;
                }
            } else {    // 중간 지점보다 원소의 위치가 뒤에 있는 경우
                // idx를 포함한 뒤에 있는 원소들을 모두 앞으로 보낸다. (3번 연산)
                for (int j = 0; j < deque.size() - target; j++) {
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    cnt++;
                }
            }
            deque.pollFirst();
        }
        System.out.println(cnt);

    }
}
