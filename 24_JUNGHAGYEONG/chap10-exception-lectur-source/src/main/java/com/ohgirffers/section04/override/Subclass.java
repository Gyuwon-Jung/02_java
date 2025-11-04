package com.ohgirffers.section04.override;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Subclass extends SuperClass {

//    @Override
//    public void method() throws IOException { // 같은 예외를 던져주는 구문으로 오버라이딩 (정상)
//
//
//    }

//    @Override
//    public void method() { // 예외 없이 오버라이딩 할 수 있음
//
//
//    }

//    // 부모의 예외처리 클래스 보다 상위의 예외로는 후손클래스에서 오버라이딩 불가능
//    @Override
//    public void method() throws Exception{
//
//    }

    // 부모의 예외처리 클래스보다 더 하위에 있는 예외(즉, 더 구체적인 예외상황)인 경우
    // 오버라이딩 가능
    @Override
    public void method() throws FileNotFoundException  {

    }

}
