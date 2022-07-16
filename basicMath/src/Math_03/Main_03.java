package Math_03;// 기초 수학 - 경우의 수

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main_03 {
    public static void main(String[] args) {

//      1. 합의 법칙
        System.out.println("== 합의 법칙 ==");
//      두 개의 주사를 던졌을 때 합이 3 또는 4의 배수일 경우의 수

        int[] dice1 = {1, 2, 3, 4, 5, 6};
        int[] dice2 = {1, 2, 3, 4, 5, 6};

        int nA = 0;
        int nB = 0;
        int nAandB = 0;
        
        // 기본 풀이
        for(int item1: dice1) {
            for(int item2: dice2) {
                if((item1 + item2) % 3 == 0) {
                    nA += 1;
                } 
                if((item1 + item2) % 4 == 0) {
                    nB += 1;
                }
                if((item1 + item2) % 3 == 0 && (item1 + item2) % 4 == 0 ) {
                    nAandB += 1;
                }
            }
        }
        int result = nA + nB - nAandB;
        System.out.println("result = " + result); // result = 20

        
        // HashSet 이용
        HashSet<ArrayList> allCase = new HashSet<>();
        for(int item1: dice1) {
            for(int item2: dice2) {
                if((item1 + item2) % 3 == 0 || (item1 + item2) % 4 == 0) {
                    ArrayList list = new ArrayList(Arrays.asList(item1, item2));
                    allCase.add(list);
                }
            }
        }
        System.out.println("allCase = " + allCase); // allCase = [[2, 1], [5, 4], [2, 2], [3, 3], [4, 4], [6, 6], [1, 2], [4, 5], [1, 3], [2, 4], [3, 5], [3, 6], [1, 5], [2, 6], [5, 1], [6, 2], [6, 3], [3, 1], [4, 2], [5, 3]]
        System.out.println("allCase.size() = " + allCase.size()); // allCase.size() = 20

//      2. 곱의 법칙
        System.out.println("== 곱의 법칙 ==");
//      두 개의 주사위 a, b를 던졌을 때 a는 3의 배수, b는 4의 배수인 경우의 수
        nA = 0;
        nB = 0;
        result = 0;
        // 풀이법 1
        for(int item1: dice1) {
            for(int item2: dice2) {
                if(item1 % 3 == 0 && item2 % 4 == 0) {
                    result += 1;
                }
            }
        }
        System.out.println("결과: " + result); // 결과: 2

        //풀이법 2
        for(int item1: dice1) {
            if(item1 % 3 == 0) {
                nA++;
            }
        }

        for(int item2: dice2) {
            if(item2 % 4 == 0) {
                nB++;
            }
        }
        System.out.println("결과: " + (nA * nB)); // 결과: 2

    }
}
