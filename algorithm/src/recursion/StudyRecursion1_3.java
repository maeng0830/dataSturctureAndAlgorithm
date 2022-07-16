package recursion;

// 알고리즘 강의_Recursion_권오흠
public class StudyRecursion1_3 {
    public static void main(String[] args) {
        int n = 4;
        int result = factorial(n);
        System.out.println("result = " + result); // 24
    }

    public static int factorial(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
