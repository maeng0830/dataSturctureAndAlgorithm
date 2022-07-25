package lineardatastructure.lds_12_hashtable;// Practice3
// 해시 충돌 해결 - 개방 주소법 (제곱 탐사법)

class MyHashTable3 {
    Integer[] table;
    int elemCnt;

    MyHashTable3(int size) {
        this.table = new Integer[size];
        this.elemCnt = 0;
    }

    public int getHash(int key) {
        return key % this.table.length;
    }

    public void setValue(int key, int data) {
        int idx = this.getHash(key);

        // 기본 구조는 선형 탐사의 것과 동일하다.
        if (this.elemCnt == this.table.length) {
            System.out.println("Hash table is full");
            return;
        } else if (this.table[idx] == null) {
            this.table[idx] = data;
        } else { // 충돌 발생! 제곱 탐사법 실시
            int newIdx = idx;
            int cnt = 0; // 충돌 횟수, 제곱수
            while (true) {
                newIdx = (newIdx + (int) Math.pow(2, cnt)) % this.table.length;
                if (this.table[newIdx] == null) {
                    break;
                }
                cnt++; // 충돌 횟수 점진적 증가
            }
            this.table[newIdx] = data;
        }
        this.elemCnt++;
    }

    public int getValue(int key) {
        int idx = this.getHash(key);
        return this.table[idx];
    }

    public void removeValue(int key) {
        int idx = this.getHash(key);
        this.table[idx] = null;
        this.elemCnt--;
    }

    public void printHashTable() {
        System.out.println("==Hash Table==");
        for (int i = 0; i < this.table.length; i++) {
            System.out.println(i + ": " + this.table[i]);
        }
    }
}

public class Practice3 {
    public static void main(String[] args) {
        // Test code
        MyHashTable3 ht = new MyHashTable3(11);
        ht.setValue(1, 10);
        ht.setValue(2, 20);
        ht.setValue(4, 40);
        ht.printHashTable();
//        0: null
//        1: 10
//        2: 20
//        3: null
//        4: 40
//        5: null
//        6: null
//        7: null
//        8: null
//        9: null
//        10: null

        ht.setValue(1, 100);
        ht.printHashTable();
//        0: null
//        1: 10 // 충돌 1
//        2: 20 // 충돌 2
//        3: null
//        4: 40 // 충돌 3
//        5: null
//        6: null
//        7: null
//        8: 100 // 데이터 삽입
//        9: null
//        10: null

        ht.setValue(1, 200);
        ht.setValue(1, 300);
        ht.setValue(1, 400);
        ht.printHashTable();
//        0: null
//        1: 10 // 충돌 1
//        2: 20 // 충돌 2
//        3: null
//        4: 40 // 충돌 3
//        5: 200 // 데이터 삽입(200)
//        6: null
//        7: null
//        8: 100 // 충돌 4
//        9: 400 // 데이터 삽입(400)
//        10: 300 // 데이터 삽입(300)
    }
}
