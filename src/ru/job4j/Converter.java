package ru.job4j;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main (String[]args) {
            int euro = rubleToEuro(170);
            int dollar = rubleToDollar(180);

            System.out.println("180 rubles are " + dollar + " dollar.");
            System.out.println("140 rubles are " + euro + " euro.");

        }






}
