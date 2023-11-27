package org.exercism.helloworld.lasagna;

public class LasagnaMain {

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        lasagna.expectedMinutesInOven();
        lasagna.remainingMinutesInOven(30);
        lasagna.preparationTimeInMinutes(2);
        lasagna.totalTimeInMinutes(3, 20);

    }
}
