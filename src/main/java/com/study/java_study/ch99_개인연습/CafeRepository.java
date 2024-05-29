package com.study.java_study.ch99_개인연습;

import java.util.Scanner;

public class CafeRepository {
    Scanner scanner = new Scanner(System.in);

    private CafeEntity[] cafe;

    public CafeRepository() {
        cafe = new CafeEntity[0];
    }

    private void extendCafeMenu() {
        CafeEntity[] newMenu = new CafeEntity[cafe.length + 1];
        for(int i = 0; i < cafe.length; i++) {
            newMenu[i] = cafe[i];
        }
        cafe = newMenu;
    }

    private int getLastIndex() {
        return cafe.length -1;
    }
    public void cafeMenuSave(CafeEntity menu) {
        extendCafeMenu();
        cafe[getLastIndex()] = menu;
    }

    public CafeEntity findCafeMEnuByName(String name) {
        CafeEntity findMenu = null;
        for (CafeEntity menu : cafe) { // menu = 배열 안에 있는 메뉴(임의로 설정함)
            if (menu.getName().equals(name)) {
                findMenu = menu;
                break;
            }
        }
        return findMenu;
    }

    public CafeEntity findCafeMenuByBase(String base) {
        CafeEntity findMenu = null;
        for (CafeEntity menu : cafe) {
            if (menu.getBase().equals(base)) {
                findMenu = menu;
                break;
            }
        }
        return  findMenu;
    }

    private int getNewArraySize(int newCase, String text) {
        int newArraySize = 0;

        switch(newCase) {
            case 1:
                for(CafeEntity menu : cafe) {
                    if (menu.getName().contains(text)
                         || menu.getBase().contains(text));
                    newArraySize++;
                }
                break;
            case 2:
                for(CafeEntity menu : cafe) {
                    if (menu.getBase().contains(text)) {
                        newArraySize++;
                    }
                }
                break;
            case 3:
                for(CafeEntity menu : cafe) {
                    if (menu.getName().contains(text)) {
                        newArraySize++;
                    }
                }
        }
        return newArraySize;
    }

//    public CafeEntity[] searchCafeMenu(int menuCase, String searchText) {
//
//    }

}
