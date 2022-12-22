package homework;

public class Transport {
    private String brand;
    private String model;
    private Double engineVolume;
    private Integer roundTime;
    private Integer pitStopTime;
    private Integer maxVelocity;

    public Transport(String brand, String model, Double engineVolume, Integer roundTime, Integer pitStopTime, Integer maxVelocity) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model;
        }
            setEngineVolume(engineVolume);
        setRoundTime(roundTime);
        setPitStopTime(pitStopTime);
        setMaxVelocity(maxVelocity);
    }



    public void startMoving() {
        System.out.println("Транспорт начинает движение!");
    }

    public void stopMoving() {
        System.out.println("Транспорт останавливается!");
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume != null && engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else if (engineVolume <= 0){
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
        }    }
}
