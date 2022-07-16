package recursion;

// 알고리즘 강의_Recursion_권오흠
public class StudyRecursion1_6 {
    public static void main(String[] args) {
        int m = 30;
        int n = 20;
        double result = gcd(m, n);
        System.out.println("result = " + result); // 10.0
    }

    // 최대공약수(gcd)
    // m>=n인 두 양의 정수 m, n이 있다.
    // m % n = 0이라면, gcd(m, n)은 n이다.
    // 그렇지 않다면, gcd(m, n) = gcd(n, m % n)
    public static double gcd(int m, int n) {
        if(m < n) {
            int temp = m;
            m = n;
            n = temp;
        }

        if(m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }
    }
}
