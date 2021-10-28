public class PetrolCar extends Car{
    private int octaneNumber;
    private int kmPrL;

    public int getOctaneNumber() {
        return octaneNumber;
    }

    public void setOctaneNumber(int octaneNumber) {
        this.octaneNumber = octaneNumber;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public PetrolCar(int regNumber, String brand, String model, int year, int amountOfDoors, int octaneNumber, int kmPrL) {
        super(regNumber, brand, model, year, amountOfDoors);
        this.octaneNumber = octaneNumber;
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "This petrol cars octane number is " + octaneNumber + ". It can drive " + kmPrL + "kilometers per hour.";
    }


    @Override
    protected double calculateGreenVehicleTax() {
        int greenVehicleCharge;
        if(kmPrL < 5){
            greenVehicleCharge = 10470;
        } else if (kmPrL >= 5 && kmPrL < 10){
            greenVehicleCharge = 5500;
        } else if (kmPrL >= 10 && kmPrL < 15){
            greenVehicleCharge = 2340;
        } else if (kmPrL >= 15 && kmPrL < 20){
            greenVehicleCharge = 1050;
        } else if (kmPrL >= 20 && kmPrL < 50){
            greenVehicleCharge = 330;
        } else {
            greenVehicleCharge = 0;
        }
        return greenVehicleCharge;
    }
}
