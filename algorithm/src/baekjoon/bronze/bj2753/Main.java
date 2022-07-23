// https://www.acmicpc.net/problem/2753
package baekjoon.bronze.bj2753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = 0;

        do {
            input = Integer.parseInt(reader.readLine());
        } while (!(input >= 1 && input <= 4000));

        if ((input % 4 == 0 && input % 100 != 0) || input % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
