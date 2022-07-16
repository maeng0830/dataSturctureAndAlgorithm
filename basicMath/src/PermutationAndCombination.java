public class PermutationAndCombination {
    public static void main(String[] args) {
        // Factorial: 1~n까지 모든 자연수의 곱
        // 5!
        int n = 5;
        int result = 1;
        for (int i = 5; i > 0; i--) {
            result *= i;
        }
        System.out.println(result);

        // Permutation: 서로 다른 n개에서 r개를 선택하는 경우의 수. 순서를 고려한다(순서가 다르면 다른 경우로 판단한다). 중복을 허용하지 않는다.
        // 5명을 3줄로 세우는 경우의 수
        n = 5;
        int r = 3;
        result = 1;
        for (int i = n; i >= n - r + 1 ; i--) {
            result *= i;
        }
        System.out.println(result);

        // Permutation with Repetition: 서로 다른 n개에서 r개를 선택하는 경우의 수. 순서를 고려한다. 중복을 허용한다(한 경우에 동일한 원소의 중복을 허용한다).
        // 5명을 3줄로 세우는 경우의 수(중복 허용)
        n = 5;
        r = 3;
        result = 1;
        for (int i = 0; i < r; i++) {
            result *= n;
        }
        System.out.println(result);

        // Combination: 서로 다른 n개에서 r개를 선택하는 경우의 수. 순서를 고려하지 않는다(순서가 달라도 원소가 동일하면 동일한 경우로 판단한다). 중복을 허용하지 않는다.
        // 4명 중 2명을 주번으로 뽑는 경우의 수
        n = 4;
        r = 2;
        int pResult = 1;
        int rResult = 1;

        for (int i = n; i >= n - r + 1 ; i--) {
            pResult *= i;
        }

        for (int i = r; i > 0; i--) {
            rResult *= i;
        }

        System.out.println(pResult / rResult); // 6

        // Combination with Repetition: 서로 다른 n개에서 r개를 선택하는 경우의 수. 순서를 고려하지않는다. 중복을 허용한다.
        // 후보 2명, 유권자 3명이 무기명 투표를 진행할 때 경우의 수
        n = 2;
        r = 3;
        int sN = n + r - 1;
        result = 1;
        pResult = 1;
        rResult = 1;

        for (int i = sN; i >= sN - r + 1; i--) {
            pResult *= i;
        }

        for (int i = r; i > 0; i--) {
            rResult *= i;
        }

        System.out.println(pResult / rResult);
    }
}
