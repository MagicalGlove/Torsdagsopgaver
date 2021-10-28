public abstract class Car {

    private int regNumber;
    private String brand;
    private String model;
    private int year;
    private int amountOfDoors;


    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmountOfDoors() {
        return amountOfDoors;
    }

    public void setAmountOfDoors(int amountOfDoors) {
        this.amountOfDoors = amountOfDoors;
    }


    public Car(int regNumber, String brand, String model, int year, int amountOfDoors) {
        this.regNumber = regNumber;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.amountOfDoors = amountOfDoors;
    }

    abstract protected double calculateGreenVehicleTax();

}
