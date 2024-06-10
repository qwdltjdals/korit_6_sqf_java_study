package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaInterface2 {
    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("프로그램 시작");

        runnable.run();

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("프로그램 종료");
            }
        };
        runnable1.run();

        Function<String, Integer> str = s -> Integer.parseInt(s);
            Integer num = str.apply("100");
            System.out.println("num : " + num);

            Integer num2 = str.andThen(result -> result + 1000).apply("1000");
        System.out.println("num2 : " + num2);

            Function function = new Function() {
                @Override
                public Object apply(Object o) {
                    return null;
                }
            };
        System.out.println(function);

        Consumer<String> name = s ->
                System.out.println(s + " 님 환영합니다.");
        name.accept("이성민");

        Consumer consumer = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println( o + " 님 환영합니다.");
            }
        };

        Supplier<String> sup = () -> {
            String result = name + " 입니다.";
            return result;
        };
        System.out.println(sup.get());

        Predicate<Integer> even = integer -> integer % 7 == 0;
        System.out.println(even.test(15462315));
    }
}
