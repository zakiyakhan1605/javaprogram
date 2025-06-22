package in.zakiyaKhan;

public class Public{
    public String colorCar;
     private double fuelInCar;
    private long costOfPurchase;

    public Public(String colorCar, long costOfPurchase, double fuelInCar) {
        this.colorCar = colorCar;
        this.costOfPurchase = costOfPurchase;
        this.fuelInCar = fuelInCar;
    }
    public Public() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Public{");
        sb.append("colorCar='").append(colorCar).append('\'');
        sb.append(", fuelInCar=").append(fuelInCar);
        sb.append(", costOfPurchase=").append(costOfPurchase);
        sb.append('}');
        return sb.toString();

    }

    public static void main(String[] args) {
        
    }
}

