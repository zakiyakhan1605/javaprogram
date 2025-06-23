package in.inheritance;

public class InhheritenceTest {
    public static void main(String[] args) {


        vehicle vehicle = new vehicle();
        twoWheeler twoWheeler = new twoWheeler();
        vehicle.commute();
        twoWheeler.commute();
motocycle motocycle=new motocycle();
motocycle.commute();
motocycle.balance();
motocycle.start();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());

    }
}
