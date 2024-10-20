public class Udgifter {
    private double money = 10000;

    public double getMoney(){
        return money;
    }

    public void årsUdgifter(){
        double price = money;
        int year = 0;

        while (price <= 20000){
            year++;
            price *= 1.07;
            System.out.println("Year " + year + ": " + price + " kr.");
        }
        System.out.println("Price is doubled after: " + year + " years");
    }
}
