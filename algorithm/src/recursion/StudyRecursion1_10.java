package recursion;

// 알고리즘 강의_Recursion_권오흠
public class StudyRecursion1_10 {
    public static void main(String[] agrs) {
        int n = 10;
        printInBinary(n); // 1010
    }


    public static void printInBinary(int n) {
        if (n < 2) {
            System.out.print(n);
        } else {
            printInBinary(n/2);
            System.out.print(n%2);
        }
    }
}
