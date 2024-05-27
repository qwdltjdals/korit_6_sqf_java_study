package com.study.java_study.ch99_개인연습;


import java.util.Scanner;

public class BookArrayService {
    public static void main(String[] args) { //도서 등록, 조회, 삭제, 수정
        Scanner scanner = new Scanner(System.in);
        BookArrayUtils bookArrayUtils = new BookArrayUtils();

        String[] books = new String[0];

        boolean isRun = true;

        while(isRun) {
            System.out.println("프로그램이 실행됩니다.");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 수정");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 조회");
            System.out.println("5. 도서 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.println();

            System.out.println("메뉴를 선택하시오");
            String selectMenu = scanner.nextLine();
            int findIndex = -1;

            switch(selectMenu) {
                case "1":
                    System.out.println("[도서 등록]");
                    System.out.print("책 제목 입력 : ");
                    String[] newBooks = new String[books.length + 1];
                    for(int i = 0; i < books.length; i++) {
                        newBooks[i] = books[i];
                    }
                    books = newBooks;
                    books[books.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료!");
                    System.out.println();
                    break;
                case "2":
                    System.out.println("[도서 수정]");
                    System.out.print("책 제목 입력 : ");
                    String searchName = scanner.nextLine();
                    findIndex = bookArrayUtils.findBookName(books, searchName);
                    if(findIndex == -1) {
                        System.out.println("해당 도서는 존재하지 않습니다.");
                    }
                    System.out.println("변경 할 이름 : ");
                    books[findIndex] = scanner.nextLine();
                    System.out.println("변경 완료!");
                    break;
                case "3":
                    System.out.println("[도서 삭제]");
                    System.out.println("삭제할 도서 입력 : ");

                case "4":
                case "5":
                    System.out.println("[도서 전체 조회]");
                    for(int i = 0; i < books.length; i++) {
                        System.out.println("Index : [" + i + books[i] + "] 입니다.");
                    }
                    System.out.println();
                    break;
                case "q":
                    System.out.println("프로그램이 종료됩니다.");
                    break;

            }

        }

    }
}
