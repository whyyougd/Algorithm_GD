package com.example.algorithm_gd.Programmers;

import java.util.Arrays;

//가장 가까운 같은 글자
public class test_2 {

    public static void main(String[] args) {
        String s = "banana";
        System.out.println(Arrays.toString(solution(s))); // -1 -1 -1 2 2 2
        System.out.println(Arrays.toString(solution2(s)));
    }
    public static int[] solution(String s) {
        int[] ans = new int[s.length()];
        ans[0] = -1;
        for(int i =1; i<s.length(); i++) {
            int x = s.lastIndexOf(s.substring(i,i+1),i-1);
//			System.out.println("i: "+i);
//			System.out.println(s.lastIndexOf(s.substring(i,i+1),i-1));
            if(x!=-1) ans[i] = i-x;
            else ans[i] = x;
        }
        return ans;
    }

    public static int[] solution2(String s) {
        int[] ans = new int[s.length()];
        char[] ss = s.toCharArray();
        for(int i=0;i<s.length();i++) {
            ans[i]= -1;
            for(int j=1;j<=i;j++) {
                if(ss[i-j]==ss[i]) {
                    ans[i]=j;
                    break;
                }
            }
        }

        return ans;
    }
}