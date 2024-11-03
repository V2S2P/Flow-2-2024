public class Bugatti extends Car{
    private int kPh;
    public Bugatti(String carName, boolean isElectric, int distance , int kPh){
        super(carName, isElectric, distance);
        this.kPh = kPh;
    }

    @Override
    public int getKPh() {
        return kPh;
    }
    @Override
    public double calculateTime(){
        return (double) getDistance() / kPh;
    }
}
