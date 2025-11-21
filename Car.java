public class Car implements Vehicle {
    String model;
    int year;
    double price;
    boolean isElectric;

    // constructor
    public Car(String model, int year, double price, boolean isElectric) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.isElectric = isElectric;
    }

    // implementing the methods from the interface
    @Override
    public void start() {
        System.out.println("Car is starting");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping");
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("The maximum speed of the car is 250 km/h");
    }
}
