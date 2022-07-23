// https://www.acmicpc.net/problem/14681
package baekjoon.bronze.bj14681;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x;
        int y;

        do {
            x = Integer.parseInt(reader.readLine());
            y = Integer.parseInt(reader.readLine());
        } while (!((x <= 1000 && x >= -1000 && x != 0) && (y <= 1000 && y >= -1000 && y != 0)));
        reader.close();

        if (x > 0) {
            if (y > 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else {
            if (y > 0) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }
    }
}
