package ex06.java.OOPS.Polymorphism;

public class Animal {
    public static void main(String[] args) {

        Animal obj = new Dog();
        obj.sound();
        Animal obj1 = new Cat();
        obj1.sound();
        Animal obj2 = new Cow();
        obj2.sound();

    }
    public void sound(){

    }

}

class Dog extends Animal{
    public void sound(){
        System.out.println("Bark");
    }
}
class Cat extends Animal{
    public void sound(){
        System.out.println("Meow");
    }

}
class Cow extends Animal{
    public void sound(){
        System.out.println("Moo");
    }

}
