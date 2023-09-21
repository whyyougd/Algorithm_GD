package com.example.algorithm_gd.Programmers;

import java.util.Arrays;
import java.util.HashMap;

// 카드 뭉치
public class lv1_1 {

    public static void main(String[] args) throws Exception {
        String[] cards1 = {"i", "water","drink",};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        //System.out.println("answer: "+ solution(cards1, cards2, goal));
        System.out.println("answer: "+ solution2(cards1, cards2, goal));
    }


    //런타임에러
    public static String solution(String[] cards1, String[] cards2, String[] goal) throws Exception {
        String answer = "";
        HashMap<String, Integer> goalMap = new HashMap<>();
        for(int i=0;i<goal.length;i++){
            goalMap.put(goal[i],i);
        }
        int temp1 = -1 ;
        for(int i=0;i<cards1.length;i++){
            if (temp1 < goalMap.get(cards1[i]) ) answer = "Yes";
            else {
                answer = "No";
                return answer;
            }
            temp1 = goalMap.get(cards1[i]);
        }
        int temp2 = -1 ;
        for(int i=0;i<cards2.length;i++){
            if (temp2 < goalMap.get(cards2[i]) ) answer = "Yes";
            else {
                answer = "No";
                return answer;
            }
            temp2 = goalMap.get(cards2[i]);
        }
        return answer;
    }

    public static String solution2(String[] cards1, String[] cards2, String[] goal) throws Exception {
        String answer = "Yes";
        int one=0;
        int two=0;
        int i =0;
        while(i < goal.length){
            if(one< cards1.length && goal[i].equals(cards1[one])){
                one++;
            } else if(two< cards2.length && goal[i].equals(cards2[two])){
                two++;
            } else {
                answer = "No";
                break;
            }
            i++;
        }
        return answer;
    }
}
