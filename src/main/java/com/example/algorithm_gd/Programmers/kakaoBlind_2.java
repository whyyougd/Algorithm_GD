package com.example.algorithm_gd.Programmers;

import java.util.Arrays;

//1차 비밀지도
public class kakaoBlind_2 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {9, 1, 21, 17, 28};
        System.out.println("answer: " + Arrays.toString(solution(n, arr1, arr2)));
        //solution2(n, arr1, arr2);
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] sum = new int[n];
        for (int i = 0; i < n; i++) {

            arr1[i] = Integer.parseInt(Integer.toBinaryString(arr1[i]));
            arr2[i] = Integer.parseInt(Integer.toBinaryString(arr2[i]));

            sum[i] = arr1[i] + arr2[i];
            String str = String.valueOf(sum[i]);

            while (str.length() < n) {
                str = " " + str;
            }
            str = str.replaceAll("[0 ]", " ");
            str = str.replaceAll("[12]", "#");

            answer[i] = str;
        }
        System.out.println(Arrays.toString(sum));
        return answer;
    }
}
