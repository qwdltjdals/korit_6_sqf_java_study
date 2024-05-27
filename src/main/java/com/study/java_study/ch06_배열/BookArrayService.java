package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {
    public static void main(String[] args) { //도서 등록, 조회, 삭제, 수정
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        String[] books = new String[0];
        BookArrayUtils bookArrayUtils = new BookArrayUtils();
        String[] newBook = null;

        while (isRun) {
            System.out.println("프로그램이 실행됩니다.");
            System.out.println("1. 도서 등록.");
            System.out.println("2. 도서 수정.");
            System.out.println("3. 도서 삭제.");
            System.out.println("4. 도서 조회.");
            System.out.println("5. 도서 목록 전체 조회.");
            System.out.println("q. 프로그램 종료.");
            System.out.println("메뉴 선택");

            String selectMenu = scanner.nextLine();
            int findIndex = -1;

            switch (selectMenu) {
                case "1":
                    System.out.println("[도서 등록]");
                    System.out.println("등록할 이름 : ");
                    newBook = new String[books.length + 1];
                    for(int i = 0; i < books.length; i++) {
                        newBook[i] = books[i];
                    }
                        books = newBook;
                        books[books.length - 1] = scanner.nextLine();
                        System.out.println("등록 완료!");
                    System.out.println();
                    break;
                case "2":
                    System.out.println("[도서 수정]");
                    System.out.println("수정할 도서 : ");
                    String modifyBook = scanner.nextLine();
                    findIndex = bookArrayUtils.findNameByName(books, modifyBook);
                    if(findIndex == -1) {
                        System.out.println("해당 도서는 없는 도서입니다.");
                        break;
                    }
                    System.out.println("새 이름 : ");
                    books[findIndex] = scanner.nextLine();
                    System.out.println(modifyBook + " 로 수정 완료!");
                    System.out.println();
                    break;
                case "3":
                    System.out.println("[도서 삭제]");
                    System.out.println("삭제 할 도서");
                    String removeName = scanner.nextLine();
                    findIndex = bookArrayUtils.findNameByName(books, removeName);
                    if (findIndex == -1) {
                        System.out.println("해당 도서는 없는 도서입니다.");
                        break;
                    }

                case "4":
                    System.out.println("[도서 조회]");
                    System.out.println("조회할 도서 : ");
                    String findBook = scanner.nextLine();
                    findIndex = bookArrayUtils.findNameByName(books, findBook);
                    if(findIndex == -1) {
                        System.out.println("이 책은 없는 책 입니다.");
                        break;
                    }
                    System.out.println(findBook + " 은 목록에 있습니다.");
                    System.out.println();
                    break;
                case "5":
                    System.out.println("[도서 목록 전체 조회]");
                    for(int i = 0; i < books.length; i++) {
                        System.out.println("index : [" + i + "]: " + books[i]);
                    }
                    System.out.println();
                    break;
                case "q":
                    isRun = false;
                    System.out.println("프로그램이 종료됩니다.");
                default:
            }
        }

    }
}
