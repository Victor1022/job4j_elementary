package ru.job4j;

public class ArgMethod {


    public static void hello(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        String name = "Viktor";
        ArgMethod.hello(name);


    }
}