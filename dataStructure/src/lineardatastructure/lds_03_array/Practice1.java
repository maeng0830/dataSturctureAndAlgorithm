package lineardatastructure.lds_03_array;// Practice1
// 배열 arr 의 모든 데이터에 대해서,
// 짝수 데이터들의 평균과 홀수 데이터들의 평균을 출력하세요.

// 입출력 예시)
// 배열 arr: 1, 2, 3, 4, 5, 6, 7, 8, 9
// 결과:
// 짝수 평균: 5.0
// 홀수 평균: 5.0

public class Practice1 {
    public static void calculator(int[] arr) {
        double sum1 = 0;
        double sum2 = 0;
        int sum1count = 0;
        int sum2count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum1 += arr[i];
                sum1count++;
            } else {
                sum2 += arr[i];
                sum2count++;
            }
        }

        System.out.printf("홀수 평균: %.2f\n", sum1 / sum1count);
        System.out.printf("짝수 평균: %.2f\n", sum2 / sum2count);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        calculator(arr);
    }
}
