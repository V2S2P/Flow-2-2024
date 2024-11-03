public class Tesla extends Car{
    private int kPh;
    public Tesla(String carName,boolean isElectric, int distance, int kPh){
        super(carName, isElectric, distance);
        this.kPh = kPh;
    }

    @Override
    public int getKPh() {
        return kPh;
    }

    @Override
    public double calculateTime(){
        if (isElectric() == "Electric" && getDistance() >= 250){
            return (double) getDistance() / kPh + 0.5;
        }else {
            return (double) getDistance() / kPh;
        }
    }
}

