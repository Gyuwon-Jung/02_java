package main.java.com.ohgiraffers.section05.parameter;

import java.util.Arrays;

public class ParameterTest {
    public void testPrimitiveTypeParameter(int num) {
        num = 10;
        System.out.println("매개변수로 전달받은 값 : " + num);
    }

    public void testPrimitiveTypeArrayParameter(int[] iArr) {
        iArr[0] = 100;
        System.out.println("매개변수로 전달 받은 값 : " + Arrays.toString(iArr));
    }

    public void testClassTypeParameter(Rectangle r) {
        r.calArea();
        r.calRound();
    }

    public void testVariableLengthArrayParameter(String... str) {
        // 근데 (String... str, String str2 ) 는 안 된다.
        // 하지만 이건 된다. (String str2, String... str)
        System.out.println("str = " + Arrays.toString(str));
    }
}
