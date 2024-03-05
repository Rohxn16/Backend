package AccessControl;

public class Main {
    public static void main(String[] args) {
        A ob = new A(12, "Rohan");
        System.out.println(ob.getnum());
        ob.setNum(24);
        System.out.println(ob.getnum());
    }

}
