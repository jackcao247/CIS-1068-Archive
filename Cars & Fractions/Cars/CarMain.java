public class CarMain {
    public static void main(String[] args) {
        Car[] cars = {
            new Car("Ford", "Pinto", 1972, 17.5, 132480, 12, 8),
            new Car("Lamborghini", "Aventador SVJ", 2018, 13.5, 20000, 22.5, 15),
        };

        for (Car car : cars) {
            car.drive(50);
            car.fillTank(5);
            System.out.println(car);
            System.out.println("");
        }
    }
}
