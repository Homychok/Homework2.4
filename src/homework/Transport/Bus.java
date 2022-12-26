package homework.Transport;


import homework.Drivers.CategoryD;

public class Bus extends Transport<CategoryD> {
 protected CategoryD driver;
    public Bus (String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }
//    public void pitStop() {
//            System.out.println("Автобус " + getBrand() + " " + getModel() + " совершил пит-стоп спустя " + pitStopTime() + " с с момента старта.");
//        }
//
//
//      public void bestLapTime() {
//            System.out.println("Лучшее время круга автобуса " + getBrand() + " " + getModel() + " составило " + pitStopTime() + " с.");
//        }
//    public void maxSpeed() {
//            System.out.println("Максимальная скорость, развитая автобусом " + getBrand() + " " + getModel() + " за время круга составила " + getPitStopTime() + " м/с.");
//        }

//    public void setDriver(CategoryD driver) {
//        this.driver = driver;
//    }

    public CategoryD getDriver() {
        return driver;

    }

    public void setDriver(CategoryD driver) {
        this.driver = driver;
    }
    public void printInfo() {
        System.out.println("Водитель " + driver + " управляет автомобилем " + brand + " " + model + " будет участвовать в заезде!");
    }
    @Override
    public String toString() {
        return "Автобус" +
                "марка " + brand + '\'' +
                ", модель " + model + '\'' +
                ", объем двигателя " + engineVolume +
                ", водитель " + driver;
    }
}
