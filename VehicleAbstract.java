public abstract class VehicleAbstract {
    String model;
    int year;
    double price;

    // constructor
    public VehicleAbstract(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // concrete methods
    public void start() {
        System.out.println("Vehicle is starting");
    }
    public void stop() {
        System.out.println("Vehicle is stopping");
    }

    // abstract method
    public abstract void getMaxSpeed();
}
