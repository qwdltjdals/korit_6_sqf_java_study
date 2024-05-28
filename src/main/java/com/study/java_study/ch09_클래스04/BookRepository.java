package com.study.java_study.ch09_클래스04;

public class BookRepository { // 저장소 영역 -> CRUD가 이루어짐 / 데이터 추가 삭제 수정 조회 영역
    private int bookId;
    private  BookEntity[] books;

    public BookRepository() { //생성자 변수 선언
        books = new BookEntity[0];
    }

    public int autoIncrementBookId() {
        return ++bookId;
    }

    private void extendBooks() { //private : 어디선가 사용하고 있다.
        // 기존 배열보다 크기가 하나 더 큰 배열을 생성한다.
        BookEntity[] newBooks = new BookEntity[books.length + 1]; // saveBook을 할 때마다 기존 배열보다 하나 더 크게 만듦

        // 기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 때 마지막 인덱스의 값은 빈값이다.
        for(int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }
        // 기존 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소값을 대입한다.
        books = newBooks;
    }

    private int getLastIndex() {
        return books.length - 1;
    }

    public void saveBook(BookEntity book) {
        // 배열 확장
        extendBooks(); // 호출

        // 새로운 배열의 비어있는 마지막 인덱스에 매개변수로 받아온 book 객체를 대입한다.
        books[getLastIndex()] = book;
    }

    //단건조회
    public BookEntity findBookByBookId(int bookId) {
        BookEntity findBook = null; //findBook 변수 생성
        // 선형 탐색 포이치
        for(BookEntity book : books) {
            if(book.getBookId() == bookId) {
                findBook = book;
                break;
            }
        }
        return findBook;
    }
    //단건조회
    public BookEntity findBookByBookName(String bookName) {
        BookEntity findBook = null;
        for(BookEntity book : books) {
            if(book.getBookName().equals(bookName)) { // bookName은 String 이라 equals로 비교
                findBook = book;
                break;
            }
        }
        return  findBook;
    }

    private int getNewArraySize(int option, String searchText) {
        int newArraySize = 0;

        switch (option) {
            case 1: //통합검색
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText) // contains() = ()의 문자열에 포함 되어있는것까지 검색 가능.
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
                    break;
                    case 2: // 도서명 검색
                        for (BookEntity book : books) {
                            if (book.getBookName().contains(searchText)) {
                                newArraySize++;
                            }
                        }
                        break;
                    case 3: // 저자명 검색
                        for (BookEntity book : books) {
                            if (book.getAuthor().contains(searchText)) {
                                newArraySize++;
                            }
                        }
                        break;
                    case 4: // 출판사명 검색
                        for (BookEntity book : books) {
                            if (book.getPublisher().contains(searchText)) {
                                newArraySize++;
                            }
                        }
        }
        return newArraySize;
    }
    //다건조회
    public BookEntity[] searchBooks(int option, String searchText) {
        int newArraySize = getNewArraySize(option, searchText);

        BookEntity[] searchBooks = new BookEntity[newArraySize]; // 위에서 +한 만큼의 배열을 만듦

        int i = 0;
        switch (option) {
            case 1: //통합검색
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText) // contains() = ()의 문자열에 포함 되어있는것까지 검색 가능.
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 2: // 도서명 검색
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 3: // 저자명 검색
                for (BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 4: // 출판사명 검색
                for (BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
        }
        return  searchBooks;
    }
}
