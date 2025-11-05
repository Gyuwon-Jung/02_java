package com.sekong.section02.string;

public class Application2 {
    public static void main(String[] args) {
        /*
        * 문자열 객체를 만드는 방법
        * "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다. (singleton)
        * new String("문자열") : 매번 새로운 인스턴스를 생성한다*/
        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("str1 == str2 : "+(str1 == str2));
        System.out.println("str1 == str3 : "+(str1 == str3));
        System.out.println("str3 == str4 : "+(str3 == str4));

        //오버라이딩 되어있어서 다 같은 결과가 나옴
        System.out.println("str1 hashcode : "+str1.hashCode());
        System.out.println("str2 hashcode : "+str2.hashCode());
        System.out.println("str3 hashcode : "+str3.hashCode());
        System.out.println("str4 hashcode : "+str4.hashCode());

        System.out.println("====================== : "+System.identityHashCode(str1));
        System.out.println("====================== : "+System.identityHashCode(str2));
        System.out.println("====================== : "+System.identityHashCode(str3));
        System.out.println("===================== : "+System.identityHashCode(str4));

        /*
        * 문자열은 불변이라는 특성을 가진다
        * 변경시 새로 할당된다.
        * */
        str2 = "mysql";
        System.out.println(str1 == str2);

        System.out.println("str1.equals(str3) : "+(str1.equals(str3)));
        System.out.println("str1.equals(str4) : "+(str1.equals(str4)));



    }
}
