package in.HaKhan.abstraction;

public class Circle extends shape{
    private final double radiusOfCircle;
    public Circle(double radiusOfCircle){
        this.radiusOfCircle=radiusOfCircle;
    }
    public double getRadiusOfCircle(){
        return radiusOfCircle;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(radiusOfCircle,2);
    }
}
