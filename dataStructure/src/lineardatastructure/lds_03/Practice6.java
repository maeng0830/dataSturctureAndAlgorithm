package lineardatastructure.lds_03;// Practice6
// 배열 arr 에서 중복 값을 제거한 새 배열을 만드시오.

// 입출력 예시)
// arr: 1, 5, 3, 2, 2, 3, 1, 4, 1, 2, 3, 5
// 결과: 1, 5, 3, 2, 4

import java.util.Arrays;
import java.util.StringTokenizer;

public class Practice6 {
    public static void calculator(int[] arr) {
        String numCheck = "";
        StringTokenizer st;
        int count = 1;
        boolean isFilled;

        for (int i = 0; i < arr.length - 1; i++) {
            isFilled = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isFilled = true;
                }
            }

            if (!isFilled) {
                numCheck += (arr[i] + " ");
                count++;
            }
        }

        numCheck += String.valueOf(arr[arr.length - 1]);

        st = new StringTokenizer(numCheck, " ");

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
