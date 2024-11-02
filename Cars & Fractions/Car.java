public class Car {
    private String make;
    private String model;
    private int year;
    private double MPG;
    private double milesDriven;
    private double fuelCapacity;
    private double fuelRemaining;

    public Car(String make, String model, int year, double MPG, double milesDriven, double fuelCapacity, double fuelRemaining) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.MPG = MPG;
        this.milesDriven = milesDriven;
        this.fuelCapacity = fuelCapacity;
        this.fuelRemaining = fuelRemaining;
    }

    public void fillTank(double g) {
        fuelRemaining += g;
        if (fuelRemaining > fuelCapacity) {
            fuelRemaining = fuelCapacity;
        }
    }

    public void drive(double m) { 
    	fuelRemaining = fuelRemaining - (m / MPG); 
    	milesDriven += m; 
    }
    
    public double getFuelRemaining() {
        return fuelRemaining;
    }

    public String toString() {
        return "Brand: " + make +
               "\nModel: " + model +
               "\nYear: " + year +
               "\nMiles Per Gallon (MPG): " + MPG +
               "\nMiles Driven: " + milesDriven +
               "\nFuel Capacity: " + fuelCapacity +
               "\nFuel Remaining: " + fuelRemaining;
    }
}
