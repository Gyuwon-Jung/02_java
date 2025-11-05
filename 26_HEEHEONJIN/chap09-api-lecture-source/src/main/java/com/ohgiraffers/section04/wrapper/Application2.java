package main.java.com.ohgiraffers.section04.wrapper;

public class Application2 {
    public static void main(String[] args) {
        // parsing: 문자열(string) 값을 기본자료형 값으로 변경하는 것을 parsing이라고 한다.
        // 정해진 형식의 문자열을 어떤 내용(형식)으로 바꿨냐...
        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4"); // <--- 얘는 꼭기억
        long l = Long.parseLong("8"); // 8L 8l 은 안됨
        float f = Float.parseFloat("3.14f"); // 3.14f는 됨
        double d = Double.parseDouble("8.0");
        boolean bool = Boolean.parseBoolean("true");

        char c = "abc".charAt(0);
    }
}
