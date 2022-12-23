package homework;

public class Cars extends Transport<Category_B> implements Competing{
    public Cars(String brand, String model, Double engineVolume, Integer roundTime, Integer pitStopTime, Integer maxVelocity) {
        super(brand, model, engineVolume, roundTime, pitStopTime, maxVelocity);
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " совершил пит-стоп спустя " + getPitStopTime() + " с с момента старта.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга автомобиль " + getBrand() + " " + getModel() + " составило " + getPitStopTime() + " с.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость, развитая автомобилем " + getBrand() + " " + getModel() + " за время круга составила " + getPitStopTime() + " м/с.");
    }
}
