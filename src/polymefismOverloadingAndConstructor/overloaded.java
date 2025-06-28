package polymefismOverloadingAndConstructor;

public class overloaded {
    overloaded(){
        System.out.println("overloading");
    }
    overloaded(int pop){
        System.out.println(pop);
    }
    public int sum(int a,int b){
        return a+b;
    }
    public String sum(String a,String b){
        return a+b;
    }
    public int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        overloaded overload=new overloaded();
        System.out.println(overload.sum(1,2));
        overload.sum("a","b");
        overload.sum(1,2,3,4);
    }
}
