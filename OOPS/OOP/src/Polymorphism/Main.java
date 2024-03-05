package Polymorphism;

public class Main {
    // tTypes of polymorphism :
    /*
    * Compile time polymorphism / static polymorphism -> Done by method overloading
    * Runtime polymorphism / dynamic polymorphism done by method overriding
    * One cannot override a method that is final also known as early binding as it is resolved in compile time
    * Static methods also can not be overridden as it is object independant, so no matter if overridden the parent class one is always called.
    * */
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Square square = new Square();
        Shape triangle = new Triangle();

        triangle.area();
        shape.area();
        circle.area();
        square.area();
    }
}
