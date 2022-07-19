package lineardatastructure.lds_03_array;// Practice7
// 2차원 배열 arr 을 시계방향 90도 회전시킨 결과를 출력하세요.

// 입출력 예시:
// arr:
// 1  2  3  4  5
// 6  7  8  9  10
// 11 12 13 14 15
// 결과:
// 11  6  1
// 12  7  2
// 13  8  3
// 14  9  4
// 15  10 5


import java.util.Arrays;

public class Practice7 {
    public static void calculator(int[][] arr) {
        int[][] newArr = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                newArr[j][i] = arr[arr.length - 1 - i][j];
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.println(Arrays.toString(newArr[i]));
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}};

        calculator(arr);
    }
}
