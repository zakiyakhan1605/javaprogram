package in.HaKhan.Polymorphism;

public class testPolymorphism {
    public static void main(String[] args) {
        Car car=new Car();
        //vehicle v=new vehicle();
        plane plane=new plane();
       // castTest(v);
        //castTest(car);
        car.start();
        plane.start();
       // castTest(plane);
        //vehicle vcar=new Car();
        //Car Cvehicle=(Car) new vehicle();
       // Object ref = new Car();
    }
    private static void castTest(vehicle veh){
veh.start();
//Car cvehicle=(Car) veh;
//veh.noOfDoors();
       // cvehicle.noOfDoors();
        //cvehicle.start();
        if (veh instanceof Car){

        }
    }
}
