package in.HaKhan.abstraction;

public class car extends vehicle {
    private int noOfDoors;



    public car() {
        super(4);
    }

    @Override
    public void makeStsrtSound() {

        System.out.println("vrhoo....");
    }

}
