public class Main {

    public static void main(String[] args) {
        //Car testCar = new DieselCar(72727, "Mercedes", "BaguetteCrossaint", 1997, 2, true, 15);
        //    System.out.println(testCar.calculateGreenVehicleTax());


        Garage garage = new Garage();
        Car petrolRider = new PetrolCar(683675, "Dragerne", "Dragekrigeren", 2050, 1, 95, 10);
        Car dieselDragon = new DieselCar(899154, "Dragerne", "Dragerens mester", 2052, 2, false, 20);
        Car electricEnergy = new ElectricCar(683624, "Dragerne", "Dragens flammer", 2049, 1, 100000, 10000, 3000);
        garage.addCar(petrolRider);
        garage.addCar(dieselDragon);
        garage.addCar(electricEnergy);
        for (Car c : garage.carGarage) {
            System.out.println(c.toString());
        }
        System.out.println("This is the total cost of the garage " + garage.calculateTotalGreenTax());
    }
}
