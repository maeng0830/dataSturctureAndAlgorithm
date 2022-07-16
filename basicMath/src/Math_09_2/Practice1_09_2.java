package Math_09_2;

public class Practice1_09_2 {

    public static int solution(int n) {
        int result = 0;

        if (n <= 1) {
            return 1;
        }

        for (int i = 0; i < n; i++) {
            result += solution(i) * solution(n - i - 1);
        }

        return result;
    }


    public static void main(String[] args) {
        // Test code
        System.out.println(solution(0));
        System.out.println(solution(2));
        System.out.println(solution(5));
        System.out.println(solution(7));
    }
}