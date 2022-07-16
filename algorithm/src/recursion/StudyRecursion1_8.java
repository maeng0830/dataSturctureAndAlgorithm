package recursion;

// 알고리즘 강의_Recursion_권오흠
public class StudyRecursion1_8 {
    public static void main(String[] args) {
        String str = "maeng0830";
        printChar(str); // maeng0830
    }

    public static void printChar(String str) {
        if(str.length() == 0) {
            return;
        } else {
            System.out.print(str.charAt(0));
            printChar(str.substring(1));
        }
    }
}
