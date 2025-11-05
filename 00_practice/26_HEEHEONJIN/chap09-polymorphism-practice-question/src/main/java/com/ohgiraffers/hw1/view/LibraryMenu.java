package main.java.com.ohgiraffers.hw1.view;

import main.java.com.ohgiraffers.hw1.controller.LibraryManager;
import main.java.com.ohgiraffers.hw1.model.dto.Book;
import main.java.com.ohgiraffers.hw1.model.dto.Member;

import java.util.Scanner;

public class LibraryMenu {
    private LibraryManager lm = new LibraryManager();


    public void mainMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.print("성별을 입력하세요 : ");
        char gender = sc.next().charAt(0);

        Member member = new Member(name, age, gender);
        lm.insertMember(member);

//        System.out.println("==== 메뉴 ====");
//        System.out.println("1. 마이페이지");
//        System.out.println("2. 마이페이지");
//        System.out.println("3. 마이페이지");
//        System.out.println("4. 마이페이지");
//        System.out.println("4. 마이페이지");

        do {
            int select = sc.nextInt();
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 마이페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("4. 프로그램 종료하기");

        } while(select == 0);

        switch(select) {
                case 1:
                    System.out.println(lm.myInfo());
                    break;
                case 2:
                    lm.selectAll();
                    break;
            case 3:
                    searchBook();
                    break;
            case 4:
                    rentBook();
                    break;
            case 0:
                    System.out.println("프로그램을 종료합니다.");
                    select = 0;
                    break;
            default:
                    System.out.println("잘못된 입력값입니다.");
                    break;

        }

//        while(select != 0){
//            switch(select) {
//                case 1:
//                    System.out.println(lm.myInfo());
//                    break;
//                    case 2:
//                        lm.selectAll();
//                        break;
//                        case 3:
//                            searchBook();
//                            break;
//                            case 4:
//                                rentBook();
//                                break;
//                                case 0:
//                                    System.out.println("프로그램을 종료합니다.");
//                                    select = 0;
//                                    break;
//                                    default:
//                                        System.out.println("잘못된 입력값입니다.");
//                                        break;
//            }
//        }
      }
    public void selectAll(){
        main.java.com.ohgiraffers.hw1.model.dto.Book[] bList = lm.selectAll();
        for (int i = 0; i < bList.length; i++) {
            System.out.println(i + "번 도서 : " + bList[i]);
        }
    }
    public void searchBook(){
        System.out.println("검색할 제목 키워드 : ");
        Scanner sc = new Scanner(System.in);
        String keyword = sc.nextLine();
        main.java.com.ohgiraffers.hw1.model.dto.Book[] searchList = lm.searchBook(keyword);

        for(Book each : searchList) {
            if (each != null) {
                System.out.println(each);

            } else {
                new NullPointerException();
            }
        }
    }
    public void rentBook(){
        lm.selectAll();
        Scanner sc = new Scanner(System.in);
        int result = sc.nextInt();
        switch (result) {
            case 0:
                System.out.println("성공적으로 대여되었습니다.");
                break;
            case 1:
                System.out.println("나이 제한으로 대여가 불가능합니다.");
                break;
            case 2:
                System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다.\n" +
                        "마이페이지를 통해 확인하세요");
                break;
            default:
                System.out.println("잘못된 입력입니다.");
        }
    }
}
