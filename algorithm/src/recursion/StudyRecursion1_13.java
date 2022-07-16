package recursion;

// 알고리즘 강의_Recursion_권오흠
public class StudyRecursion1_13 {
    // a, b, c, d 원소가 있다고 가정하자.
    // a를 고정하고 b, c, d의 모든 가능한 순열 추가
    // ab를 고정하고 c, d의 모든 가능한 순열을 추가
    // abc를 고정하고 d의 모든 가능한 순열 추가
    // 위의 절차를 맨 앞의 원소가 b, c, d인 경우에 대해 반복
    public static void main(String[] args) {
        char[] data = {'a', 'b', 'c', 'd'};
        int k = 0;
        int n = data.length;
        perm(k, n, data);
    }

    public static void perm(int k, int n, char[] data) {
        if(k == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(data[i]);
            }
            System.out.println();
            return;
        } else {
            for(int i = k; i < n; i++) {
                swap(k, i, data);
                perm(k + 1, n, data);
                swap(k, i, data);
            }
        }
    }

    public static void swap(int k, int i, char[] data) {
        char save = data[k];
        data[k] = data[i];
        data[i] = save;
    }

}
