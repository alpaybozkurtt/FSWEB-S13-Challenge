package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        String[] dev = {"X", "Batu", "Z"};
        Company company = new Company(3545, "Batu", 3.14, dev);
        System.out.println(company.toString());

        Healthplan healthplan = new Healthplan(2563,"X", Plan.BASIC);
        System.out.println(healthplan.toString());

        String[] health = {"Yaşa", "Sürün", "Öl"};
        Employee employee = new Employee(8456, "Alpay Bozkurt", "av.alpaybozkurt@gmail.com", "randompass",health);
        System.out.println(employee.toString());
    }
}