package in.HaKhan.abstraction;

public class Square {
    private final double sideOfSquare;
    public Square(double sideOfSquare){
        this.sideOfSquare= sideOfSquare;
    }

    public double getSideOfSquare() {
        return Math.pow(sideOfSquare,2);
    }
}
