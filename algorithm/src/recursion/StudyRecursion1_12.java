package recursion;

// 알고리즘 강의_Recursion_권오흠
// 순환적 알고리즘 설계
// 적어도 하나의 base case, 즉 순환되지 않고 종료되는 case가 있어야 한다.
// 모든 recursive case는 결국, base case로 수렴해야한다.

// 1. 암시적(implicit) 매개변수를 명시적(explicit) 매개변수로 바꿔라. 첫 메소드 호출 때 뿐만아니라, 반복적인 메소드 호출 할 때의 매개변수를 고려하자.
// 아래의 두 함수는 순차 탐색을 목표로 동작한다.
// 두 번째 함수는 검색 구간의 시작점을 명시적으로 지정하고 있다.
public class StudyRecursion1_12 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = data.length;
        int end = data.length;
        int begin = 0;
        int target = 7;
        int result = searchImplicit(data, n, target);
        System.out.println("result = " + result); // 6
        result = searchExplicit(data, begin, end, target);
        System.out.println("result = " + result); // 6
    }

    public static int searchImplicit(int[] data, int n, int target) {
        for (int i = 0; i < n; i++) {
            if(data[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int searchExplicit(int[] data, int begin, int end, int target) {
        if (begin > end) {
            return -1;
        } else if (target == data[begin]) {
            return begin;
        } else {
            return searchExplicit(data, begin + 1, end, target);
        }
    }
}
