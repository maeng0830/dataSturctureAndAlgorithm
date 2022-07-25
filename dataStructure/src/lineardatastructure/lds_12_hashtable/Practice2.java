package lineardatastructure.lds_12_hashtable;// Practice2
// 해시 충돌 해결 - 개방 주소법 (선형 탐사법)

class MyHashTable2  {
    Integer[] table;
    int elemCnt;

    MyHashTable2(int size) {
        this.table = new Integer[size]; // 특정 크기의 Integer 배열 생성 <- 해시 테이블로 사용됨.
        this.elemCnt = 0; // 해시 테이블의 원소 개수
    }

    public int getHash(int key) { return key % this.table.length; } // 키를 인자로 받는 해시 함수 구현

    public void setValue(int key, int data) {
        int idx = this.getHash(key); // 키 -> 해시

        if (this.elemCnt == this.table.length) { // 해시 테이블이 꽉 찬 상태인지 확인
            System.out.println("Hash table is full");
            return;
        } else if (this.table[idx] == null) { // 해시 테이블에 빈 공간이 있으며, 해당 해시(인덱스)가 비어있을 경우 데이터 바로 삽입
            this.table[idx] = data;
        } else { // 해시 테이블에 빈 공간이 있으나, 해당 해시(인덱스)에 이미 값이 있는 경우, 선형 탐사 실시
            int newIdx = idx;
            while (true) {
                newIdx = (newIdx + 1) % this.table.length; // 다시 해시 테이블 크기로 나눠주는 이유는 0~size의 해시(인덱스) 값만 산출되게 하기 위함이다.
                if (this.table[newIdx] == null) { // 선형 탐사 결과 빈 해시(인덱스)가 감지되면 탐사 종료
                    break;
                }
            }
            this.table[newIdx] = data; // 탐사한 해시(인덱스)에 데이터 삽입
        }
        elemCnt++; // 원소 개수 증가
    }

    public int getValue(int key) {
        int idx = this.getHash(key); // 해시를 인덱스로 사용
        return this.table[idx]; // 해당 해시(인덱스)의 값 리턴
    }

    public void removeValue(int key) {
        int idx = this.getHash(key);
        this.table[idx] = null;
        elemCnt--;
    }

    public void printHashTable() {
        for (int i = 0; i < this.table.length; i++) {
            System.out.println(i + ": " + this.table[i]);
        }
    }
}

public class Practice2 {
    public static void main(String[] args) {
        // Test code
        MyHashTable2 ht = new MyHashTable2(5);
        ht.setValue(1, 1);
        ht.setValue(3, 3);
        ht.printHashTable();
//        0: null
//        1: 1
//        2: null
//        3: 3
//        4: null

        ht.setValue(1, 10);
        ht.printHashTable();
//        0: null
//        1: 1
//        2: 10
//        3: 3
//        4: null

        ht.setValue(1, 20);
        ht.setValue(1, 30);
        ht.setValue(1, 40);
        ht.printHashTable();
//        0: 30
//        1: 1
//        2: 10
//        3: 3
//        4: 20
    }
}
