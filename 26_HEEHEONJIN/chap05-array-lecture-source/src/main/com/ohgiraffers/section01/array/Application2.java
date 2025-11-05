package main.com.ohgiraffers.section01.array;

public class Application2 {
    public static void main(String[] args) {

        // 배열의 선언 : stack에 배열의 주소를 보관할 **레퍼런스 변수** 공간을 만드는 것
        int[] iarr;
        double[] darr;

        iarr = new int[5];
        darr = new double[10];

        // heap 영역은 이름으로 접근하지 않고 주소값으로 접근하는 영역이다.
        // stack에 저장된 주소로 heap 에 할당 된 배열을 찾아갈 수 있다.

        System.out.println("iarr : " + iarr );
        System.out.println("darr : " + darr);

        // hashCode() : 객체의 주소값을 10진수로 변환하여 생성한 객체의 고유 정수값을 변환하는 메소드
        System.out.println("iarr.hashCode() : " + iarr.hashCode());
        System.out.println("darr.hashCode() : " + darr.hashCode());

        System.out.println("iarr.length : " + iarr.length);
        System.out.println("darr.length : " + darr.length);

        iarr = new int[100];
        System.out.println("수정된 iarr.hashCode() : " + iarr.hashCode());
        System.out.println("수정된 iarr.length : " + iarr.length);

        //iarr = null; 오류남
        System.out.println("수정된 iarr.hashCode() : " + iarr.hashCode());
        System.out.println("수정된 iarr.length : " + iarr.length);
    }
}
