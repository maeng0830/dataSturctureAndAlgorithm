package Math_02;// 기초 수학 - 집합

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main_02 {
    public static void main(String[] args) {

//      1. 자바에서 집합 사용 - HashSet
        System.out.println("== HashSet ==");
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(1);
        set1.add(1);
        System.out.println("set1 = " + set1); // set1 = [1]
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1); // set1 = [1, 2, 3]
        set1.remove(1);
        System.out.println("set1 = " + set1);  // set1 = [2, 3]
        System.out.println(set1.size()); // 2
        System.out.println(set1.contains(2)); // true
        

//      2. 집합 연산
        System.out.println("== 집합 연산 ==");

//      2-1. 교집합
        HashSet a = new HashSet(Arrays.asList(1, 2, 3, 4, 5)); // 집합 a 생성
        HashSet b = new HashSet(Arrays.asList(2, 4, 6, 8, 10)); // 집합 b 생성
        a.retainAll(b); // 교집합
        System.out.println("교집합: " + a); // 교집합: [2, 4]
        a.add(1);
        a.add(3);
        a.add(5);

//      2-2. 합집합
        a.addAll(b);
        System.out.println("합집합: " + a); // 합집합: [1, 2, 3, 4, 5, 6, 8, 10]
        a.clear();
        for(int i = 0; i < 5; i++) {
            a.add(i+1);
        }

//      2-3. 차집합
        a.removeAll(b);
        System.out.println("차집합: " + a); // 차집합: [1, 3, 5]

    }

}
