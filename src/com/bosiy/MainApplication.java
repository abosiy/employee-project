package com.bosiy;

public class MainApplication {
    public static void main(String[] args) {

        Employee maxim = new Employee("Maxim", 5000,"CEO");
        Employee vlad = new Employee("Vlad", 5000, "Web-designer");
        Employee andrey = new Employee("Andrey", 0, "Trainee");

        System.out.println(maxim.getName() + "; " + maxim.getSalary() + "; "
                + maxim.getPosition() + "; ");
        System.out.println(vlad.getName() + "; " + vlad.getSalary() + "; "
                + vlad.getPosition() + "; ");
        System.out.println(andrey.getName() + "; " + andrey.getSalary() + "; "
                + andrey.getPosition() + "; ");
    }
}
