package in.HaKhan.nested;

public class Car {
    private  int noOfdoors;
    public void repair(){
        tyre t=new tyre();
    }
    public  class tyre{
        private double weidth;
        private double pressure;
        private String  material;
    public void inflate(){
        noOfdoors=2;
    }

    }
}
