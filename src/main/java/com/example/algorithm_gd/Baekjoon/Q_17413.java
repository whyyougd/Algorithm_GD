package com.example.algorithm_gd.Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

// #17413 단어 뒤집기 2
public class Q_17413 {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String res = "";

//        System.out.println(res);
//        ArrayList<Character> arr2 = new ArrayList<>();
//        int[] A= new int[]; int B=0;
//        for(int i=0;i<str.length();i++){
//            arr2.add(str.charAt(i));
//            if(arr2.get(i)=='<') A = i;
//            if(arr2.get(i)=='>') B = i;
//        }


        // 띄어쓰기로 구분 안될 때가 있음..
        String arr[] = str.split(" ");

        for(int i=0;i < arr.length;i++){
            if(arr[i].charAt(0) == '<'){
                res += arr[i] + " ";
            } else{
                for(int j=arr[i].length()-1;j>=0;j--){
                    res += arr[i].charAt(j);
                }
                System.out.println(Arrays.toString(arr));
                res += " ";
            }
        }
        System.out.println(res);
    }
}
