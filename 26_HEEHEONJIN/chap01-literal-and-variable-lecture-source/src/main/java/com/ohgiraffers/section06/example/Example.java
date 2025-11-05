package com.ohgiraffers.section06.example;

public class Example {
    public static void main(String[] args) {
            /*
        어떤 상점에서 판매하는 상품의 가격이 정수(int) 형태로 주어집니다. 당신은 이 상품을 여러 개 구매하려고 합니다.
        다음 요구사항에 따라 최종 결제 금액을 계산하는 자바 코드를 작성하세요.
        요구사항:
        상수(Constant): 부가세율(TAX_RATE)을 0.1 (10%)로 하는 상수를 선언하세요.

        변수(Variable):
        상품의 가격(price)을 저장할 int 타입 변수를 선언하고, 12000으로 초기화하세요.

        구매할 상품의 수량(quantity)을 저장할 int 타입 변수를 선언하고, 3으로 초기화하세요.

        계산 과정:
        세전(Pre-tax) 총 금액을 계산하세요 (가격 * 수량).
        계산된 세전 총 금액을 기준으로 부가세(Tax) 금액을 계산하세요.
        세후(After-tax) 최종 금액을 계산하세요 (세전 총 금액 + 부가세).

        형변환(Type Casting):
        부가세와 세후 최종 금액은 소수점이 발생할 수 있으므로 double 타입 변수에 저장해야 합니다.
        하지만, 고객에게 청구할 최종 결제 금액은 소수점 이하를 버리고 int 타입으로 보여줘야 합니다.

        double 타입의 세후 최종 금액을 int 타입으로 명시적 형변환하여 출력하세요.

        -- 출력 예시 --
        세전 금액: 36000원
        부가세: 3600.0원
        세후 금액: 39600.0원
        최종 결제 금액: 39600원
     */
        double TAX_RATE = 0.1;
        int price = 12000;
        int quantity = 3;
        double tax = price * quantity * TAX_RATE;

        int sum = price * quantity;
        double afterTax = sum + tax;

        int total = (int) (sum + sum * TAX_RATE);
        System.out.println("세전 금액: " + sum);
        System.out.println("부가세: " + tax);
        System.out.println("세후 금액: " + afterTax);
        System.out.println("최종 결제 금액:" + total);
    }
}
