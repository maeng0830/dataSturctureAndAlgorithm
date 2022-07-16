package recursion;

// 알고리즘 강의_Recursion_권오흠
public class StudyRecursion1_11 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        int n = 3;
        int result = sum(n, data);
        System.out.println("result = " + result); // result = 6
    }

    public static int sum(int n, int[] data) {
        if(n <= 0) {
            return 0;
        } else {
            return sum(n-1, data) + data[n - 1];
        }
    }
}
