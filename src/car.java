public class car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("car{");
        sb.append("company='").append(company).append('\'');
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", modelNumber='").append(modelNumber).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append(", noOfWheels=").append(noOfWheels);
        sb.append('}');
        return sb.toString();
    }

    public car(String company, int maxSpeed, String modelNumber, String name, int noOfDoors, int noOfWheels) {
        this.company = company;
        this.maxSpeed = maxSpeed;
        this.modelNumber = modelNumber;
        this.name = name;
        this.noOfDoors = noOfDoors;
        this.noOfWheels = noOfWheels;
    }

    public static void main(String[] args) {
        car swift=new car("Maruti",120,"SW876","swift",
                4,4);
        System.out.println(swift.toString());
    }
}
