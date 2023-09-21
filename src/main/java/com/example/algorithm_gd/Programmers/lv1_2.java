package com.example.algorithm_gd.Programmers;

// 푸드파이트 대회
public class lv1_2 {

    public static void main(String[] args) throws Exception {
        int[] food = {1,3,7,6};
        System.out.println("answer: "+ solution(food));
    }

    public static String solution(int[] food) {
        StringBuilder answer = new StringBuilder();

        for(int i=1;i<food.length;i++){
            int cnt = 0;
            while(cnt<food[i]/2){
                answer.append(i);
                cnt++;
            }
        }

        StringBuilder ans = new StringBuilder(answer.toString());
        String reverse = answer.reverse().toString();
        ans.append("0").append(reverse);

        return ans.toString();
    }
}
