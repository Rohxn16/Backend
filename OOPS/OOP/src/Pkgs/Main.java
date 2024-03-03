package Pkgs;
public class Main {
    public static void main(String[] args) {
        Human rohan = new Human("Rohan", 120000, false, 20);
        Human rahul = new Human("Rahul", 120000, false, 20);

        System.out.println(rohan.population);
        System.out.println(Human.population);
        // greet(); -> this func cant be called as main is a static method and can't be used to call non-static method
        // but one can have a static member inside a non-static member
    }

    void greet(){
        System.out.println("Hello, world");
    }
}