package com.study.java_study.ch17_컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringHashMapMain {

    public static void main(String[] args) {
        HashMap<Integer, String> strMap = new HashMap<>();

        // collection 을 상속받았으면 add가 있어야 한다. = collection을 상속받지 않음
        strMap.put(10, "김준일");
        strMap.put(11, "김준이");
        strMap.put(12, "김준삼");
        strMap.put(13, "김준사");

        System.out.println(strMap);

        System.out.println(strMap.get(11));

        Map<String, String> lang = Map.of( // of를 사용해서 하면 추후에 수정이 불가 = new를 이용해서 생성하면 수정 가능
                "java", "자바",
                "c", "C",
                "python", "파이썬",
                "js", "자바스크립트"
        );

        System.out.println(lang);

        System.out.println(lang.get("java"));

        Set<Map.Entry<String, String>> entries = lang.entrySet();
        // Map은 for each를 돌릴 수 없다 = set 으로 바꾼다 - list로 바꾸지 않는 이유는 중복이 존재할 수 있기 때문
        // Set이 전체를 감싸고 있고, "java", "자바" 이러한 Key와 Value가 하나의 Entry.
        // Entry(Key, Value)는 String, String으로 이루어져 있는 set타입의 변수 entries

        for(Map.Entry<String, String> entry : entries) {
            System.out.println("Key : " + entry.getKey());
            System.out.println("Value : " + entry.getValue());
        }
    }
}