package in.HaKhan.equals;

public class equalAndHashcode {
    public static void main(String[] args) {
        person per1=new person(21,"001","zakiya");
        person per2=new person(21,"001","zakiya");
        if (per1.equals(per2)){
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }
}
