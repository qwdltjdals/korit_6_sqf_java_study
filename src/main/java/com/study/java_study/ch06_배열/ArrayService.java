package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

        while(isRun) {
            System.out.println("[이름관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름 찾기");
            System.out.println("5. 전체 조회");
            System.out.println("q. 프로그램 종료");
            System.out.println("메뉴 선택 : ");

            String selectedMenu = scanner.nextLine();

            switch (selectedMenu) {
                case "1":
                    System.out.println("[이름 등록]");
                    String[] newNames = new String[names.length + 1]; // 기존의 네임에서 공간을 하나 추가한다. -> name의 길이(기존에 입력 되어있던 이름들)보다 1 많게
                    for(int i = 0; i < names.length; i++) {
                        newNames[i] = names[i]; //기존에 있던 name의 주소들을 가져와서 newName에 복사를 해줌
                    }
                    names = newNames; // newName을  names 에 대입함
                    System.out.print("등록할 이름 : ");
                    names[names.length - 1] = scanner.nextLine(); // name의 마지막 인덱스에 이름을 등록
                    System.out.println("등록 완료!");
                    break;
                case "2":
                    System.out.println("[이름 수정]");
                    System.out.println("수정 할 이름 : ");
                    String reName = scanner.nextLine();
                    for(int i = 0; i < names.length; i++) {
                        if(names[i].equals(reName)) {
                            System.out.println("무슨 이름으로 수정하시겠습니까?");
                            String newName = scanner.nextLine();
                            names[i] = newName;
                            System.out.println("수정 후 이름 : " + newName);
                            break;
                        }
                        System.out.println("해당 이름은 존재하지 않는 이름 입니다.");
                        break;
                    }
                    break;
                case "3":
                    System.out.println("[이름 삭제]");
                    System.out.println("삭제 할 이름 : ");
                    String delName = scanner.nextLine();
                    for(int i = 0; i < names.length; i++) {
                        if(names[i].equals(delName)) {
                            names[i] = null;
                            String[] delNames = new String[names.length - 1];
                            for(int j = 0; j < names.length; j++) {
                                delNames[j] = names[i];
                            }
                            names = delNames;
                            System.out.println("이름이 삭제되었습니다.");
                            break;
                        }
                        System.out.println("이름 입력이 잘못되었습니다.");
                        break;
                    }
                    break;
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.println("조회 할 이름 : ");
                    String result = null;
                    String findName = scanner.nextLine();
                    for(String name : names) {
                        if(name.equals(findName)) {
                            result = name;
                            break;
                        }
                    }
                    if(result == null) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }
                    System.out.println("해당 이름은 등록된 이름 입니다.");
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for(int i = 0; i < names.length; i++) {
                        System.out.println("index : [" + i + "]: " + names[i]);
                    }
                    break;
                case "q":
                    isRun = false;
                    break;
                default:
                    System.out.println("입력 오류. 다시 입력하세요.");
            }
            System.out.println("");
        }
    }
}
