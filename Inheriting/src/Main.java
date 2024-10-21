public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.go();
        Bicycle bicycle = new Bicycle();
        bicycle.go();

        System.out.println("Number of doors on Car: " + car.doors + "\nNumber of wheels on Car: " + car.wheels);
        System.out.println("Number of wheels on Bike: " + bicycle.wheels + "\nNumber of pedals on Bike: " + bicycle.pedals);
    }
}