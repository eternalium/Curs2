package oop;

public class Car {
    float fuel;
    float fuelConsumption;
    boolean started;
    static int wheels = 4;

    public void start() {
        started = true;
    }
    public void drive(int distance) {
        fuel -= fuelConsumption * distance / 100;
        if (fuel < 0) {
            fuel = 0;
        }
    }

    public float range() {
        return fuel / fuelConsumption * 100;

    }
}
