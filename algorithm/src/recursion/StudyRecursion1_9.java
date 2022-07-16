package recursion;

// 알고리즘 강의_Recursion_권오흠
public class StudyRecursion1_9 {
    public static void main(String[] args) {
        String str = "maeng0830";
        printCharReverse(str); // 0380gneam

    }

    public static void printCharReverse(String str) {
        if(str.length() == 0) {
            return;
        } else {
            printCharReverse(str.substring(1));
            System.out.print(str.charAt(0));
        }
    }
}
