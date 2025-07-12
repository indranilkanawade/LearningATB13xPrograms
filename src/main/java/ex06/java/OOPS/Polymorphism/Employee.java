package ex06.java.OOPS.Polymorphism;

public class Employee {
    public static void main(String[] args) {

        Employee obj = new Manager();
        obj.role();
        Employee obj1 = new Clerk();
        obj1.role();
        Employee obj2 = new Tester();
        obj2.role();

    }
    public void role(){
        System.out.println("General Employee");
    }
}

class Manager extends Employee{
    public void role(){
        System.out.println("Manager Employee");
    }
}

class Clerk extends Employee{
    public void role(){
        System.out.println("Clerk Employee");
    }
}
class Tester extends Employee{
    public void role(){
        System.out.println("Tester Employee");
    }
}