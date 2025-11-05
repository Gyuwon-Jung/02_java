package com.ohgiraffers.section02.assertj;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/* Test 3rd party lib 중 AssertJ의 사용법에 대해 이해할 수 있다. */
class AssertjTests {

    /* 1. 문자열 테스트 */
    @Test
    @DisplayName("문자열 테스트 하기")
    void testStringValidation()  {
        /* given */
        String expected = "hello world";

        /* when */
        String actual = new String(expected);
        /* then */
        Assertions.assertThat(actual)
                .isNotEmpty()
                .isNotBlank()
                .contains("hello")
                .doesNotContain("hahaha")
                .startsWith("h")
                .endsWith("d")
                .isEqualTo(expected);
    }

    /* 2. 숫자 테스트 */
    @Test
    @DisplayName("숫자 테스트 하기")
    void testIntegerValidation() {
        /* given */
        double pi = Math.PI;
        Double actual = Double.valueOf(pi);

        /* when */
        /* then */
        Assertions.assertThat(actual)
                .isPositive()
                .isGreaterThan(3)
                .isLessThan(4)
                .isEqualTo(Math.PI);
    }

    /* 3. 날짜 테스트 */
    @Test
    @DisplayName("날짜 테스트 하기")
    void testLocalDateTimeValidation() {
        String birthDat = "2014-09-18T16:42:00.000";
        LocalDateTime theDay = LocalDateTime.parse(birthDat);

        Assertions.assertThat(theDay)
                .hasYear(2014)
                .hasMonthValue(9)
                .hasDayOfMonth(18)
                .isBetween("2014-01-01T16:42:00.000", "2014-12-31T16:42:00.000")
                .isBefore(LocalDateTime.now());
    }

    /* 4. 예외 테스트 */
    @Test
    @DisplayName("예외 테스트")
    void testExceptionValidation() {
        Throwable thrown = AssertionsForClassTypes.catchThrowable(() -> {
            throw new IllegalArgumentException("잘못 된 파라미터를 입력하였습니다.");
        });

        Assertions.assertThat(thrown)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("파라미터");
    }

    /* 5. filter를 이용한 단정문 테스트 */
    @Test
    @DisplayName("filtering assertions 테스트")
    void testFilteringAssertions() {
        /* given */
        Member member1 = new Member(1, "user01", "홍길동", 16);
        Member member2 = new Member(2, "user02", "이순신", 26);
        Member member3 = new Member(3, "user03", "신사임당", 36);

        List<Member> members = Arrays.asList(member1, member2, member3);
        /* when */
        /* then */
        Assertions.assertThat(members).filteredOn(member -> member.getAge() > 19)
                .containsOnly(member2, member3)
                .filteredOn("age", 26)
                .containsOnly(member2);

    }









}