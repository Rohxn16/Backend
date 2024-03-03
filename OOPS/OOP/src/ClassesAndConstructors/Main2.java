package ClassesAndConstructors;

import java.util.Arrays;
import java.util.Scanner;

// making a class with a constructor
class Car{
    String name;
    int no;
    int fuel_cons;
    Car(String name, int no, int fuel_cons){
        this.name = name;
        this.fuel_cons = fuel_cons;
        this.no = no;
    }

    Car(){
        this.name = "";
        this.no = -1;
        this.fuel_cons = -1;
    }
    void Print(){
        System.out.println(name);
        System.out.println(no);
        System.out.println(fuel_cons);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the name of the car : ");
//        String name = sc.next();
//        System.out.println("Enter the model number of the car");
//        int no = sc.nextInt();
//        System.out.println("Enter the fuel consumption of the car");
//        int fuel = sc.nextInt();
//        Car car = new Car(name,no,fuel);
//        car.Print();
        // now lets try creating a list / array of cars
        Car [] cararr = new Car[3];
        cararr[0] = new Car("Ferrari",2,55);
        cararr[1] = new Car("Mustang",3,66);
        cararr[2] = new Car("R4",4,34);
        System.out.println(Arrays.toString(cararr));
        for(Car car : cararr){
            System.out.println("Name : "+car.name);
            System.out.println("Model : "+car.no);
            System.out.println("Fuel Usage : "+car.fuel_cons);
            System.out.println("-----------------------------");
        }
        sc.close();
    }
}
