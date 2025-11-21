public class CarAbstract extends VehicleAbstract {
    boolean isElectric;

    // constructor
    public CarAbstract(String model, int year, double price, boolean isElectric) {
        super(model, year, price);
        this.isElectric = isElectric;
    }

    // overriding the abstract method
    @Override // called annotation
    public void getMaxSpeed() {
        System.out.println("The maximum speed of the car is 250 km/h");
    }
}
