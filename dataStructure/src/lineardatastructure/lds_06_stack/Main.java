package lineardatastructure.lds_06_stack;// 선형 자료구조 - 스택

// 스택
// 후입선출(LIFO) 자료구조이다.
// 데이터가 입력된 순서의 역순으로 처리되어야할 때 사용된다. ex) 함수 콜 스택, 수식 계산, 인터럽트 처리 등
// 기본적으로 데이터 추가, 꺼내기, 스택 공간확인 동작으로 이뤄짐.

// 데이터 추가(Push): 스택의 가장 마지막 위치에 데이터 추가
// 데이터 꺼내기(Pop): 스택의 가장 마지막 위치의 데이터를 꺼낸다(반환). 꺼내진 데이터는 스택에서 제외된다.
// 데이터 꺼내기(peek): 스택의 가장 마지막에 위치한 데이터를 꺼낸다(반환). pop과 차이첨은, 꺼내어진 데이터가 스택에서 제외되지 않는다.
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        // 데이터 추가
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack); // [1, 2, 3, 4, 5]

        // 마지막 데이터 반환, 반환된 데이터는 스택에서 삭제됨.
        System.out.println(stack.pop()); // 5
        System.out.println(stack); // [1, 2, 3, 4]

        // 마지막 데이터 반환, 반환된 데이터가 스택에서 삭제되지 않는다.
        System.out.println(stack.peek()); // 4
        System.out.println(stack); // [1, 2, 3, 4]

        // 스택이 해당 인자를 갖고 있는지 반환
        System.out.println(stack.contains(1)); // true;

        // 스택의 데이터 개수 확인
        System.out.println(stack.size()); // 4

        // 스택이 비어있는지 확인
        System.out.println(stack.empty()); // false

        // 스택의 모든 데이터 제거
        stack.clear();
        System.out.println(stack); // []
    }

}
