package lineardatastructure.lds_12_hashtable;// 선형 자료구조 - 해시 테이블

import java.util.Hashtable;
import java.util.Map;

// 해시 테이블
// 키, 값을 대응시켜 저장하는 데이터 구조
// 키를 통하여 해당 데이터에 빠르게 접근 가능하다.

// 해싱: 키를 특정 계산식에 넣어 나온 결과를 사용하여 값에 접근하는 과정
// 키: 해시 테이블 접근을 위한 입력값
// 해시 함수: 키를 해시 값으로 매핑하는 연산
// 해시 값: 해시 테이블의 인덱스
// 해시 테이블: 키-값을 연관시켜 저장하는 데이터 구조

// 해시 충돌: 해시 테이블의 같은 공간에 서로 다른 값을 저장하려는 경우, 서로 다른 키의 해시 함수를 통한 해시 값이 동일한 경우
// 해시 충돌 해결 방법으로는 크게 개방 주소법과 분리 연결법이 있다.

// 개방 주소법
// 충돌 시, 테이블에서 비어있는 공간의 hash를 찾아 데이터를 저장
// hash와 value가 1:1 관계를 유지한다.
// 비어있는 공간 탐색 방법: 선형 탐사법, 제곱 탐사법, 이중 해싱

// 개방 주소법_선형탐사법
// 빈 공간을 순차적으로 탐사하는 방법
// 충돌 발생 지점부터 이후의 빈 공간을 순서대로 탐사한다.
// 일차 군집화 문제 발생: 반복된 충돌 발생 시 해당 지점 주변에 데이터가 몰리는 경우 발생

// 개방 주소법_제곱 탐사법
// 빈 공간을 n제곱만큼 간격을 두고 탐사하는 방법
// 충돌 발생 지점부터 이후의 빈 공간을 n제곱 간격으로 탐사한다.
// 일차 군집화 문제를 일부 보완했지만, 이차 군집화 문제 발생 가능성이 있다.

// 개방 주소법_이중 해싱
// 해시 함수를 이중으로 사용한다. 1차 함수: 최초 해시를 구할 때 사용, 2차 함수: 충돌 발생 시 탐사 이동 간격을 구할 때 사용
// 선형 탐사, 제곱 탐사에 비해 데이터가 골고루 분포됨

// 분리 연결법
// 해시 테이블을 연결 리스트로 구성
// 충돌 발생 시, 테이블 내의 다른 위치를 탐색하는 것이 아닌 연결리스트를 이용하여 기존 데이터에 새로운 데이터를 연결한다.

public class Main {
    // 해시 함수
    public static int getHash(int key) {
        return key % 5;
    }

    public static void main(String[] args) {
        // 기본 해시 테이블 사용 방법, 키 값을 그대로 사용함
        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("key1", 10);
        ht.put("key2", 20);
        ht.put("key3", 30);
        ht.put("key3", 50); // 충돌 발생

        for (Map.Entry<String, Integer> item: ht.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }

        // 해시 충돌 케이스 (해시 함수 사용), 해시 함수를 통해 해시를 구해서 사용함.
        Hashtable<Integer, Integer> ht2 = new Hashtable<>();
        ht2.put(getHash(1), 10);
        ht2.put(getHash(2), 20);
        ht2.put(getHash(3), 30);
        ht2.put(getHash(4), 40);
        ht2.put(getHash(5), 50);

        System.out.println("== 충돌 전==");
        for (Map.Entry<Integer, Integer> item: ht2.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }

        System.out.println("== 충돌 후==");
        ht2.put(getHash(6), 60); // 충돌 발생
        for (Map.Entry<Integer, Integer> item: ht2.entrySet()) {
            System.out.println(item.getKey() + " - " + item.getValue());
        }
    }
}
