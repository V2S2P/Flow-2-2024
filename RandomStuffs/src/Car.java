public abstract class Car {
    private String carName;
    private boolean isElectric;
    private int distance;

    public Car(String carName,boolean isElectric, int distance){
        this.carName = carName;
        this.isElectric = isElectric;
        this.distance = distance;
    }

    public static void compareCars(Car cars){
        System.out.println("Which car will reach the destination fastest? " + cars);
    }
    public String getCarName() {
        return carName;
    }

    public String isElectric() {
        if (isElectric){
           return "Electric";
        }else {
           return "Gas";
        }
    }

    public int getDistance(){
        return distance;
    }

    @Override
    public String toString() {
        return "Car Model: " + getCarName() + "\n Car Type: ";
    }

    public abstract int getKPh();

    public abstract double calculateTime();
}
