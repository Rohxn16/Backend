package Inheritance;

public class BigBox extends Box{
    int weight;

    public BigBox(int weight) {
        this.weight = weight;
    }

    public BigBox(double l, double b, double h, int weight) {
        super(l, b, h);
        this.weight = weight;
    }

    public BigBox(Box box, int weight) {
        super(box);
        this.weight = weight;
    }

    BigBox (BigBox bb){
        this.h = bb.h;
        this.b = bb.b;
        this.l = bb.l;
        this.weight = bb.weight;

    }
    public BigBox(){
        this.weight = -1;
    }

    public void displayBigBox(){
        System.out.println(l+" "+b+" "+h+" "+weight);
    }
}
