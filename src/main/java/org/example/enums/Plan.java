package org.example.enums;

public enum Plan {
    BASIC("Mourinho", 10);
    private String name;
    private int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}