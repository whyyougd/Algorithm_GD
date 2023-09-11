package com.example.algorithm_gd.Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kakaoBlind_3 {
    // [1차] 다트 게임
    public static void main(String[] args) throws Exception {
        String dartResult = "1T2D3D#";
        //System.out.println("answer : " + solution(dartResult));
        System.out.println("answer : " + solution(dartResult));
    }


    public static int solution(String dartResult) throws Exception {
        int answer = 0;
        List<String> res = new ArrayList<>();
        List<String> score = new ArrayList<>();
        List<Integer> bonus = new ArrayList<>();
        List<String> option = new ArrayList<>();


        for (int i = 0; i < 3; i++) {
            res.add(dartResult.split("[0-9]+")[i + 1]);
            score.add(dartResult.split("\\D+")[i]);

            res.set(i, res.get(i).replaceAll("S", "1"));
            res.set(i, res.get(i).replaceAll("D", "2"));
            res.set(i, res.get(i).replaceAll("T", "3"));

            if (res.get(i).length() == 1) {
                bonus.add(Integer.parseInt(res.get(i)));
                option.add("");
            } else if (res.get(i).length() == 2) {
                bonus.add(Integer.parseInt(res.get(i).split("\\D")[0]));
                option.add(String.valueOf(res.get(i).charAt(res.get(i).length() - 1)));
            }
        }

        List<Integer> sum = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            sum.add((int) Math.pow(Integer.parseInt(score.get(i)), bonus.get(i)));
            if (option.get(i).equals("*")) {
                sum.set(i, sum.get(i) * 2);
                if (i > 0) sum.set(i - 1, sum.get(i - 1) * 2);
            } else if (option.get(i).equals("#")) {
                sum.set(i, sum.get(i) * -1);
            }
        }
        for (int i = 0; i < 3; i++) {
            answer += sum.get(i);
        }


        return answer;
    }
}
