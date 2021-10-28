public class ElectricCar extends Car{
    private int batteryCapacityKWh;
    private int maxKm;
    private int whPrKm;

    public int getBatteryCapacityKWh() {
        return batteryCapacityKWh;
    }

    public void setBatteryCapacityKWh(int batteryCapacityKWh) {
        this.batteryCapacityKWh = batteryCapacityKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    public ElectricCar(int regNumber, String brand, String model, int year, int amountOfDoors, int batteryCapacityKWh, int maxKm, int whPrKm) {
        super(regNumber, brand, model, year, amountOfDoors);
        this.batteryCapacityKWh = batteryCapacityKWh;
        this.maxKm = maxKm;
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "This electric car has a battery capacity of " + batteryCapacityKWh + ", it can drive a maximum of " + maxKm + " kilometers and has a whPrKm of " + whPrKm + ".";
    }

    @Override
    protected double calculateGreenVehicleTax() {
        double electricGreenVehicleCharge;
        double kmPrL;
        kmPrL = 100 / (this.whPrKm/91.25);

        if(kmPrL < 5){
            electricGreenVehicleCharge = 10470;
        } else if (kmPrL >= 5 && kmPrL < 10){
            electricGreenVehicleCharge = 5500;
        } else if (kmPrL >= 10 && kmPrL < 15){
            electricGreenVehicleCharge = 2340;
        } else if (kmPrL >= 15 && kmPrL < 20){
            electricGreenVehicleCharge = 1050;
        } else if (kmPrL >= 20 && kmPrL < 50){
            electricGreenVehicleCharge = 330;
        } else {
            electricGreenVehicleCharge = 0;
        }
        return electricGreenVehicleCharge;
    }

}
