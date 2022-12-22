package homework;

public class Tracks extends Transport implements Competing{
    public Tracks(String brand, String model, Double engineVolume, Integer roundTime, Integer pitStopTime, Integer maxVelocity) {
        super(brand, model, engineVolume, roundTime, pitStopTime, maxVelocity);
    }

    @Override
    public String pitStop() {
        return "Грузовик " + getBrand() + getModel() + " совершил пит-стоп спустя " + getPitStopTime() + " с с момента старта.";
    }

    @Override
    public String bestLapTime() {
        return "Лучшее время круга грузовика " + getBrand() + getModel() + " составило " + getPitStopTime() + " с.";
    }

    @Override
    public String maxSpeed() {
        return "Максимальная скорость, развитая грузовиком " + getBrand() + getModel() + " за время круга составила " + getPitStopTime() + " м/с.";
    }
}
