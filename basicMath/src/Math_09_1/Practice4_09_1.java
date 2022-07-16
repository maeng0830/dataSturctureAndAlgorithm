package Math_09_1;

import java.util.HashSet;

public class Practice4_09_1 {
    public static boolean solution(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (set.add(n)) {
            int sqaureSum = 0;
            while (n > 0) {
                int remain = n % 10;
                sqaureSum += remain * remain;
                n /= 10;
            }

            if (sqaureSum == 1) {
                return true;
            } else {
                n = sqaureSum;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Test code
        System.out.println(solution(19));
        System.out.println(solution(2));
        System.out.println(solution(61));
    }
}
