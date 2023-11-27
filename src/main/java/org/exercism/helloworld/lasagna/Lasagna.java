package org.exercism.helloworld.lasagna;

public class Lasagna {
    public int expectedMinutesInOven() {
        int minutes = 40;
        return minutes;
    }

    public int remainingMinutesInOven(int minutes) {
        int remainingMins = expectedMinutesInOven() - minutes;
        return remainingMins;
    }

    public int preparationTimeInMinutes(int minutes) {
        int preparationTime = 2;
        int totalMinutes = preparationTime * minutes;
        return totalMinutes;
    }

    public int totalTimeInMinutes(int layers, int numMinutes) {
        int layersCalculation = preparationTimeInMinutes(layers);
        int totalTime = layersCalculation + numMinutes;
        return totalTime;
    }

}