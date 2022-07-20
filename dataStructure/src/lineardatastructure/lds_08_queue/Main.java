package lineardatastructure.lds_08_queue;// 선형 자료구조 - 큐

// queue
// 선입선출 자료구조이다.
// 입력 순서대로 데이터 처리가 필요할 때 사용한다. 프린터 출력 대기열, BFS(Breath-First Search) 등
// 데이터 추가, 꺼내기, 큐 공간 확인 동작으로 이루어진다.
// 가장 앞의 데이터를 front, 가장 뒤의 데이터를 rear라고 부른다.

// Dequeue: 데이터를 꺼낸다(반환). 가장 오른쪽(앞)의 데이터를 반환한다.
// Enqueue: 데이터를 추가한다. 가장 왼쪽(뒤)에 데이터를 추가한다.

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new LinkedList(); // 큐는 인터페이스이기 때문에 구현 클래스를 사용해야한다. 보통 LinkedList를 사용한다.

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue); // [1, 2, 3, 4, 5]

        // 먼저 추가된 데이터를 반환한다. 반환된 데이터는 queue에서 제외된다.
        System.out.println(queue.poll()); // 1
        System.out.println(queue); // [2, 3, 4, 5]

        // 먼저 추가된 데이터를 반환한다. 반환된 데이터가 queue에서 제외되지 않는다.
        System.out.println(queue.peek()); // 2
        System.out.println(queue); // [2, 3, 4, 5]

        // 해당 원소가 큐에 존재하는지 확인
        System.out.println(queue.contains(3)); // true
        // 큐의 크기 확인
        System.out.println(queue.size()); // 4
        // 큐가 비어있는지 확인
        System.out.println(queue.isEmpty()); // false

        // 큐의 모든 원소 제거
        queue.clear();
        System.out.println(queue); // []
        System.out.println(queue.poll()); // null, 스택의 pop은 스택이 비어있을 때 실행되면 예외를 발생시키지만, 큐의 poll은 null을 반환한다.

    }
}
