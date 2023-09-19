package com.example.algorithm_gd.Programmers;

import java.util.*;

//달리기 경주
public class lv2_4 {
    public static void main(String[] args) throws Exception {
        String[] players = {"mumu","soe","poe","kai","mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        //System.out.println("answer: "+ Arrays.toString(solution(players, callings)));
        System.out.println("answer: "+ Arrays.toString(solution2(players, callings)));
    }

    public static String[] solution2(String[] players, String[] callings) {
        HashMap<String, Integer> playerMap = new HashMap<>();
        String temp;
        int cnt;
        for(int i =0;i<players.length;i++){
            playerMap.put(players[i],i);
        }
        for(int j=0; j<callings.length;j++){
            cnt = playerMap.get(callings[j]);
            temp = players[cnt-1];
            players[cnt-1] = players[cnt];
            players[cnt] = temp;

            playerMap.replace(callings[j],cnt-1);
            playerMap.replace(temp,cnt);
        }

        return players;
    }


    // 시간 초과 (2중 for문으로 인해)
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        String temp;
        for(int i =0;i<callings.length;i++){
            for(int j=0;j<players.length;j++){
                if(callings[i].equals(players[j])) {
                    temp = players[j-1];
                    players[j-1] = players[j];
                    players[j] = temp;
                }
            }
        }

        return players;
    }

}
