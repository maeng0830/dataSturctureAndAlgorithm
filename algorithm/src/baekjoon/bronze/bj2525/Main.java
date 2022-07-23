// https://www.acmicpc.net/problem/2525
package baekjoon.bronze.bj2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        int h;
        int m;
        int c;

        do {
            input = reader.readLine().split(" ");
            h = Integer.parseInt(input[0]);
            m = Integer.parseInt(input[1]);

            c = Integer.parseInt(reader.readLine());
        } while (!((h >= 0 && h <= 23) && (c >= 0 && c <= 1000)));

        if (m + c >= 60) {
            h += (m + c) / 60;
            m = (m + c) % 60;

            if (h >= 24) {
                h = h % 24;
            }
        } else {
            m += c;
        }

        System.out.printf("%d %d", h, m);
    }
}
