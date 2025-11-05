package com.swcamp.section03.map.run;

import java.io.*;
import java.util.Properties;

public class Application2 {

    public static void main(String[] args) {

        /*
        Properties
        HashMap과 거의 유사하지만 key와 value 모두를 String으로만 사용할 수 있는 자료구조이다.
        설정파일의 값을 읽어서 애플리케이션에 적용할 때 사용
         */

        // 데이터베이스의 접속 정보를 가지고 있는 객체
        Properties prop = new Properties();
        prop.setProperty("driver", "com.mariadb.jdbc.Driver");
        prop.setProperty("url", "jdbc:mysql://localhost:3307/test");
        prop.setProperty("username", "student");
        prop.setProperty("password", "student");

        System.out.println(prop);

        // 이 정보를 내보내기 할 수 있다.
        try {
            prop.store(new FileOutputStream("src/main/java/com/swcamp/section03/map/run/driver.dat")
                    , "jdbc driver(comment)");
            prop.store(new FileWriter("src/main/java/com/swcamp/section03/map/run/driver.properties")
                    , "jdbc driver(comment-properties)");
            prop.storeToXML(new FileOutputStream("src/main/java/com/swcamp/section03/map/run/driver.xml")
                    , "jdbc driver(comment-xml)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 위 파일에서 정보 가져오기 (실제로 더 많이 쓰게 될 것)
        System.out.println("=====================================");
        Properties prop2 = new Properties();
        System.out.println("prop2 : " + prop2);

        try {
//            prop2.load(new FileInputStream("src/main/java/com/swcamp/section03/map/run/driver.dat"));
//            prop2.load(new FileReader("src/main/java/com/swcamp/section03/map/run/driver.properties"));
            prop2.loadFromXML(new FileInputStream("src/main/java/com/swcamp/section03/map/run/driver.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("prop2 : " + prop2);
        // Properties 객체에 값을 추가할 때는 setProperty(), 값을 가져올 때는 getProperty()
        System.out.println("driver : " + prop2.getProperty("driver"));
        System.out.println("url : " + prop2.getProperty("url"));
        System.out.println("username : " + prop2.getProperty("username"));
        System.out.println("password : " + prop2.getProperty("password"));

    }
}
