package oop;

public class CarTest {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.fuel = 60;
        bmw.fuelConsumption = 8;
        bmw.started = false;

        Car dacia = new Car();

        bmw.start();
        bmw.drive(180);
        bmw.drive(600);


        System.out.println(bmw.fuel);
        System.out.println(bmw.range());

        bmw.wheels = 3;
        System.out.println(bmw.wheels);
        System.out.println(dacia.wheels);

    }
}
