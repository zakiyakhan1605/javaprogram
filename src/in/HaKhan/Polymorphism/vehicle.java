package in.HaKhan.Polymorphism;

public  abstract class vehicle {

    private int noOfTyres;

    vehicle(){
        this.noOfTyres=0;
    }

    vehicle(int noOfTyres){
        this.noOfTyres=noOfTyres;
    }
    public int getNoOfTyres(){
        return this.noOfTyres;
    }

    void start(){
        System.out.println("vehicle is starting...");
    }
}
