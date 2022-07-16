package recursion;

// 알고리즘 강의_Recursion_권오흠
// 모든 재귀 함수는 반복문으로 구현 가능하며, 모든 반복문은 재귀 함수로 구현 가능하다.
// 재귀 함수는 복잡한 알고르짐을 간단 명료하게 표현하는 것을 가능하게 한다.
// 그러나 반복적인 함수 호출로 인해, 반복문에 비해 실행 속도면에서 다소 떨어진다.
public class StudyRecursion1_1 {
    public static void main(String[] args) {
        int n = 3;
        func(n); // Hello Java! Hello Java! Hello Java!
    }

    public static void func(int n) {
        if(n <= 0) {
            return; //base case: 적어도 하나의 recursion에 빠지지 않는 경우가 존재해야 한다.
        } else  {
            System.out.print("Hello Java! ");
            func(n - 1); // recursive case: recursion을 반복하다보면, 결국 base case로 수렴해야한다.
        }
    }
}
