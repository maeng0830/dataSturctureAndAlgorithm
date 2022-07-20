package lineardatastructure.lds_02_array;// 선형 자료구조 - 배열

// 배열
// -동일한 자료형의 많은 수의 데이터를 다룰 때 사용하는 자료구조
// -각 데이터를 인덱스와 1대1 매칭
// -데이터가 메모리 상에 연속적으로 저장된다.

// 배열의 장점
// 1. 각 데이터가 메모리의 연속된 공간에 저장되기 때문에 각 데이터에 대한 접근이 빠르다.

// 배열의 단점
// 1. 길이가 고정되어 있다.
// 1-1. 현재는 불필요하더라도, 미래를 생각하여 사전에 최대 길이로 생성해줘야한다.
// 1-2. 특정 인덱스의 데이터가 삭제 되더라도 고정된 길이를 유지하기 위해 데이터가 삭제된 인덱스는 빈 공간으로 남아있다.
// 2. 리스트에 비해 데이터 추가/삭제가 번거로운 편이다.

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//      1차원 배열
        System.out.println("== 1차원 배열 ==");
        int[] arr = {1, 2, 3, 4, 5};
        for (int item: arr) {
            System.out.print("item = " + item + ", "); // item = 1, item = 2, item = 3, item = 4, item = 5,
        }
        System.out.println();

        arr[1] = 100; // 인덱스를 통해 해당 인덱스에 저장된 데이터에 접근 가능하며, 특정 인덱스에 데이터를 저장할 경우 기존의 데이터는 삭제된다.
        System.out.println("arr = " + arr); // arr = [I@3cda1055, 배열은 참조타입이기 때문에, 해당 배열을 참조하고 있는 변수를 바로 출력할 경우 참조하고 있는 주소가 반환된다.
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr)); // Arrays.toString(arr) = [1, 100, 3, 4, 5], Arrays.toString()을 통해 배열의 구조를 출력할 수 있다.

//      2차원 배열
        System.out.println("== 2차원 배열 ==");
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}}; // 2차원 배열은 행렬로 이해하면 쉽다. 앞의 대괄호는 행, 뒤는 열을 의미한다. 그리고 행은 바깥 중괄호, 열은 안쪽 중괄호를 의미한다.
        System.out.println(arr2[0][1]); // 2, 0행 1열의 데이터

        for(int[] row: arr2) { // 2차원 배열의 foreach문 사용시 주의점
            for(int item: row) {
                System.out.println("item = " + item);
            }
        }


//      ArrayList - 1차원, 2차원
        System.out.println("== ArrayList ==");
        ArrayList list1 = new ArrayList(Arrays.asList(1, 2, 3)); // Arrays.asList()를 통해 ArrayList 생성 시 데이터를 바로 추가해줄 수 있다.
        System.out.println("list1 = " + list1); // list1 = [1, 2, 3]
        list1.add(4); // ArrayList 생성 뒤에 add()를 통해 데이터를 추가할 수 있다.
        list1.add(5);
        System.out.println("list1 = " + list1); // list1 = [1, 2, 3, 4, 5]
        list1.remove(2); // remove()를 통해 해당 인덱스의 데이터를 삭제할 수 있다. 해당 인덱스 뒤의 데이터는 앞 당겨진다(인덱스가 변경됨).
        System.out.println("list1 = " + list1); // list1 = [1, 2, 4, 5]
        list1.remove(Integer.valueOf(2)); // 인덱스가 아닌 값을 통해 데이터를 삭제할 수 있다.
        System.out.println("list1 = " + list1); // list1 = [1, 4, 5]

        ArrayList list2d = new ArrayList(); // 빈 ArrayList 생성
        ArrayList list1d1 = new ArrayList(Arrays.asList(1, 2, 3)); // ArrayList 1
        ArrayList list1d2 = new ArrayList(Arrays.asList(4, 5, 6)); // ArrayList 2
        list2d.add(list1d1); // 빈 ArrayList의 데이터로 ArrayList를 추가.
        list2d.add(list1d2); // 빈 ArrayList의 데이터로 ArrayList를 추가. 즉 2차원 ArrayList가 되는 것임..!
        System.out.println("list1d1 = " + list1d1); // list1d1 = [1, 2, 3]
        System.out.println("list1d2 = " + list1d2); // list1d2 = [4, 5, 6]
        System.out.println("list2d = " + list2d); // list2d = [[1, 2, 3], [4, 5, 6]]
    }
}
