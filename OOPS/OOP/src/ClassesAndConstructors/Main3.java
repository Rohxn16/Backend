package ClassesAndConstructors;

public class Main3 {
    // class in class
    static class MiniMain{ // when the class is made static, it is not dependent on the object of the outer class
        // it is a class within a class
        String name;

        public MiniMain(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        MiniMain m = new MiniMain("Rohan"); // this can't be done from a static function as MiniMain is dependent on Main3 but will work when its static

    }
}
