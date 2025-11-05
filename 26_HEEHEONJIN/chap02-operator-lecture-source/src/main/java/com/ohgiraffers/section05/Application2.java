package com.ohgiraffers.section05;

public class Application2 {
    public static void main(String[] args) {

        int x = 3;
        int y = 10;

        /* 1. 1부터 100 사이의 값인지 확인 */
        /* 1 <= 변수 <= 100 이렇게는 사용 못함  --> 변수 >= 1 && 변수 <= 100 이렇게 사용해야 한다. */
        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : " + (num1 >= 1 && num1 <= 100));

        int num2 = 166;
        System.out.println("1부터 100 사이인지 확인 : " + (num2 >= 1 && num2 <= 100));

        /* 2. 영어 대문자인지 확인 */
        /* 영어 대문자냐? --> 문자변수 >= 'A' && 문자변수 <= 'Z' */
        char ch1 = 'G';
        System.out.println("영어 대문자인지 확인 : " + (ch1 >= 'A' && ch1 <= 'Z'));

        char ch2 = 'g';
        System.out.println("영어 대문자인지 확인 : " + (ch2 >= 'A' && ch2 <= 'Z'));

        /* 3. 대소문자 상관 없이 영문자 y인지 확인 */
        /* 문자변수 == 'y' || 문자변수 == 'Y' */
        char ch3 = 'Y';
        System.out.println("영문자 y인지 확인 : " + (ch3 == 'y' || ch3 == 'Y'));

        char ch4 = 'y';
        System.out.println("영문자 y인지 확인 : " + (ch4 == 'y' || ch4 == 'Y'));

        /* 4. 영문자인지 확인 */
        /* A : 65, Z : 90, a : 97, z : 122 (중간에 91 ~ 96까지는 영문자가 아님) */
        /* 연산자 우선순위를 고려한다면 논리 and 연산이 먼저 수행되기 때문에 괄호는 묶지 않아도 된다.
         * 논리적으로 먼저 실행하는 내용을 괄호로 묶어 주는게 좋다.
         * */
        char ch5 = 'f';
        System.out.println("영문자인지 확인 : " + ((ch5 >= 'A' && ch5 <= 'Z') || (ch5 >= 'a' && ch5 <= 'z')));
        System.out.println("영문자인지 확인 : " + ((ch5 >= 65 && ch5 <= 90) || (ch5 >= 97 && ch5 <= 122)));

        char ch6 = 'F';
        System.out.println("영문자인지 확인 : " + ((ch6 >= 'A' && ch6 <= 'Z') || (ch6 >= 'a' && ch6 <= 'z')));
        System.out.println("영문자인지 확인 : " + ((ch6 >= 65 && ch6 <= 90) || (ch6 >= 97 && ch6 <= 122)));

        /* 1. 논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행 안함  */
        /* 조건식 두 개가 모두 만족해야 true를 반환하지만 앞에서 미리 false가 나오게 되면
         * 뒤의 조건을 확인할 필요 없이 false를 반환한다.
         * 따라서 연산 횟수를 줄이기 위해서는 &&연산의 경우 앞에 false가 나올 가능성이 높은 조건을 작성하는 편이 좋다.
         * */
        int num11 = 10;

        /* 앞에 조건이 false로 강제화 해 두고 && 뒤의 조건은 선치 증가로 값을 증가시킨 후 별 의미 없는 조건식으로 만들어놓았다.
         * num1 선치 증가 코드가 동작했다면 result1은 11일 것이고, 동작하지 않았다면 결과는 10일 것이다.
         * */
        int result1 = (false && ++num11 > 0)? num11 : num11;

        System.out.println("&&실행 확인 : " + result1);		//10

        /* 2. 논리식 || 논리식 : 앞의 결과가 true이면 뒤를 실행 안함 */
        /* 조건식 둘 중 하나라도 true를 반환하면 true를 반환하기 때문에 앞에서 미리 true가 나오게 되면
         * 뒤의 조건을 확인할 필요 없이 true를 반환한다.
         * 따라서 연산 횟수를 줄이기 위해서는 ||연산의 경우 앞에 true가 나올 가능성이 높은 조건을 작성하는 편이 좋다.
         * */
        int num22 = 10;

        /* 앞에 조건을 true로 강제화 해 두고 || 뒤의 조건은 선치 증가로 값을 증가시킨 후 별 의미 없는 조건식으로 만들어놓았다.
         * num1 선치 증가 코드가 동작했다면 result2는 11일 것이고, 동작하지 않았다면 결과는 10일 것이다.
         * */
        int result2 = (true || ++num22 > 0)? num22 : num22;

        System.out.println("||실행 확인 : " + result2);		//10
    }
}
