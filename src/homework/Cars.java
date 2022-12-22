package homework;

public class Cars extends Transport implements Competing{
    public Cars(String brand, String model, Double engineVolume, Integer roundTime, Integer pitStopTime, Integer maxVelocity) {
        super(brand, model, engineVolume, roundTime, pitStopTime, maxVelocity);
    }

    @Override
    public String pitStop() {
            return "Автомобиль " + getBrand() + getModel() + " совершил пит-стоп спустя " + getPitStopTime() + " с с момента старта.";
        }

    @Override
    public String bestLapTime() {
        return "Лучшее время круга автомобиля " + getBrand() + getModel() + " составило " + getPitStopTime() + " с.";
    }

    @Override
    public String maxSpeed() {
        return "Максимальная скорость, развитая автомобилем " + getBrand() + getModel() + " за время круга составила " + getPitStopTime() + " м/с.";
    }
}
