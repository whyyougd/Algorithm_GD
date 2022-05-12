package com.example.algorithm_gd.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

// #11279 최대 힙
public class Q_11279 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(bf.readLine());

//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i=0;i<N;i++){
//
//            int x = Integer.parseInt(bf.readLine());
//            if(x==0){
//                if(arr.size()==0){
////                    System.out.println(0);
//                    sb.append(0).append("\n");
//                }
//                else {
////                    System.out.println(Collections.max(arr));
//                    sb.append(Collections.max(arr)).append("\n");
//                    arr.remove(Collections.max(arr));
//                }
//            } else{
//                arr.add(x);
//            }
//        }
//        System.out.println(sb); // 시간 경과로 오류. 시간이 빡빡한 문제

        PriorityQueue<Integer> que = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(bf.readLine()); // 입력 값

            if (num == 0)
                sb.append(que.size() == 0 ? 0 : que.poll()).append('\n'); // 0일때 비어있으면 0출력, 안비어있으면 최댓값 출력
            else que.add(num);
        }
        System.out.println(sb);
    }
}
