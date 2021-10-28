public class DieselCar extends Car {
    private boolean hasParticleFilter;
    private int kmPrL;

    public boolean isHasParticleFilter() {
        return hasParticleFilter;
    }

    public void setHasParticleFilter(boolean hasParticleFilter) {
        this.hasParticleFilter = hasParticleFilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    public DieselCar(int regNumber, String brand, String model, int year, int amountOfDoors, boolean hasParticleFilter, int kmPrL) {
        super(regNumber, brand, model, year, amountOfDoors);
        this.hasParticleFilter = hasParticleFilter;
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        String particleAnswer;
        if (this.hasParticleFilter) {
             return "This diesel car has a particle filter, and it drives " + kmPrL + " kilometer per liter.";
        } else {
            return "This diesel car doesn't have a particle filter, and it drive " + kmPrL + " kilometers per liter.";
        }
    }

    @Override
    protected double calculateGreenVehicleTax() {
        int dieselVehicleCharge;
        int compensatoryTax;
        int particleFilterTax;
        int dieselVehicleCost;
        if(hasParticleFilter == false) {
            particleFilterTax = 1000;
        } else {
            particleFilterTax = 0;
        }


        if(kmPrL < 5){
            dieselVehicleCharge = 10470;
        } else if (kmPrL >= 5 && kmPrL < 10){
            dieselVehicleCharge = 5500;
        } else if (kmPrL >= 10 && kmPrL < 15){
            dieselVehicleCharge = 2340;
        } else if (kmPrL >= 15 && kmPrL < 20){
            dieselVehicleCharge = 1050;
        } else if (kmPrL >= 20 && kmPrL < 50){
            dieselVehicleCharge = 330;
        } else {
            dieselVehicleCharge = 0;
        }

        if(kmPrL < 5){
            compensatoryTax = 15260;
        } else if (kmPrL >= 5 && kmPrL < 10){
            compensatoryTax = 2770;
        } else if (kmPrL >= 10 && kmPrL < 15){
            compensatoryTax = 1850;
        } else if (kmPrL >= 15 && kmPrL < 20){
            compensatoryTax = 1390;
        } else if (kmPrL >= 20 && kmPrL < 50){
            compensatoryTax = 130;
        } else {
            compensatoryTax = 0;
        }



        dieselVehicleCost = dieselVehicleCharge + compensatoryTax + particleFilterTax;
        return dieselVehicleCost;
    }
}
