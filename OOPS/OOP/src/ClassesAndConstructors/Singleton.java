package ClassesAndConstructors;

public class Singleton {
    private Singleton(){
        // this assures that singleton can be accessed within this only once , thus making it a singleton class

    }

    private static Singleton instance; // this the only object / instance of the Singleton class
    public static Singleton getInstance(){ // this function creates instances of the Singleton class
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance(); // no matter how many objects / instances are created it will be returned with a pointer ot the same instance

    }
}
