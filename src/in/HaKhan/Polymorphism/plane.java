package in.HaKhan.Polymorphism;
 class plane  extends vehicle{
     @Override
     public void start() {
         super.start();
       System.out.println("plane is landing");
     }
 }
