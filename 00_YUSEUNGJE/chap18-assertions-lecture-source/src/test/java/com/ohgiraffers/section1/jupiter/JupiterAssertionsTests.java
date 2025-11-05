package com.ohgiraffers.section1.jupiter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/* JUnit5에서 제공하는 Assertions에 있는 메소드에 대해서 이해하고 활용할 수 있다.*/
class JupiterAssertionsTests {

    /* 1. assertEquals : 예상 값과 실제 값의 일치 여부를 동일성으로 판단한다. */
    @Test
    void testAssertEquals(){
        /* given */
        int firstNum = 10;
        int secondNum = 20;
        int expected = 30;

        /* when */
        Calculator calculator = new Calculator();
        int result = calculator.plus(firstNum, secondNum);

        /* then */
//        Assertions.assertEquals(expected, result);
//        Assertions.assertEquals(expected, result, 1);
        Assertions.assertNotEquals(expected, result);
    }

    /* 2. assertNull: null 여부 테스트 */
    @Test
    @DisplayName("Null 여부 테스트")
    void testAssertNull() {
        /* given */
        String str = null;
        String str2 = "Hello World";
        /* when */
        /* then*/
        Assertions.assertNull(str);
        Assertions.assertNotNull(str2);
    }

    /* 3. asserAll: 한 번에 여러 검증을 수행할 수 있는 메소드 */
    @Test
    @DisplayName("동시에 여러 값에 대한 검증 테스트")
    void testAssertAll() {
         /* given */
        String firstName = "길동";
        String lastName = "홍";
        Person person = new Person(firstName, lastName);
         /* when */
         /* then */
        Assertions.assertAll(
                "그룹화 된 테스트의 이름(테스트 실패 시 보여지는 부분)",
                () -> Assertions.assertEquals("", person.getFirstName()),
                () -> Assertions.assertEquals(lastName, person.getLastName())
        );
    }

    /* 4. assertThrows/assertInstanceOf */
    @Test
    @DisplayName("exception 발생 테스트 ")
    void testAssertThrow(){
        /* given */
        int firstNum = 10;
        int secondNum = 0;
        /* when */
        NumberValidation validation = new NumberValidation();
        Exception exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> validation.checkDividableNumbers(firstNum, secondNum)
        );
        /* then */
        Assertions.assertAll(
                () -> Assertions.assertInstanceOf(
                        IllegalArgumentException.class,
                        exception
                ),
                () -> Assertions.assertEquals(
                        "0으로 나눌 수 없습니다.",
                        exception.getMessage()
                )
        );
    }



}