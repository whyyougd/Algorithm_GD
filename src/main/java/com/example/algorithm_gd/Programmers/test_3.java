package com.example.algorithm_gd.Programmers;

import java.util.*;

// 명예의 전당(1)
public class test_3 {

    public static void main(String[] args) {
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        System.out.println(Arrays.toString(solution1(k,score)));
        System.out.println(Arrays.toString(solution2(k,score)));
    }
    public static int[] solution1(int k, int[] score) {
        int[] ans = new int[score.length];
        List<Integer> honor = new ArrayList();
        for(int i=0; i< score.length; i++){
            if(i<k-1){
                honor.add(score[i]);
                honor.sort(Collections.reverseOrder());
                ans[i] = honor.get(i);
            } else if(i>=k-1){
                honor.add(score[i]);
                honor.sort(Collections.reverseOrder());
                ans[i] = honor.get(k-1);
            }
        }
        return ans;
    }

    // 우선순위 큐 사용방법.
    public static int[] solution2(int k, int[] score){
        int[] ans = new int[score.length];

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i = 0; i<score.length; i++){

            queue.add(score[i]);

            if(queue.size()>k){
                queue.poll(); // 가장 작은 것 삭제 (다시 k개 만큼만 남게 됨)
            }

            ans[i] = queue.peek();
        }
        return ans;
    }
}
