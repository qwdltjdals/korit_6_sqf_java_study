package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService풀이 {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
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

            String[] newNames = null; // switch case 문에서 공통되는 변수가 있을 경우에는 밖으로 밴 후, 선언만 함
            int findIndex = -1;

            switch (selectedMenu) {
                case "1":
                    System.out.println("[이름 등록]");
                    newNames = new String[names.length + 1]; // 기존의 네임에서 공간을 하나 추가한다. -> name의 길이(기존에 입력 되어있던 이름들)보다 1 많게
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
                    String modifyName = scanner.nextLine();
                    findIndex = arrayUtils.findIndexByName(names, modifyName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    System.out.print("새 이름 : ");
                    names[findIndex] = scanner.nextLine();
                    System.out.println("수정 완료!");
                    break;
                case "3":
                    System.out.println("[이름 삭제]");
                    System.out.println("삭제 할 이름 : ");
                    String removeName = scanner.nextLine();
                    findIndex = arrayUtils.findIndexByName(names, removeName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;
                    }
                    newNames = new String[names.length - 1]; // 밖으로 뺀거 선언한거
                    for(int i = 0; i < newNames.length; i++) {
                        if(i < findIndex) {
                            newNames[i] = names[i]; // findIndex의 값보다 작으면 그대로 옮기고
                            continue;
                        }
                        newNames[i] = names[i + 1]; // 그렇지 않다(같거나 크다)면 기존의 i인덱스에 + 1 을 해서 대입
                }
                    names = newNames;
                    System.out.println(removeName + " 을(를) 삭제하였습니다.");
                    break;
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.println("조회 할 이름 : ");
                    String findName = scanner.nextLine();
                    findIndex = arrayUtils.findIndexByName(names, findName);
                    if(findIndex == -1) {
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
