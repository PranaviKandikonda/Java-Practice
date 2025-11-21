public class MainTest {
    public static void main(String[] args) {
        CarAbstract car = new CarAbstract("Tesla Model S", 2022, 79999.99, true);
        car.start();
        car.stop();
        car.getMaxSpeed();  
    }
}
