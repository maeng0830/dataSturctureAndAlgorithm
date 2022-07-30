package lineardatastructure.lds_14_1_practice1;

import java.util.Stack;

public class Practice4 {
    public static void solution(String str) {
        Stack stack = new Stack();
        String[] strArr = str.split("");

        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("(") || strArr[i].equals("{") || strArr[i].equals("[")) {
                stack.push(strArr[i]);
            } else if(strArr[i].equals(")")) {
                if (stack.isEmpty()) {
                    System.out.println("FAIL!");
                    return;
                } else if (stack.peek().equals("(")) {
                    stack.pop();
                } else {
                    System.out.println("FAIL!");
                    return;
                }
            } else if (strArr[i].equals("}")) {
                if (stack.isEmpty()) {
                    System.out.println("FAIL!");
                    return;
                } else if (stack.peek().equals("{")) {
                    stack.pop();
                } else {
                    System.out.println("FAIL!");
                    return;
                }
            } else if (strArr[i].equals("]")) {
                if (stack.isEmpty()) {
                    System.out.println("FAIL!");
                    return;
                } else if (stack.peek().equals("[")) {
                    stack.pop();
                } else {
                    System.out.println("FAIL!");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("PASS!");
        }
    }

    public static void main(String[] args) {
        // Test code
        solution("[yyyy]-[mm]-[dd]");               // Pass
        solution("System.out.println(arr[0][1))");  // FAIL
        solution("Support [Java or Python(3.x)]");  // PASS
        solution("([[{}])");                        // FAIL
        solution(")(");
    }
}
