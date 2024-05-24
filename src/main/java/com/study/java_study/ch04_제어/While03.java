package com.study.java_study.ch04_제어;

import java.util.Scanner;

public class While03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;

        String name = null;      //next()
        int age = 0;             //nextInt()
        String address = null;   //nextLine()
        String gender = null;   //next()
        String phone = null;    //nextLine()

        System.out.println("프로그램 시작");

        while(isRun) { //메인메뉴 시작
            System.out.println("[메인 메뉴]");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 조회");
            System.out.println("3. 회원 탈퇴");
            System.out.println("4. 회원 정보 수정");
            System.out.println("q. 프로그램 종료");
            //메인메뉴 종료
            System.out.print("메뉴 선택 : ");
            String selectedMenu = scanner.nextLine();
            switch (selectedMenu) {
                case "1":
                    System.out.println("회원 등록으로 들어오셨습니다.");
                    boolean isRunMenu1 = true;
                    while(isRunMenu1) {
                        System.out.println("[회원 등록]");
                        System.out.println("1. 회원 정보 입력");
                        System.out.println("b. 뒤로가기");
                        System.out.println("q. 프로그램 종료");
                        System.out.println("메뉴선택 : ");
                        selectedMenu = scanner.nextLine();
                        switch(selectedMenu) {
                            case "1":
                                System.out.println("회원 정보를 등록하세요.");
                                System.out.println("회원 이름을 입력하세요.");
                                name = scanner.next();
                                scanner.nextLine();
                                System.out.println("회원 나이를 입력하세요.");
                                age = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("회원 주소를 입력하세요.");
                                address = scanner.next();
                                scanner.nextLine();
                                System.out.println("회원 연락처를 입력하세요.");
                                phone = scanner.next();
                                scanner.nextLine();

                                break;
                            case "b":
                                System.out.println("메인 메뉴로 돌아갑니다.");
                                isRunMenu1 = false;
                                break;
                            case "q":
                                isRun = false;
                                isRunMenu1 = false;
                                break;
                            default:
                                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                        }
                        System.out.println();
                    }
                    break;
                case "2":
                    System.out.println("회원 조회로 들어오셨습니다.");
                    boolean isRunMenu2 = true;
                    while(isRunMenu2) {
                        System.out.println("[회원 조회]");
                        System.out.println("1. 회원 번호로 조회");
                        System.out.println("2. 회원 이름으로 조회");
                        System.out.println("b. 뒤로가기");
                        System.out.println("q. 프로그램 종료");
                        System.out.println("메뉴선택 : ");
                        selectedMenu = scanner.nextLine();
                        switch(selectedMenu) {
                            case "1":
                                System.out.println("회원 번호로 조회를 합니다.");
                                break;
                            case "2":
                                System.out.println("회원 이름으로 조회를 합니다.");
                                break;
                            case "b":
                                System.out.println("메인 메뉴로 돌아갑니다.");
                                isRunMenu2 = false;
                                break;
                            case "q":
                                isRun = false;
                                isRunMenu2 = false;
                                break;
                            default:
                                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                        }
                        System.out.println();
                    }
                    break;
                case "3":
                    System.out.println("회원 탈퇴로 들어오셨습니다.");
                    boolean isRumMenu3 = true;
                    while(isRumMenu3) {
                        System.out.println("[회원 탈퇴]");
                        System.out.println("1. 회원 탈퇴");
                        System.out.println("b. 뒤로가기");
                        System.out.println("q. 프로그램 종료");
                        System.out.println("메뉴선택 : ");

                        selectedMenu = scanner.nextLine();
                        switch(selectedMenu) {
                            case "1":
                                System.out.println("회원 탈퇴를 누르셨습니다.");
                                System.out.println("회원 탈퇴가 진행됩니다.");
                                isRumMenu3 = false;
                                isRun = false;
                                break;
                            case "b":
                                System.out.println("메인 메뉴로 돌아갑니다.");
                                isRumMenu3 = false;
                                break;
                            case "q":
                                isRun = false;
                                isRumMenu3 = false;
                                break;
                            default:
                                System.out.println("잘못된 입력입니다. 다시 입력하세요.");

                        }
                        System.out.println();
                    }
                    break;
                case "4":
                    System.out.println("회원 정보 수정으로 들어오셨습니다.");
                    boolean isRunMenu4 = true;
                    while(isRunMenu4) {
                        System.out.println("[회원 정보 수정]");
                        System.out.println("1. 회원 이름 수정");
                        System.out.println("2. 회원 나이 수정");
                        System.out.println("3. 회원 주소 수정");
                        System.out.println("4. 회원 연락처 수정");
                        System.out.println("b. 뒤로가기");
                        System.out.println("q. 프로그램 종료");
                        System.out.println("메뉴선택 : ");
                        selectedMenu = scanner.nextLine();
                        switch(selectedMenu) {
                            case "1":
                                System.out.println("회원 이름 수정으로 들어오셨습니다.");
                                break;
                            case "2":
                                System.out.println("회원 나이 수정으로 들어오셨습니다.");
                                break;
                            case "3":
                                System.out.println("회원 주소 수정으로 들어오셨습니다.");
                                break;
                            case "4":
                                System.out.println("회원 연락처 수정으로 들어오셨습니다.");
                                break;
                            case "b":
                                System.out.println("메인 메뉴로 돌아갑니다.");
                                isRunMenu4 = false;
                                break;
                            case "q":
                                isRunMenu4 = false;
                                isRun = false;
                                break;
                            default:
                                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                        }
                        System.out.println();
                    }
                    break;
                case "q":
                    System.out.println("프로그램을 종료합니다.");
                    isRun = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
            System.out.println();
        }

        System.out.println("프로그램 종료");
    }
}
