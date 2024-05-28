package com.study.java_study.ch99_개인연습;

public class CafeEntity {

    private String name;
    private int price;
    private String base;

    public CafeEntity() {
    }

    public CafeEntity(String name, int price, String base) {
        this.name = name;
        this.price = price;
        this.base = base;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "CafeEntity{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", base='" + base + '\'' +
                '}';
    }
}
