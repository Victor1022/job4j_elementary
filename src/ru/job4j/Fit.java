/** Fit.
 *
 */
package ru.job4j;

public class Fit {

    public static double manWeight(short height) {
        return  (height - 100) * 1.15;

    }

    public static double womanWeight(short height1) {

        return  (height1 - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 176;
        short height1 = 165;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height1);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 165 is" + woman);
    }

}
