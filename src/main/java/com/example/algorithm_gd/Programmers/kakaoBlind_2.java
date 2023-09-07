package com.example.algorithm_gd.Programmers;

import java.util.Arrays;
import java.util.Objects;

//1차 비밀지도
public class kakaoBlind_2 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {9, 1, 21, 17, 28};
        //System.out.println("answer: " + Arrays.toString(solution(n, arr1, arr2)));
        System.out.println(Arrays.toString(solution2(n, arr1, arr2)));
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

    /*
    다른 방법
     */
    public static String[] solution2(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i=0; i<n; i++){
            String str1= Integer.toBinaryString(arr1[i]);
            String str2= Integer.toBinaryString(arr2[i]);

            while(str1.length()<n){
                str1 = "0" + str1;
            }
            while(str2.length()<n){
                str2 = "0" + str2;
            }
            String row = "";
            for(int j=0;j<n;j++){
                if(Objects.equals(str1.split("")[j], "1") || Objects.equals(str2.split("")[j], "1"))
                    row += "#";
                else if(Objects.equals(str1.split("")[j], "0") && Objects.equals(str2.split("")[j], "0"))
                    row += " ";
            }
            answer[i] = row;
        }

        return answer;
    }
}
