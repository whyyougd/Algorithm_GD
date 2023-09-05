package com.example.algorithm_gd.Programmers;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kakaoBlind_1 {
    public static void main(String[] args) {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};
        System.out.println(Arrays.toString(solution(today,terms,privacies)));
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        int[] answer = {};
        List<Integer> answer2 = new ArrayList<>();
        List<String> pDate = new ArrayList<>();
        List<String> pType = new ArrayList<>();
        List<String> tType = new ArrayList<>();
        List<Integer> tTerms = new ArrayList<>();

        for(int i=0; i<privacies.length; i++){
            pDate.add(privacies[i].split(" ")[0]);
            pType.add(privacies[i].split(" ")[1]);

            for(int j=0; j<terms.length;j++){
                tType.add(terms[j].split(" ")[0]);
                tTerms.add(Integer.parseInt(terms[j].split(" ")[1]));

                if(pType.get(i).equals(tType.get(j))){

                    int year = Integer.parseInt(pDate.get(i).split("\\.")[0]);
                    int month = Integer.parseInt(pDate.get(i).split("\\.")[1]);
                    int day = Integer.parseInt(pDate.get(i).split("\\.")[2]);
                    LocalDate startDate = LocalDate.of(year,month,day);


                    int year2 = Integer.parseInt(today.split("\\.")[0]);
                    int month2 = Integer.parseInt(today.split("\\.")[1]);
                    int day2 = Integer.parseInt(today.split("\\.")[2]);
                    LocalDate endDate = LocalDate.of(year2,month2,day2);

                    long monthsbetween = ChronoUnit.MONTHS.between(startDate,endDate);

                    if(monthsbetween >= tTerms.get(j)){
                        answer2.add(i+1);
                    }

                }
            }
        }

        answer = answer2.stream().mapToInt(i -> i).toArray();
        //System.out.println(Arrays.toString(answer));
        return answer;
    }
}
