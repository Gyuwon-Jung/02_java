package com.ohgiraffers.section02.additional;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;

/* @Order 어노테이션의 기능이 활성화 되기 위해서는 클래스 레벨에 어노테이션 선언이 필요하다. */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AdditionalAnntationTests {

    @Disabled
    @Test
    void testIgnore() {
        System.out.println("테스트 실행 확인");
    }

    @Disabled
    @Test
    @Timeout(value=1000, unit= TimeUnit.MILLISECONDS)
    void testTimeout() {

        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("타임 아웃 테스트");
    }

    @Test
    @Order(1)
    void testFirst() {
        System.out.println("first");
    }

    @Test
    @Order(2)
    void testSecond() {
        System.out.println("second");
    }

    @Test
    @Order(3)
    void testThrid() {
        System.out.println("thrid");
    }

    @RepeatedTest(10)
    void testRepeated() {
        System.out.println("반복 테스트");
    }
}
