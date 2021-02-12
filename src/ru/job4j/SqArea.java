package ru.job4j;

public class SqArea {

    public static double square(int p, int k) {
        int h = p / (2*(k+1));
        int L = h*k;
        return  L*h;


    }

    public static void main(String[] args) {
        double rsl = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + rsl);
    }
}
