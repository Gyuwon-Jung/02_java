package com.sekong.section3.map.run;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        /*Properties
        * HashMap과 거의 유사하지만 key와 value 모두를 String으로만 사용할 수 있는 자료구조이다.
        * 설정파일의 값을 읽어서 애플리케이션에 적용할 때 사용
        * */

        Properties prop = new Properties();
        prop.setProperty("driver", "com.mysql.cj.jdbc.Driver");
        prop.setProperty("url", "jdbc:mysql://127.0.0.1:3306/test");
        prop.setProperty("user","student");
        prop.setProperty("password","student");

        System.out.println(prop);

        try {
            prop.store(new FileOutputStream("src/main/java/com/sekong/section3/map/run/driver.dat")
                    , "jdbc driver(comment)");
            prop.store(new FileWriter("src/main/java/com/sekong/section3/map/run/driver.properties")
                        , "jdbc driver(comment-properties)");
            prop.storeToXML(new FileOutputStream("src/main/java/com/sekong/section3/map/run/driver.xml")
                        , "jdbc driver(comment-xml)");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("======================================");
        Properties prop2 = new Properties();
        System.out.println("prop2 : " + prop2);

        try {
//            prop2.load(new FileInputStream("src/main/java/com/sekong/section3/map/run/driver.dat"));
//            prop2.load(new FileInputStream("src/main/java/com/sekong/section3/map/run/driver.properties"));
            prop2.loadFromXML(new FileInputStream("src/main/java/com/sekong/section3/map/run/driver.xml"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("prop2 : " + prop2);
        // Properties 객체에 값을 추가할때는 setProperty(), 값을 가져올때는 getProperty()
        System.out.println("driver : " + prop2.getProperty("driver"));
        System.out.println("url : " + prop2.getProperty("url"));
        System.out.println("user : " + prop2.getProperty("user"));
    }
}
