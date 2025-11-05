package com.sekong.section02.string;

public class Application {
    public static void main(String[] args) {
        int[] arr = new int[4];
        System.out.println(arr.length);

        /* length() : 문자열의 길이를 정수형으로 반환*/
        System.out.println("length() : " +"hello".length());
        System.out.println("빈 문자열의 길이 :"+ "".length());

        /*charAt(int index) : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환한다.
        * 인덱스는 0뷰터 시작하는 숫자체계를 의미하며
        * 인덱스를 벗어난 정수를 인자로 전달하는 경우에는 IndexOutOfBoundException이 발생한다.*/
        String str1 = "apple";

        for(int i = 0; i < str1.length(); i++) {
            System.out.println("charAt("+i+") : " + str1.charAt(i));
        }

        /*
        * compareTo() : 인자로 전달된ㅁ ㅜㄴ자열과 사전 순으로  비교하여
        * 두 문자열이 같다면 0을 반환, 인자로 전달된 문자열보다 작으면 음수를 크면 양수를 반환한다.
        * 단, 대소문자를 구분하여 비교한다.*/
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        System.out.println("compareTo() : "+(str2.compareTo(str3))); // 0
        // j : 106 J : 74 a : 97 A : 65
        System.out.println("compareTo() : "+(str2.compareTo(str4))); // 32
        System.out.println("compareTo() : "+(str4.compareTo(str2))); // -32
        // j=106 o=111
        System.out.println("compareTo() : "+(str2.compareTo(str5))); // -5

        // compareToIgnoreCase() : 대소문자를 구분하지 않고 비교
        System.out.println("comparToIgnoreCase() : "+(str2.compareToIgnoreCase(str4)));

        /*
        * concat() : 문자열에 인자로 전달된 문자열을 합쳐 새로운 문자열을 반환한다.
        * 원본 문자열에는 영향을 주지않는다.*/
        System.out.println("concat() : " + (str2.concat(str5)));
        System.out.println("str2 : "+str2);

        /*
        * indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환한다.
        * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
        * 왼 -> 오
        * */
        String indexOf = "java mariadb";
        System.out.println("indexOf(a) : "+ indexOf.indexOf("v")); // 2
        System.out.println("indexOf(a) : "+ indexOf.indexOf("a")); // 1

        /*
        * lastIndexOf() : 문자열 탐색을 뒤에서부터 하고 처음 일치하는 위치의 인덱스를 반환한다,
        * 단, 일치하는 문자가 없는 경우 -1을 반환한다.
        * 찾는건 오 -> 왼 인덱스는 왼쪽부터
        * */
        System.out.println("indexOf(a) : "+ indexOf.lastIndexOf("a")); // 9

        /*trim() : 문자열의 앞 뒤에 공백을 제거한 문자열을 반환한다.*/
        String trimStr = "     java     ";
        System.out.println("trimStr : #"+trimStr+"#");
        System.out.println("trimStr : #"+trimStr.trim()+"#");
        System.out.println("trimStr : #"+trimStr+"#");

        /*
        * toLowerCase(): 모든 문자를 소문자로 변환시킨다.
        * toUpperCase(): 모든 문자를 대문자로 반환시킨다.
        * */
        String caseStr = "javaMariaDB";
        System.out.println("toLowerCase() : "+caseStr.toLowerCase());
        System.out.println("toUpperCase() : "+caseStr.toUpperCase());

        /*
        * substring() : 문자열의 일부를 잘라내어 새로운 문자열을 반환한다*/
        String subString = "javamysql";

        System.out.println("subString(3,6) : "+ subString.substring(3,6));
        System.out.println("subString(3) : "+ subString.substring(3));
        System.out.println(subString);

        /*isEmpty(): 문자열의 길이가 0이면 true를 반환, 아니면 false반환*/
        System.out.println("isEmpty : "+"".isEmpty());
        System.out.println("isEmpty : "+"abc".isEmpty());
    }
}
