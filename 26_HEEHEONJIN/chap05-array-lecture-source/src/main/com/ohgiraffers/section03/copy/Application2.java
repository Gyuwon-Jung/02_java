package main.com.ohgiraffers.section03.copy;

import java.util.Arrays;

public class Application2 {
    public static void main(String[] args) {

        //깊은 복사는 같은 값인데 서로 다른 주소값.

        // 1.for문

        int[] origin = {1,2,3,4,5};
        int [] copy1 = new int[10];
        for(int i = 0; i < origin.length; i++) {
            copy1[i] = origin[i];
        }
        System.out.println("===== origin =====");
        print(origin);
        System.out.println("===== copy1 =====");
        print(copy1);

        // 2.Object의 clone 메소드
        int [] copy2 = origin.clone();
        System.out.println("===== copy2 =====");
        print(copy2);

        // 3.System의 arraycopy 메소드
        //arraycopy(원본배열, 복사를 시작할 인덱스, 복사본배열, 복사를 시작할 인덱스, 복사할 길이)
        int[] copy3 = new int[10];
        System.arraycopy(copy2,0,copy3,0,copy2.length);
        System.out.println("===== copy3 =====");
        print(copy3);

        // 4.Arrays의 copyOf메소드
        int[] copy4 = Arrays.copyOf(origin, 7);
        int[] copy5 = Arrays.copyOf(origin,7);

        System.out.println("===== copy4 =====");
        print(copy4);
        System.out.println("===== copy5 =====");
        print(copy5);


    }
    public static void print(int[] arr) {
        System.out.println("arr의 hashCode() : " + arr.hashCode());
        System.out.println("arr : " + Arrays.toString(arr));
    }
}
