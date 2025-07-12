package ex06.java.OOPS.Polymorphism;

public class vehicle {

    public static void main(String[] args) {
        vehicle obj = new bike();
        obj.start();
        vehicle obj1 = new car();
        obj1.start();

    }
    public void start(){

    }
}
class bike extends vehicle{
    public void start(){
        System.out.println("Kick start the bike");
    }
}
class car extends vehicle{
    public void start(){
        System.out.println("Turn the key to start the car");
    }
}
