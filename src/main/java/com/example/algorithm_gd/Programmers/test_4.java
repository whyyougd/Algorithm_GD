package com.example.algorithm_gd.Programmers;

// 기사단원의 무기
public class test_4 {

    public static void main(String[] args) {
        System.out.println(solution(10,3,2));
    }
    public static int solution(int number, int limit, int power) {
        int res = 0;
        for(int i = 0; i<=number; i++){
            int cnt = 0;
            // 아래처럼 약수 갯수 구해야 속도 통과 가능
            for(int j=1; j*j<=i; j++){
                if(j*j==i) cnt++;
                else if(i%j==0) cnt +=2;
            }
            if(cnt>limit) cnt = power;
            res += cnt;
        }

        return res;
    }
}
