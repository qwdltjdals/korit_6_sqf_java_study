package com.study.java_study.ch08_클래스03;

public class ColorMain {
    public static void main(String[] args) {

        Color[] color1 = new Color[5];
        color1[0] = new Color("#CAB48A", "Brandied Apricot");
        color1[1] = new Color("#FFBE98", "Peach Fuzz");
        color1[2] = new Color("#964F4C", "Marsala");
        color1[3] = new Color("#A78C7B", "BAlmondine");
        color1[4] = new Color("#D8C88D", "Almond peach");

        for(int i = 0; i < color1.length; i++) {
            color1[i].printInfo();
        }
        for(int i = 0; i < color1.length; i++) {
            color1[i].setCode(null);
            color1[i].setName(null);
            color1[i].printInfo();
        }
    }
}

        /*
        문제
        Color 객체 5개를 담을 수 있는 배열을 생성하여
        #CAB48A, Brandied Apricot
        #FFBE98, Peach Fuzz
        #964F4C, Marsala
        #A78C7B, Almondine
        #D8C88D, Almond peach
        색상 데이터를 저장한 후에 for문을 사용하여 배열에 들어있는
        모든 색상 정보를 printInfo()로 호출하여 출력한다.
        이후에 모든 code와 name의 값을 null로 바꾸어 다시 출력한다
        이때 null로 바꿀때에는 반복문을 사용한다.
         */