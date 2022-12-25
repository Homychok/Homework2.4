package homework.Transport;


import homework.Drivers.CategoryD;

public class Bus<Bus extends CategoryD> extends Transport<CategoryD> {
protected Bus driver;
    public Bus (String brand, String model, Double engineVolume, Integer roundTime, Integer pitStopTime, Integer maxVelocity) {
        super(brand, model, engineVolume, roundTime, pitStopTime, maxVelocity);
    }
    public void pitStop() {
            System.out.println("Автобус " + getBrand() + " " + getModel() + " совершил пит-стоп спустя " + getPitStopTime() + " с с момента старта.");
        }


      public void bestLapTime() {
            System.out.println("Лучшее время круга автобуса " + getBrand() + " " + getModel() + " составило " + getPitStopTime() + " с.");
        }
    public void maxSpeed() {
            System.out.println("Максимальная скорость, развитая автобусом " + getBrand() + " " + getModel() + " за время круга составила " + getPitStopTime() + " м/с.");
        }

//    public void setDriver(CategoryD driver) {
//        this.driver = driver;
//    }

    public Bus getDriver() {
        return driver;

    }

    public void setDriver(Bus driver) {
        this.driver = driver;
    }
}
