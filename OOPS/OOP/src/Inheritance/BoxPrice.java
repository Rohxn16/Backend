package Inheritance;

public class BoxPrice extends BigBox{
    // this an example of multi level inheritance where the child class is also a parent class for another child class
    int price;
    BoxPrice(){
        super();
    }

    BoxPrice(int price){
        super();
        this.price = price;
    }

    BoxPrice(double l,double b, double h, int weight, int price){
        super(l,b,h,weight);
        this.price = price;
    }

    BoxPrice(Box box, int weight, int price){
        super(box,weight);
        this.price = price;
    }

    BoxPrice(BigBox box, int price){
        super(box);
        this.price =price;
    }
}
