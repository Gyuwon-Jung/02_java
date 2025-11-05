package main.com.ohgiraffers.section01.array;

public class Application1 {
    public static void main(String[] args) {
        // 배열의 선언 및 할당
        int[] arr = new int[5];

        // 하느의 이름으로 관리되는 연속 된 메모리 공간이며, 해당 공간에 접근 시에는 인덱스를 사용한다. 
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        //int i = 0;
        //int vale = 0
        //for (int i = 0; value = 0) {...}

        // 인덱스를 반복문으로 처리할 수 있다.
        for (int i = 0, value = 0; i < arr.length; i++) {
            arr[i] = value += 10;
            System.out.println(arr[i]);

            // 향상된 for 문
            // for (한번의 반복문에서 사용될 변수: 반복을 수행할 배열) {}
        }
            for(int i : arr) {
                System.out.println("i = " + i);
                i = 0;
        }
    }
}
