Implement a class Car, which contains the fields (5 points):

- make, e.g. Ford, Subaru, Toyota ...
- model, e.g., Escape, Outback, Camry ...
- year
- MPG miles per gallon
- milesDriven, the total number of miles ever driven in this car.
- fuelCapacity in gallons, i.e., the size in gallons of the fuel tank.
- fuelRemaining, which represents the amount of fuel remaining in the gas tank.

Implement at least the following methods within the Car class (5 points each):

- a constructor, which initializes each of the fields
- fillTank(double g), which adds up to g gallons of gas to the fuel tank, but not more than the car's fuel capacity.
- drive(double m), which simulates driving m miles in the car, adding to the total number of miles driven, and reducing the amount of gas in the car according to this car's average MPG.
- toString( ), which returns a String representation of the car.
- getFuelRemaining( ), which returns the amount of fuel left in the tank.

For example, we should be able to do something like the following:

    Car oldJunker = new Car("Ford", "Pinto", 1972, 17.5, 132480, 12, 8); // creates a new Car object
    oldJunker.drive(5); // drives the Car 5 miles
    oldJunker.fillTank(1); // put in a gallon of gas
    System.out.println(oldJunker.getFuelRemaining()); // prints the amount of fuel left
    System.out.println(oldJunker); // prints the attributes of the car to the screen

Write a short driver program to test your Car class with a short array of Cars (5 points).
