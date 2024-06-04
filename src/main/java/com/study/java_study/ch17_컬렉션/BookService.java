package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookService {

    // 싱글톤 = 하나의 객체만 만들어서 하나만 사용함(밖에서 new를 사용할 수 없게 해야함)
    private static BookService instance;

    private BookService() {} // = 다른 곳에서 만들 수 없게 만들어 둔 것(외부에서 접근 불가)

    public static BookService getInstance() {
        if (instance == null) {
            instance = new BookService();
        }
        return instance;
    }

    private List<Map<String, Object>> bookDB = List.of( // 임의의 데이터베이스 생성
            Map.of(
                    "bookId", 1,
                    "bookName", "자바의 정석"
            ),
            Map.of(
            "bookId", 2,
            "bookName", "파이썬의 정석"
            ),
            Map.of(
            "bookId", 3,
            "bookName", "데이터베이스의 정석"
            )

    );

    public void run1() {
        System.out.println("도서 전체 정보를 요청합니다.");
        run2();
    }

    public void run2() {
        System.out.println("도서 전체 정보 요청을 받았습니다.");
        List<BookEntity> bookEntities = run3(); // BookEntity 타입의 리스트 bookEntities를 만들어서 그 안에 run3 의 리턴값을 대입
        BookRequestDto bookRequestDto = new BookRequestDto(200, "조회 완료", bookEntities); // Dto에 있는 것들을 사용
        run4(bookRequestDto); // run4를 호출하면서 bookRequestDto 를 넣기
    }

    public List<BookEntity> run3() { // 출력 - arrayList생성(BookEntity)를 담음 - DB를 반복 - map형태를 bookEntities로 변환후 집어넣고 리턴
        System.out.println("데이터 베이스에서 도서 전체 정보를 조회합니다.");
        List<BookEntity> bookEntities = new ArrayList<>(); // BookEntity 타입의 리스트 bookEntities를 생성
        for(Map<String, Object> bookMap : bookDB) { // bookDB에 들어있는 데이터들을 하나하나 돌려서 bookMap 에 대입
            BookEntity bookEntity = new BookEntity( // bookEntity를 생성
                    (int)bookMap.get("bookId"), // bookMap에 있는 데이터들을 가져옴
                    (String)bookMap.get("bookName")
                    // 오브젝트 데이터들을 int, String으로 형변환
            );

            bookEntities.add(bookEntity); // bookEntities 에 bookEntity 를 붙혀넣기
        }
        return bookEntities; // 데이터 반환
    }

    public void run4(BookRequestDto bookRequestDto) {
        System.out.println("데이터 베이스의 정보를 요청한 클라이언트에게 응답합니다.");
        System.out.println("[ 응답 뎅이터 ]");
        System.out.println(bookRequestDto);
    }
}
