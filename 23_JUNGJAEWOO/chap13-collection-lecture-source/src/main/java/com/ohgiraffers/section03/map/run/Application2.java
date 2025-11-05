package com.ohgiraffers.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {

        /* properties
        * 설정파일의 값을 읽어서 애플리케이션에 적용할 때 사용
        * */

        /* 데이터베이스의 접속 정보를 가지고 있는 객체 */
        Properties prop = new Properties();
        prop.setProperty("driver", "com.mariadb.jdbc.Driver");
        prop.setProperty("url", "jdbc:mariadb://localhost:3306/test");
        prop.setProperty("user", "student");
        prop.setProperty("password", "student");

        System.out.println(prop);
        try {
            prop.store(new FileOutputStream("src/main/java/com/ohgiraffers/section03/map/run/driver.dat")
                    , "jdbc driver(comment)");
            prop.store(new FileWriter("src/main/java/com/ohgiraffers/section03/map/run/driver.properties")
                    , "jdbc driver(comment-properties");
            prop.storeToXML(new FileOutputStream("src/main/java/com/ohgiraffers/section03/map/run/driver.xml")
                    , "jdbc driver(comment-xml)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("==============================================================");
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
        // Properties 객체에 값을 추가할 때는 setProperty(), 값을 가져올 때는 getProperty()
        System.out.println("driver : " + prop2.getProperty("driver"));
        System.out.println("url : " + prop2.getProperty("url"));
        System.out.println("user : " + prop2.getProperty("user"));
        System.out.println("password : " + prop2.getProperty("password"));

    }
}
