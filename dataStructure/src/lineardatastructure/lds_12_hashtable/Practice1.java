package lineardatastructure.lds_12_hashtable;// Practice1
// 해시 테이블 배열로 직접 구현

class MyHashTable {
    Integer[] table;
    int elemCnt;

    MyHashTable() {}
    MyHashTable(int size) {
        this.table = new Integer[size]; // 특정 크기의 Integer 배열 생성 <- 해시 테이블로 사용됨.
        this.elemCnt = 0; // 해시 테이블의 원소 개수
    }

    public int getHash(int key) {
        return key % this.table.length; // 키를 인자로 받는 해시 함수 구현
    }

    public void setValue(int key, int data) {
        int idx = this.getHash(key); // 해시를 인덱스로 사용
        this.table[idx] = data; // 해당 해시(인덱스)에 데이터 삽입
        this.elemCnt++; // 원소 개수 증가
    }

    public int getValue(int key) {
        int idx = this.getHash(key); // 해시를 인덱스로 사용
        return this.table[idx]; // 해당 해시(인덱스)의 값 리턴
    }

    public void removeValue(int key) {
        int idx = this.getHash(key); // 해시를 인덱스로 사용
        this.table[idx] = null; // 해당 해시(인덱스)의 값을 null로 변경
        this.elemCnt--; // 원소 개수 감소
    }

    public void printHashTable() {
        System.out.println("==Hash Table==");
        for (int i = 0; i < this.table.length; i++) {
            System.out.println(i + ": " + this.table[i]);
        }
    }
}

public class Practice1 {

    public static void main(String[] args) {
        // Test code
        MyHashTable ht = new MyHashTable(7);
        ht.setValue(1, 1);
        ht.setValue(2, 2);
        ht.setValue(3, 3);
        ht.setValue(4, 4);
        ht.setValue(5, 5);
        ht.printHashTable();
        ht.setValue(8, 6); // 충돌 발생
        ht.printHashTable();
    }
}
