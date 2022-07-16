package recursion;

// 알고리즘 강의_Recursion_권오흠
public class StudyRecursion1_2 {
    public static void main(String[] args) {
        int result = func(4);
        System.out.println("result = " + result); // 10;
    }

    public static int func(int n) {
        if(n <= 0) {
            return 0;
        } else {
            return n + func(n - 1);
        }
    }
}
