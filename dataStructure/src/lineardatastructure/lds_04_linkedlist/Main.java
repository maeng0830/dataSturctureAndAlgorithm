package lineardatastructure.lds_04_linkedlist;// 선형 자료구조 - 연결 리스트
// 단순 연결 리스트 (simple ver.) 기본 구조 구현

// 노드
// 데이터의 저장 단위로, 값과 포인터로 구성된다. 포인터는 다음 노드나 이전 노드의 연결 정보를 가진다.
// 가장 처음에 위치한 노드를 헤드라고 부르며, 가장 마지막에 위치한 노드를 tail이라고 부른다.

// 데이터 추가
// 1. 연결 리스트의 가장 앞에 노드 추가
// 1-1. 추가할 데이터를 담을 노드를 생성
// 1-2. 링크 연결 작업
// 1-3. head 이전 작업

// 2. 연결 리스트의 가장 뒤에 노드 추가
// 2-1. 추가할 데이터를 담을 노드를 생성
// 2-2. head ~ 기존의 끝 노드까지 순회
// 2-3. 추가될 노드에 링크 연결 작업

// 3. 연결 리스트의 중간에 노드 추가
// 3-1. 추가할 데이터를 담을 노드를 생성
// 3-2. head ~ 노드 추가 위치 직전 노드까지 순회
// 3-3. 링크 연결 작업

// 데이터 삭제
// 1. 연결 리스트의 가장 앞 노드 삭제
// 1-1. 삭제 대상 노드 지정(delete_node)
// 1-2. head 이전 작업
// 1-3. delete_node 삭제

// 2. 연결 리스트의 마지막 노드 삭제
// 2-1. head ~ 마지막 노드까지 순회
// 2-2. 마지막 노드 삭제 노드로 지정
// 2-3. 삭제 노드 이전 노드의 링크 처리
// 2-4. 노드 삭제

// 3. 연결 리스트의 중간 노드 삭제
// 3-1. head ~ 삭제 노드 이전 노드까지 순회 및 삭제 노드 지정
// 3-2. 삭제 노드 이전, 이후 노드의 링크 연결 작업
// 3-3. delete_node 삭제

class Node {
    int data;
    Node next;

    Node() {}
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    Node head;

    LinkedList() {}
    LinkedList(Node node) {
        this.head = node;
    }

    //  연결 리스트 비어있는지 확인
    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        return false;
    }

    //  연결 리스트의 맨 뒤에 데이터 추가
    public void addData(int data) {
        if (this.head == null) {
            this.head = new Node(data, null);
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = new Node(data, null);
        }
    }

    //  연결 리스트의 맨 뒤의 데이터 삭제
    public void removeData() {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node cur = this.head;
        Node prev = cur;

        while (cur.next != null) {
            prev = cur;
            cur = cur.next;
        }

        if (cur == this.head) {
            this.head = null;
        } else {
            prev.next = null;
        }
    }


    //  연결 리스트에서 데이터 찾기
    public void findData(int data) {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node cur = this.head;
        while (cur != null) {
            if (cur.data == data) {
                System.out.println("Data exist!");
                return;
            }
            cur = cur.next;
        }
        System.out.println("Data not found!");
    }

    //  연결 리스트의 모든 데이터 출력
    public void showData() {
        if (this.isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

}


public class Main {

    public static void main(String[] args) {

//      Test Code
        LinkedList myList = new LinkedList(new Node(1, null));
        myList.showData();      // 1

        myList.addData(2);
        myList.addData(3);
        myList.addData(4);
        myList.addData(5);
        myList.showData();      // 1 2 3 4 5

        myList.findData(3);     // Data exist!
        myList.findData(100);   // Data not found!

        myList.removeData();
        myList.removeData();
        myList.removeData();
        myList.showData();      // 1 2

        myList.removeData();
        myList.removeData();
        myList.removeData();    // List is empty

    }

}
