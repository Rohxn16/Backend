package AccessControl;

public class A {
    private int num;
    String name;
    int [] arr;

    public A(int num, String name) {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    // now private data member can not be accessed from outside but can be accessed and modified with getters and setters

    // This is a getter
    public int getnum(){
        return num;
    }

    // This is a setter
    public void setNum(int num){
        this.num = num;
    }
}
