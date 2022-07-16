package lineardatastructure.lds_03;// Practice5
// 배열 arr 의 값을 오름차순으로 출력

// 입출력 예시)
// arr: 5, 3, 1, 4, 6, 1
// 결과: 1, 1, 3, 4, 5, 6

import java.util.Arrays;

public class Practice5 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 4, 6, 1};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d, ", arr[i]);
            if (i == arr.length - 1) {
                System.out.printf("%d", arr[i]);
            }
        }
    }
}
