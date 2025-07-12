package ex06.java.OOPS.Polymorphism;

public class User {
    public static void main(String[] args) {
        User obj = new AdminUser();
        obj.login();
        User obj1 = new RegularUser();
        obj1.login();

    }
    public void login(){
        System.out.println("User login");
    }
}
class AdminUser extends User{
    public void login(){
        System.out.println("Admin login");
    }
}
class RegularUser extends User{
    public void login(){
        System.out.println("Regular user Login");
    }
}
