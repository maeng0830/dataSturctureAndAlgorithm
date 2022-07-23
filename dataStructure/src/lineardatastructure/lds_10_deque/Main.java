package lineardatastructure.lds_10_deque;// 선형 자료구조 - 데크

// front, rear 양쪽에서 삽입과 삭제가 모두 가능한 자료구조이다.
// Deque: Doubly-ended Queue
// Stack과 Queue를 합친 형태의 자료구조이다.

// add: 데이터를 삽입한다. 공간이 꽉찬 경우 예외를 발생시킨다.
// offer: 데이터를 삽입한다. 공간이 꽉찬 경우에도 예외를 발생시키지는 않는다.
// remove: 데이터를 삭제한다. 삭제할 데이터가 존재하지 않는 경우 예외를 발생시킨다.
// poll: 데이터를 삭제한다. 삭제할 데이터가 존재하지 않아도 예외를 발생시키지는 않는다.

// 입력 제한 데크(Scroll)
// front쪽이든, rear쪽이든 어느 한쪽의 입력 기능을 제한한 데크이다.

// 출력 제한 데크(Shelf)
// front쪽이든, rear쪽이든 어느 한쪽의 삭제 기능을 제한한 데크이다.

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque deque = new ArrayDeque();

        // Front 부분 입력
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        System.out.println(deque); // [3, 2, 1]

        // Rear 부분 입력
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);
        System.out.println(deque); // [3, 2, 1, 10, 20, 30]

        // Front 부분 출력
        System.out.println(deque.removeFirst()); // 3
        System.out.println(deque); // [2, 1, 10, 20, 30]

        // Rear 부분 출력
        System.out.println(deque.removeLast()); // 30
        System.out.println(deque); // [2, 1, 10, 20]
    }
}
