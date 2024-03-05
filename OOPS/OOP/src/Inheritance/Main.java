package Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box(2,3,4);
        box.displayBox();
        box1.displayBox();
        Box box2 = new Box(box1);
        box2.displayBox();
        BigBox box3 = new BigBox();
        box3.displayBigBox();
        BigBox box4 = new BigBox(1,2,3,4);
        box4.displayBigBox();
        BigBox box5 = new BigBox(box1,4);
        box5.displayBigBox();
        box5.displayBox();
    }
}
