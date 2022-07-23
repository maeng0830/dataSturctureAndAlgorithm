// https://www.acmicpc.net/problem/2480
package baekjoon.bronze.bj2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        int a;
        int b;
        int c;
        int price;
        int max;

        input = reader.readLine().split(" ");

        a = Integer.parseInt(input[0]);
        b = Integer.parseInt(input[1]);
        c = Integer.parseInt(input[2]);

        if (a == b && a == c) {
            price = a * 1000 + 10000;
        } else if (a == b || a == c) {
            price = a * 100 + 1000;
        } else if (b == c) {
            price = b * 100 + 1000;
        } else {
            max = Math.max(a, b);
            max = Math.max(max, c);
            price = max * 100;
        }

        System.out.println(price);
    }
}
