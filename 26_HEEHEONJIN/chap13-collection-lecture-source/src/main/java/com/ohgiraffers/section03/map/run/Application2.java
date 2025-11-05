package com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        /*
        * Properties
        * HashMap과 거의 유사하지만 key와 value 모두를 String으로만 사용할 수 있는 자료구조이다.
        * 설정파일의 값을 읽어 애플리케이션에 적용할 때 사용
        * */

        /*데이터베이스의 접속 정보를 가지고 있는 객체*/
        Properties prop = new Properties();
        prop.setProperty("driver", "com.mariadb.jdbc.Driver");
        prop.setProperty("url", "jdbc:maria://localhost:3306/test");
        prop.setProperty("user", "student");
        prop.setProperty("password", "student");

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("src/main/java/com/ohgiraffers/section03/map/run/driver.dat")
            , "jdbc driver(comment)");
            prop.store(new FileWriter("src/main/java/com/ohgiraffers/section03/map/run/driver.properties")
            ,"jdbc driver(comment-properties)");
            prop.storeToXML(new FileOutputStream("src/main/java/com/ohgiraffers/section03/map/run/driver.xml")
                    ,"jdbc driver(comment-xml)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("=====================");
        Properties prop2 = new Properties();
        System.out.println("prop2 : " + prop2);

        try {
//            prop2.load(new FileInputStream("src/main/java/com/ohgiraffers/section03/map/run/driver.dat"));
//            prop2.load(new FileReader("src/main/java/com/ohgiraffers/section03/map/run/driver.properties"));
              prop2.loadFromXML(new FileInputStream("src/main/java/com/ohgiraffers/section03/map/run/driver.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("prop2 : " + prop2);
        // Properties 객체에 값을 추가할때는 setProperty(), 값을 가져올때는 getProperty()
        System.out.println("driver : " + prop2.getProperty("driver"));
        System.out.println("url : " + prop2.getProperty("url"));
        System.out.println("user : " + prop2.getProperty("user"));
        System.out.println("password : " + prop2.getProperty("password"));
    }
}
