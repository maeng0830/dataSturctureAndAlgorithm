package recursion;

// 알고리즘 강의_Recursion_권오흠
public class StudyRecursion1_5 {
    public static void main(String[] args) {
        int n = 4;
        int result = fibonacci(n);
        System.out.println("result = " + result);
    }
    //피보나치 수열
    //f_0 = 0
    //f_1 = 1
    //f_n = f_(n-1) + f_(n-2),  n > 1
    public static int fibonacci(int n) {
        if(n < 2) {
            return n;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }
}
