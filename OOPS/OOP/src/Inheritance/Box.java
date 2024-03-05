package Inheritance;

public class Box {
    double l,b,h;
    private String color; //this can not be accessed by the child class

    Box(){
        this.l = -1;
        this.b = -1;
        this.h = -1;
    }

    // for cuboid
    Box(double l, double b,double h){        this.l = l;
        this.b = b;
        this.h = h;
    }

    //for cube
    Box(double side){
        this.l = side;
        this.b = side;
        this.h = side;
    }
    Box(Box box){
        this.b = box.b;
        this.l = box.l;
        this.h = box.h;
    }

    public void displayBox(){
        System.out.println(l+" "+b+" "+h);
    }
}
