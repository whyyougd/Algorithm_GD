package com.example.algorithm_gd.Baekjoon;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Q_1013 {
    // (100+1+ | 01)+
    // ex) 0110001011001 -> "YES"
    // ex) 011000100110001 -> "NO"

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        String testCase;

        // 아래처럼 재귀로 일일히 돌려서 할 경우 왠지 모르겠지만 틀리다고 나옴..
//        for(int i=0;i<T;i++){
//            testCase = sc.next();
//            try {
//                firstArg(testCase);
//            } catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        }

        // 정규식을 사용하여 쉽게 가능
        String vega = "(100+1+|01)+";
        for(int i=0; i<T; i++){
            testCase = sc.next();
            if(testCase.matches(vega)) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static void firstArg(String testCase) {

        if(testCase.equals("YES")||testCase.equals("NO")) {
            System.out.println(testCase);
        }

        if(testCase.substring(0,2).equals("10")){
            testCase = testCase.substring(2);
            secondArg(testCase,0);
        } else if(testCase.substring(0,2).equals("01")){
            testCase = testCase.substring(2);
            firstArg(testCase);
        } else {
            System.out.println("NO");
        }
    }

    public static void secondArg(String testCase, int cnt) {

        if(testCase.equals("")) {
            testCase="YES";
        }

        if (testCase.charAt(0) == '0' && cnt < 2) {
            testCase = testCase.substring(1);
            secondArg(testCase, 1);
        } else if (testCase.charAt(0) == '1' && cnt > 0) {
            testCase = testCase.substring(1);
            secondArg(testCase, 2);
        } else if (testCase.substring(0, 2).equals("01") && cnt > 1) {
            firstArg(testCase);
        } else {
            if(testCase.equals("YES")) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
