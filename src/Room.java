public class Room {
    double measurement;
    double currentTemp;
    double minTemp;
    boolean airCondition;

    public Room(double measurement, double currentTemp, boolean airCondition, double minTemp) {
        this.measurement = measurement;
        this.currentTemp = currentTemp;
        this.minTemp = minTemp;
        this.airCondition = airCondition;
    }

    public double getMeasurement() {
        return measurement;
    }

    public double getCurrentTemp() {
        return currentTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public boolean isAirCondition() {
        return airCondition;
    }

    public boolean canSetLowerTemperature(){
        return this.airCondition && (this.currentTemp > this.minTemp);
    }

    public boolean setUpLowerTheTemperature() {
        if(this.canSetLowerTemperature()) {
            this.currentTemp = this.currentTemp - 1;
            return true;
        } else {
            return false;
        }
    }
}
