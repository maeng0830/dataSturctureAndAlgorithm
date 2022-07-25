package lineardatastructure.lds_12_hashtable;// Practice4
// 해시 충돌 해결 - 개방 주소법 (이중 해싱)

class MyHashTable4 {
    Integer[] table;
    int elemCnt;
    int c; // 2차 해시 함수를 위한 변수, 보통 해시 테이블 사이즈보다 조금 더 작은 소수가 사용된다.

    MyHashTable4(int size) {
        this.c = this.getHashC(size); // c값 구하기
        this.table = new Integer[size];
        elemCnt = 0;
    }

    // c를 구하기 위한 함수
    public int getHashC(int size) {
        int c = 0;

        if (size <= 2) {
            return size;
        }

        for (int i = size - 1; i > 2; i--) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                c = i;
                break;
            }
        }
        return c;
    }

    public int getHash(int key) {
        return key % this.table.length;
    }

    public int getHash2(int key) {
        int hash = 1 + key % this.c; // 기본적인 2차 해시 함수
        return hash;
    }

    public void setValue(int key, int data) {
        int idx = getHash(key);

        if (this.elemCnt == this.table.length) {
            System.out.println("Hash table is full");
            return;
        } else if (this.table[idx] == null) {
            this.table[idx] = data;
        } else { // 충돌 발생! 이중 해싱 실시
            int newIdx = idx;
            int cnt = 1;
            while (true) {
                newIdx = (newIdx + this.getHash2(newIdx) * cnt) % this.table.length;
                if (this.table[newIdx] == null) {
                    break;
                }
                cnt++;
            }
            this.table[newIdx] = data;
        }
        this.elemCnt++;
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

public class Practice4 {
    public static void main(String[] args) {
        // Test code
        MyHashTable4 ht = new MyHashTable4(11);
        ht.setValue(1, 10);
        ht.setValue(2, 20);
        ht.setValue(3, 30);
        ht.printHashTable();
//        0: null
//        1: 10
//        2: 20
//        3: 30
//        4: null
//        5: null
//        6: null
//        7: null
//        8: null
//        9: null
//        10: null

        ht.setValue(1, 100);
        ht.setValue(1, 200);
        ht.setValue(1, 300);
        ht.printHashTable();
//        0: 100 // 데이터 삽입(100)
//        1: 10 // 충돌 1
//        2: 20
//        3: 30 // 충돌 2
//        4: null
//        5: null
//        6: null
//        7: 300 // 데이터 삽입(300)
//        8: 200 // 데이터 삽입(200)
//        9: null
//        10: null

    }
}
