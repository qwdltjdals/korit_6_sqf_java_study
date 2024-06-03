package com.study.java_study.ch17_컬렉션;

import java.util.*;

public class StringHashSetMain {
    public static void main(String[] args) {

        HashSet<String> strSet = new HashSet<>();

        // 추가
        strSet.add("김준일");
        strSet.add("김준이");
        strSet.add("김준삼");
        strSet.add("김준사");

        System.out.println(strSet);

        for(String name : strSet) {
            System.out.println(Objects.hash(name));
        }

        Set<Integer> num2 = Set.of(1,3,5);
        System.out.println(num2);
        ArrayList<Integer> strNum2 = new ArrayList<>();
        strNum2.addAll(num2);

        HashSet<String> hSet = new HashSet<>();
        hSet.add("a");
        hSet.add("dd");
        hSet.add("ddd");
        hSet.add("ddd");
        System.out.println(hSet);

        HashSet<String> hSet2 = new HashSet<>();


        ArrayList<String> aList = new ArrayList<>();
        aList.add("ddd");
        aList.add("aaa");
        aList.add("dad");
        aList.add("dda");
        aList.add("dda");
        aList.add("dda");
        hSet2.addAll(aList);
        System.out.println(aList);
        System.out.println(hSet2);



        Set<String> set2 = Set.of("d", "dd", "ddd", "dddd");
        System.out.println(set2);


        strSet.addAll(List.of("김준일", "김준일", "김준이"));
        // set = 중복이 안됨 / 순서가 없음

        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(strSet);

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return String.CASE_INSENSITIVE_ORDER.compare(o1, o2);
            }
        };

        strList.sort(stringComparator);
        System.out.println(strList);
        // =
//        strList.sort((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1, o2));
//        System.out.println(strList);

    }
}
