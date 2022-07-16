package recursion;

// 알고리즘 강의_Recursion_권오흠
public class StudyRecursion1_7 {
    public static void main(String[] args) {
        String str = new String("maeng0830");
        int result = length(str);
        System.out.println("result = " + result); // result = 9
    }

    public static int length(String str) {
        if(str.equals("")) {
            return 0;
        } else {
            return 1 + length(str.substring(1));
        }
    }
}
