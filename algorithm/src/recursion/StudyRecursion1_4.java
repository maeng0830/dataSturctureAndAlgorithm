package recursion;

// 알고리즘 강의_Recursion_권오흠
public class StudyRecursion1_4 {
    public static void main(String[] args) {
        double x = 2.5;
        double n = 4;
        double result = power(x, n);
        System.out.println("result = " + result); // result = 39.0625
    }

    public static double power(double x, double n) {
        if(n == 0) {
            return 1;
        } else {
         return x * power(x, n - 1);
        }
    }
}
