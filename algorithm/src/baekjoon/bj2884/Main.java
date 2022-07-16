// https://www.acmicpc.net/problem/2884
package baekjoon.bj2884;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input;
        int h;
        int m;

        do {
            input = reader.readLine().split(" ");
            h = Integer.parseInt(input[0]);
            m = Integer.parseInt(input[1]);
        } while(!((h>= 0 && h <= 23) && (m >= 0 && m <= 59)));
        reader.close();

        if (m < 45) {
            m = m -45 + 60;
            if (h == 0) {
                h = 23;
            } else {
                h -= 1;
            }
        } else {
            m -= 45;
        }

        System.out.printf("%d %d", h, m);
    }
}
