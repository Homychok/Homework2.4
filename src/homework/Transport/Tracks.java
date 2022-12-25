package homework.Transport;

import homework.Competing;
import homework.Drivers.CategoryC;

public class Tracks extends Transport<CategoryC>  {
    public Tracks(String brand, String model, Double engineVolume, Integer roundTime, Integer pitStopTime, Integer maxVelocity) {
        super(brand, model, engineVolume, roundTime, pitStopTime, maxVelocity);
    }
    @Override
    public void pitStop() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " совершил пит-стоп спустя " + getPitStopTime() + " с с момента старта.");
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга грузовика " + getBrand() + " " + getModel() + " составило " + getPitStopTime() + " с.");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость, развитая грузовиком " + getBrand() + " " + getModel() + " за время круга составила " + getPitStopTime() + " м/с.");
    }

    public void setDriver(CategoryC driver) {
        this.driver = driver;
    }

    public CategoryC getDriver() {
        return driver;
        }
    public void setmaxSpeed(CategoryC driver) {
        this.driver = driver;
    }

    public CategoryC getmaxSpeed() {
        return driver;
    }
}
