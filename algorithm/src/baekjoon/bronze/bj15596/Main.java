// https://www.acmicpc.net/problem/15596
package baekjoon.bronze.bj15596;

class Test {
    public static long sum(int[] a) {
        long ans = 0;

        for (int num: a) {
            ans += (long) num;
        }

        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Test test = new Test();

    }
}
