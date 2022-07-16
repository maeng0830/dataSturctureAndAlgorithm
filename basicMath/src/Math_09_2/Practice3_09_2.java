package Math_09_2;

public class Practice3_09_2 {
    public static String solution(String equation) {
        String[] parts = equation.split("=");
        int[] leftside = evaluate(parts[0]);
        int[] rightside = evaluate(parts[1]);

        if (leftside[0] == rightside[0] && leftside[1] == rightside[1]) {
            return "Infinite solutions";
        } else if (leftside[0] == rightside[0]) {
            return "No solution";
        } else {
            return "x=" + (rightside[1] - leftside[1]) / (leftside[0] - rightside[0]);
        }
    }

    public static int[] evaluate(String str) {
        int[] result = new int[2];

        boolean isMinus = false;
        int idx = 0;
        while (idx != str.length()) {
            char c = str.charAt(idx++);

            if (c == '+') {
                continue;
            }

            if (c == '-') {
                isMinus = true;
                continue;
            }

            if (c == 'x') {
                result[0] += isMinus ? -1 : 1;
            } else {
                if (idx < str.length() && str.charAt(idx) == 'x') {
                    result[0] += isMinus ? -(c - '0') : (c - '0');
                } else {
                    result[1] += isMinus ? -(c - '0') : (c - '0');
                }
            }
            isMinus = false;
        }
        return result;
    }

    // # 2 정규표현식 사용
//    public static int[] evaluate2(String str) {
//        return null;
//    }

    public static void main(String[] args) {
        // Test code
        String equation = "x+5-3+x=6+x-2";
        System.out.println(solution(equation));

        equation = "x=x";
        System.out.println(solution(equation));

        equation = "2x=x";
        System.out.println(solution(equation));
    }
}
