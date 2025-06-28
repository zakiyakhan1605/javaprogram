package in.HaKhan.abstraction;

public  abstract class vehicle implements transport {

    public abstract void makeStsrtSound();
    public vehicle(int noOfTires) {
        this.noOfTires = noOfTires;
    }

    private int noOfTires;

    public int getNoOfTires() {
        return noOfTires;
    }

    public void setNoOfTires(int noOfTires) {
        this.noOfTires = noOfTires;
    }
    public void commute(){
        System.out.println("its commute");
    }

    @Override
    public void getSetGo() {
        System.out.println("going to place...");
    }
}
