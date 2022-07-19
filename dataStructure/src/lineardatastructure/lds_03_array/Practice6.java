package lineardatastructure.lds_03_array;// Practice6
// 배열 arr 에서 중복 값을 제거한 새 배열을 만드시오.

// 입출력 예시)
// arr: 1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5
// 결과: 1, 5, 3, 2, 4

import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice6 {
    public static void calculator(int[] arr) {
        int count = 0; // 중복 값을 제거한 크기의 배열을 만들기 위한 변수
        boolean isFilled; // 중복 여부를 확인하기 위한 변수
        String nums = ""; // 중복되지 않은 원소들을 누적하기 위한 변수
        StringTokenizer st; // nums를 각각의 토큰으로 분리하기 위한 변수

        for (int i = 0; i < arr.length; i++) {
            isFilled = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isFilled = true; // arr[i]가 이전 인덱스들의 값과 중복된다면 true
                }
            }

            if (!isFilled) {
                count++; // 중복된 값이 아닌 경우 +1
                nums += String.valueOf(arr[i]) + " "; // 중복된 값이 아닌 경우, nums에 누적.
            }
        }

        st = new StringTokenizer(nums, " "); // nums에 저장된 값들을 " " 기준으로 분리

        int[] newArr = new int[count];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.toString(newArr));
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5};
        calculator(arr);
    }
}
