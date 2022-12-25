package homework.Transport;

import homework.Drivers.CategoryB;
import homework.Drivers.Driver;

public class Cars extends Transport<CategoryB> {
    public Cars(String brand, String model, Double engineVolume, Integer roundTime, Integer pitStopTime, Integer maxVelocity) {
        super(brand, model, engineVolume, roundTime, pitStopTime, maxVelocity);
    }
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " совершил пит-стоп спустя " + getPitStopTime() + " с с момента старта.");
    }

    public void bestLapTime() {
        System.out.println("Лучшее время круга автомобиль " + getBrand() + " " + getModel() + " составило " + getPitStopTime() + " с.");
    }

    public void maxSpeed() {
        System.out.println("Максимальная скорость, развитая автомобилем " + getBrand() + " " + getModel() + " за время круга составила " + getPitStopTime() + " м/с.");
    }

    @Override
    public String toString() {
        return "Cars{" +
                "driver=" + driver +
                '}';
    }

    public void setDriver(CategoryB driver) {
        this.driver = driver;
    }

    public CategoryB getDriver() {
        return driver;
    }

    }
