package homework.Transport;

import homework.Competing;
import homework.Drivers.CategoryC;

public class Tracks extends Transport<CategoryC>  {
    protected CategoryC driver;
    public Tracks(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }
//    @Override
//    public void pitStop() {
//        System.out.println("Грузовик " + getBrand() + " " + getModel() + " совершил пит-стоп спустя " + getPitStopTime() + " с с момента старта.");
//    }
//
//    @Override
//    public void bestLapTime() {
//        System.out.println("Лучшее время круга грузовика " + getBrand() + " " + getModel() + " составило " + getPitStopTime() + " с.");
//    }
//
//    @Override
//    public void maxSpeed() {
//        System.out.println("Максимальная скорость, развитая грузовиком " + getBrand() + " " + getModel() + " за время круга составила " + getPitStopTime() + " м/с.");
//    }

    public void setDriver(CategoryC driver) {
        this.driver = driver;
    }

    public CategoryC getDriver() {
        return driver;
        }
    public void setmaxVelocity(CategoryC driver) {
        this.driver = driver;
    }

    public CategoryC getmaxVelocity() {
        return driver;
    }
    public void printInfo() {
        System.out.println("Водитель " + driver + " управляет автомобилем " + brand + " " + model + " будет участвовать в заезде!");
    }
    @Override
    public String toString() {
        return "Грузовик" +
                "марка" + brand + '\'' +
                ", модель" + model + '\'' +
                ", объем двигателя" + engineVolume +
                ", водитель" + driver;
    }
}
