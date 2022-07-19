package baekjoon;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String num = String.valueOf((a * b * c));

        int[] nums = new int[num.length()];
        int[] check = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = num.charAt(i) - '0';
            check[nums[i]] += 1;
        }

        for (int i = 0; i < check.length; i++) {
            System.out.println(check[i]);
        }
    }
}
