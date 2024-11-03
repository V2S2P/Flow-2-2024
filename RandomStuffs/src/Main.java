import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> carCollection = new ArrayList<>();

        Car Bugatti = new Bugatti("Bugatti", false, 250, 150);
        System.out.println("A " + Bugatti.getCarName() + " driving " + Bugatti.getKPh() + " km/h will take " + Bugatti.calculateTime() + " hour(s)" + " to drive " + Bugatti.getDistance() + "Km");

        Car Tesla = new Tesla("Model X", true, 250, 150);
        System.out.println("A " + Tesla.getCarName() + " driving " + Tesla.getKPh() + " km/h will take " + Tesla.calculateTime() + " hour(s)" + " to drive " + Tesla.getDistance() + "Km");

        carCollection.add(Bugatti);
        carCollection.add(Tesla);

        System.out.println("Car information: ");
        for (Car cars: carCollection){
            System.out.println(cars.toString() + cars.isElectric());
        }

        Car fastestCar = null;
        double minimumTime = Double.MAX_VALUE;

        for (Car cars : carCollection) {
            double time = cars.calculateTime();
            if (time < minimumTime) {
                minimumTime = time;
                fastestCar = cars;
            }
        }
        if (fastestCar != null) {
            System.out.println("\nThe car that takes the least amount of time is the " + fastestCar.getCarName() + " with a time of " + minimumTime + " hour(s).");
        }
    }
}