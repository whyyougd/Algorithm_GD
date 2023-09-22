package com.example.algorithm_gd.Programmers;

import java.util.*;

// 카카오 성격 유형 검사하기
public class kakao_4 {

    public static void main(String[] args) throws Exception {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5,3,2,7,5};
        System.out.println("answer: "+ solution(survey,choices));
    }


    public static String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        String disagree;
        String agree;
        Map<String,Integer> type = new HashMap<>();
        String[] types = {"R","T","C","F","J","M","A","N"};
        for(String element:types){
            type.put(element,0);
        }

        for(int i=0;i<survey.length;i++){
            disagree = survey[i].split("")[0];
            agree = survey[i].split("")[1];
            if(choices[i]>=4){
                type.replace(agree,type.get(agree)+choices[i]-4);
            } else {
                type.replace(disagree,type.get(disagree)+Math.abs(choices[i]-4));
            }

        }
        //System.out.println(type);

        answer.append(type.get("R")>=type.get("T") ? "R" : "T");
        answer.append(type.get("C")>=type.get("F") ? "C" : "F");
        answer.append(type.get("J")>=type.get("M") ? "J" : "M");
        answer.append(type.get("A")>=type.get("N") ? "A" : "N");

        return answer.toString();
    }
}
