package homework;

import static homework.Main.bus;

public class Bus extends Transport<Category_D> implements Competing {

    public Bus(String brand, String model, Double engineVolume, Integer roundTime, Integer pitStopTime, Integer maxVelocity) {
        super(brand, model, engineVolume, roundTime, pitStopTime, maxVelocity);
    }

    @Override
    public void pitStop() {
        for (Bus bus : bus) {
            System.out.println("Автобус " + getBrand() + " " + getModel() + " совершил пит-стоп спустя " + getPitStopTime() + " с с момента старта.");
        }
    }

    @Override
    public void bestLapTime() {
        for (Bus bus : bus) {
            System.out.println("Лучшее время круга автобуса " + getBrand() + " " + getModel() + " составило " + getPitStopTime() + " с.");
        }
    }

    @Override
    public void maxSpeed() {
        for (Bus bus : bus) {
            System.out.println("Максимальная скорость, развитая автобусом " + getBrand() + " " + getModel() + " за время круга составила " + getPitStopTime() + " м/с.");
        }
    }
}
