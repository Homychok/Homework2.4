package homework;

public abstract class Transport<Driver> {
    protected String brand;
    protected String model;
    protected Double engineVolume;
    protected Integer roundTime;
    protected Integer pitStopTime;
    protected Integer maxVelocity;
   protected   Driver driver;

    public Transport(String brand, String model, Double engineVolume, Integer roundTime, Integer pitStopTime, Integer maxVelocity) {
        if (this.brand != null && !this.brand.isEmpty() && !this.brand.isBlank()) {
            this.brand = this.brand;
        }
        if (this.model != null && !this.model.isEmpty() && !this.model.isBlank()) {
            this.model = this.model;
        }
        setEngineVolume(this.engineVolume);
        setRoundTime(this.roundTime);
        setPitStopTime(this.pitStopTime);
        setMaxVelocity(this.maxVelocity);
    }
        public void startMoving() {
        System.out.println("Транспорт начинает движение!");
    }

    public void stopMoving() {
        System.out.println("Транспорт останавливается!");
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume != null && engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else if (engineVolume < 0){
            this.engineVolume = Math.abs(engineVolume);
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }
    public Integer getRoundTime() {
        return roundTime;
    }

    public Integer getPitStopTime() {
        return pitStopTime;
    }

    public Integer getMaxVelocity() {
        return maxVelocity;
    }

    public void setRoundTime(Integer roundTime) {
        if (roundTime != null && roundTime > 0) {
            this.roundTime = roundTime;
        } else if (roundTime <= 0){
            this.roundTime = Math.abs(roundTime);
        }
    }

    public void setPitStopTime(Integer pitStopTime) {
        if (pitStopTime != null && pitStopTime > 0) {
            this.pitStopTime = pitStopTime;
        } else if (pitStopTime <= 0){
            this.pitStopTime = Math.abs(pitStopTime);
        }
    }

    public void setMaxVelocity(Integer maxVelocity) {
        if (maxVelocity != null && maxVelocity > 0) {
            this.maxVelocity = maxVelocity;
        } else if (maxVelocity <= 0){
            this.maxVelocity = Math.abs(maxVelocity);
        }
    }
    public String toString(Driver driver) {
        return "Водитель " + driver +
                " на автомобиле " + brand + " " + model +
                " будет учавствовать в заезде";
    }
    @Override
    public String toString() {
        return "Транспортное средство " + brand + " " + model +
                ", с объемом двигателя " + engineVolume +
                ",  время круга составило " + roundTime +
                "с, время остановки на ремонт с начала гонки " + pitStopTime +
                "с, максимальна скорость " + maxVelocity +
                "м/c";
    }
}
