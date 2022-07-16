// https://www.acmicpc.net/problem/9498
package baekjoon.bj9498;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = 0;

        do {
            input = Integer.parseInt(reader.readLine());
        } while (!(input >= 0 && input <= 100));
        reader.close();

        if (input >= 90) {
            System.out.println("A");
        } else if (input >= 80) {
            System.out.println("B");
        } else if (input >= 70) {
            System.out.println("C");
        } else if (input >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
