package lineardatastructure.lds_03;// Practice4
// 배열 arr 에서 peek 값 모두 출력

// 입출력 예시)
// arr: 3, 1, 2, 6, 2, 2, 5, 1, 9, 10, 1, 11
// 결과: 3, 6, 5, 10, 11

public class Practice4 {
    public static void calculator(int[] arr) {
        int check = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] >= arr[i + 1]) {
                    System.out.printf("%d, ", arr[i]);
                    check++;
                }
            } else if (i > 0 && i < arr.length - 1) {
                if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                    System.out.printf("%d, ", arr[i]);
                    check++;
                }
            } else {
                if (arr[i] > arr[i - 1]) {
                    System.out.printf("%d", arr[i]);
                    check++;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 6, 2, 2, 5, 1, 9, 10, 1, 11};

        calculator(arr);
    }

}
