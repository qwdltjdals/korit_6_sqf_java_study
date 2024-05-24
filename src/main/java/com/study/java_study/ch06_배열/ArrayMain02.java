package com.study.java_study.ch06_배열;

public class ArrayMain02 {
    public static void main(String[] args) {
        //"김준일" => 주소 : 999
        String a = "김준일"; /// 주소 : 999
        String b = new String("김준일"); // 새로운 주소의 new String을 만든다 그곳에 999를 넣는다.("김준일" 의 리터럴 값의 주소)
//결과값은 같다. 하지만 주소는 다르다
        //new 를 쓰면 매번 새로운 주소가 생긴다?
        System.out.println(a);
        System.out.println(b);

        System.out.println(a == "김준일");
        System.out.println(b == "김준일");

        String[] names = new String[2];
        names[0] = "김준일";
        names[1] = new String("김준일");
        // 위와 아래는 같은 것
        String[] names2 = {"김준일", new String("김준일")}; //앞에 new String[] 이 생략되어 있음
        // 배열 정의 -> 두 칸을 만든 후 값 입력을 한번에 함 / 배열을 알아서 할당해줌

        System.out.println(names[0] == names2[0]);
        System.out.println(names[0] == names2[1]);
        System.out.println(names[0] == a);
        System.out.println(names[1] == names2[1]);
        // == : 주소 비교
        System.out.println(new String[2]);
        System.out.println(new String[] {"a", "b"});
        System.out.println(new String[1]);
        System.out.println(new String[0]);
        System.out.println(new String[2]);
        System.out.println(new int[2]);
        //앞의 내용이 배열이면 {}를 사용 가능 (대입되어질 떄) : 생략 가능
    }
}
