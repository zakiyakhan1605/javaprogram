package in.getterSetter;

public  class Public {
    private String color;
    private String model;
    private double fuelLevel;
    private long costOfFuel;
    public String getColor(){
        return color;
    }
    public  String getModel(){
        return model;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public Public(String color, long costOfFuel, double fuelLevel, String model) {
        this.color = color;
        this.costOfFuel = costOfFuel;
        this.fuelLevel = fuelLevel;
        this.model = model;
    }
}
