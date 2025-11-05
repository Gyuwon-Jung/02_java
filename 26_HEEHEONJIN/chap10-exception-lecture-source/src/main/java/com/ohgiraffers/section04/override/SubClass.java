package main.java.com.ohgiraffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {
//    @Override
//    public void method() throws IOException {
//
//    }

//    @Override
//    public void method() { // 예외없이 오버라이딩 할 수 있다.
//
//    }
    /* 부모의 예외처리 클래스보다 상위의 예외로는 후손 클래스에서 오버라이딩 할 수 없다.*/
//    @Override
//    public void method() throws Exception {}
    // 부모의 예외처리 클래스보다 더 하위에 있는 예외 (즐, 더 구체적인 예외상황)인 경우에는
    // 오버라이딩 할 수 있다.
    @Override
    public void method() throws FileNotFoundException {}
}
