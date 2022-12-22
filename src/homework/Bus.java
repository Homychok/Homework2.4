package homework;

public class Bus extends Transport implements Competing{

    public Bus(String brand, String model, Double engineVolume, Integer roundTime, Integer pitStopTime, Integer maxVelocity) {
        super(brand, model, engineVolume, roundTime, pitStopTime, maxVelocity);
    }

    @Override
    public String pitStop() {
        return "Автобус " + getBrand() + getModel() + " совершил пит-стоп спустя " + getPitStopTime() + " с с момента старта.";
    }

    @Override
    public String bestLapTime() {
        return "Лучшее время круга автобуса " + getBrand() + getModel() + " составило " + getPitStopTime() + " с.";
    }

    @Override
    public String maxSpeed() {
        return "Максимальная скорость, развитая автобусом " + getBrand() + getModel() + " за время круга составила " + getPitStopTime() + " м/с.";
    }
}
