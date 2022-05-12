package com.example.algorithm_gd.Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//// #2869 달팽이는 올라가고 싶다
public class Q_2869 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine()); // (bf.readLine()," ")
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

//        int cnt =0;
//        while(true){
//            if(V-A==0) {
//                cnt ++; break;
//            }
//            V += B - A;
//            cnt++;
//            if(V<=0) break;
//        }
//        System.out.println(cnt);

        int ans = (int) Math.ceil((double) (V - B) / (A - B));

        System.out.println(ans);
    }
}
