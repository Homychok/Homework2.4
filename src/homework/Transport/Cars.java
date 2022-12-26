package homework.Transport;

import homework.Drivers.CategoryB;
import homework.Drivers.Driver;

public class Cars extends Transport<CategoryB> {
    protected CategoryB driver;
    public Cars(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }
//    public void pitStop() {
////        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " совершил пит-стоп спустя " + pitStopTime() + " с с момента старта.");
//    }
//
//    public void bestLapTime() {
//        System.out.println("Лучшее время круга автомобиль " + getBrand() + " " + getModel() + " составило " + pitStopTime() + " с.");
//    }
//
//    public void maxSpeed() {
//        System.out.println("Максимальная скорость, развитая автомобилем " + getBrand() + " " + getModel() + " за время круга составила " + pitStopTime() + " м/с.");
//    }

    @Override
    public String toString() {
        return "Автомобиль" +
                "марка" + brand + '\'' +
                ", модель" + model + '\'' +
                ", объем двигателя" + engineVolume +
                ", водитель" + driver;
    }
    public void printInfo() {
        System.out.println("Водитель " + driver + " управляет автомобилем " + brand + " " + model + " будет участвовать в заезде!");
//        System.out.println("Водитель " + driver.getFullName() + " управляет автомобилем " + brand + " " + model + " будет участвовать в заезде!");

    }
    public void setDriver(CategoryB driver) {
        this.driver = driver;
    }

    public CategoryB getDriver() {
        return driver;
    }

    }
