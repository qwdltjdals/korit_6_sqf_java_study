package com.study.java_study.ch09_클래스04;

import java.util.Scanner;

public class BookService {

    private Scanner scanner;
    private BookRepository bookRepository;

    public BookService() {
        scanner = new Scanner(System.in);
        bookRepository = new BookRepository();
    }

    private String selectMenu() {
        String menus = "1234q";
        String selectedMenu = null;

        while(true) {
            System.out.print("메뉴 선택");
            selectedMenu = scanner.nextLine();
            if(menus.contains(selectedMenu)) {
                break; // menus에 포함이 되어있으면 ("1234q") 실행하고, 포함이 되어있지 않으면 무한루프
            }
            System.out.println("잘 못 된 입력입니다. 다시 입력하세요.");
        }

        return selectedMenu;
    }

    public boolean run() {
        boolean isRun = true;

        System.out.println("[도서 관리 프로그램]");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectMenu();

        switch (selectedMenu) {
            case "q":
                isRun = false;
                break;
            case "1":
                registerBook();
                break;
            case "2":
                search();
                break;
            case "3":
                break;
            case "4":
            default:
                System.out.println("입력 오류!");
        }
        System.out.println();

        return isRun;
    }

    private String validateValue(String title) {
        String value = null;
        while(true) {
            System.out.println(title + " 명 : ");
            value = scanner.nextLine();
            if (!value.isBlank()) { // 띄워쓰기 불포함 = blank / 띄워쓰기 포함 = empty
                break; // 공백이 아닐 때 루프를 빠져나감
            }
            System.out.println(title + " 명은 공백일 수 없습니다. 다시 입력하세요.");
        }
        return  value;
    }

    private String duplicateBookName() {
        String bookName = null;
        while (true) {
            bookName = validateValue("도서"); // = title
            if(bookRepository.findBookByBookName(bookName) == null) {
                break; // 값이 null(존재하지 않는다) 이면 루프 종료
            }
            System.out.println("해당 도서명이 이미 존재합니다. 다시 입력하세요.");
        }
        return bookName;
    }

    private void registerBook() {
        System.out.println("[ 도서 등록 ]");
        int bookId = bookRepository.autoIncrementBookId();
        String bookName = duplicateBookName();
        String author = validateValue("저자");
        String publisher = validateValue("출판사");

        BookEntity book = new BookEntity(bookId, bookName, author, publisher); // 생성자를 통한 값 주입
        bookRepository.saveBook(book); // 배열에 저장
        System.out.println("새로운 도서를 등록하였습니다.");
    }

    private void search() {
        System.out.println("[ 도서 검색 ]");
        System.out.println("1. 통합 검색");
        System.out.println("2. 도서명 검색");
        System.out.println("3. 저자명 검색");
        System.out.println("4. 출판사명 검색");
        System.out.println("옵선 선택 : ");

        int option = scanner.nextInt();
        scanner.nextLine(); // 버퍼의 기능 날리기
        System.out.print("검색어 입력 : ");
        String searchText = scanner.nextLine();
        BookEntity[] searchBooks = bookRepository.searchBooks(option, searchText);

        System.out.println("[검색 결과 ]");
        if(searchBooks.length == 0) {
            System.out.println("검색 결과가 없습니다.");
            return; // search라는 메서드를 빠져나감
        }
        for(BookEntity book : searchBooks) {
            System.out.println(book.toString());
        }
    }

}
