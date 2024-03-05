package Polymorphism;

public class Triangle extends Shape{

    @Override
    void area(){ // this is basically overriding the original area function of the shapes class
        System.out.println("The area for triangle is 1/2 times base times height");
    }
}
