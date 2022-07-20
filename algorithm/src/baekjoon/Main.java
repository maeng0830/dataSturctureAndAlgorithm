package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String nums = br.readLine();
        StringTokenizer st = new StringTokenizer(nums, " ");
        double[] numsArr = new double[n];
        double maxScore = Integer.MIN_VALUE;
        double sum = 0;

        for (int i = 0; i < n; i++) {
            numsArr[i] = Double.parseDouble(st.nextToken());
        }

        for (double num: numsArr) {
            if (num > maxScore) {
                maxScore = num;
            }
        }

        for (double num: numsArr) {
            num = num / maxScore * 100;
            sum += num;
        }

        System.out.printf("%.2f", sum / n);
    }
}
