package in.HaKhan.Polymorphism;
class Car extends vehicle{
    public  int noOfDoors(){

        return 5;
    }
    Car(){
        super();
    }
    Car(int noOfTyres){
        super(noOfTyres);
    }

    @Override
    public void start() {
        System.out.println(super.getNoOfTyres());
        System.out.println("car is starting");
    }
}
