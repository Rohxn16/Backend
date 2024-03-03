package Pkgs;

public class Human {
    String name;
    int salary;
    boolean married;
    int age;
    static long population; // static variable holds for the entrie class as a whole, accessing it through instance and a parent class has the same value

    public Human(String name, int salary, boolean married, int age) {
        this.name = name;
        this.salary = salary;
        this.married = married;
        this.age = age;
        Human.population += 1;
    }

    static void printInfo(Human man){
        System.out.println("Name  :"+man.name+" Age : "+man.age+" Marital Status : "+man.married+" Salary : "+man.salary);
    }
}
