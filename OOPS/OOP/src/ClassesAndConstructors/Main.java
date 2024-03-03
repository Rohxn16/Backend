package ClassesAndConstructors;// creating a class to store students and their personal information
// Classes are basically simple templates which can have instances / objects of their own but always have some fixed set of common properties
import java.util.Arrays;
import java.util.Scanner;

class Student{ // each student will have the following properties
    int roll;
    String name;
    float marks;

    public static void printInfo(Student student){
        System.out.println("Name : "+student.name +"\n Roll no : "+student.roll+"\n Marks : "+student.marks);
    }
}

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // now here in the main we can make their physical manifestation / object

        Student kunal = new Student();
        kunal.name = "Kunal";
        kunal.roll = 1;
        kunal.marks = 69;
        Student.printInfo(kunal);

        Student [] students = new Student[5];
        for(int i = 0; i < students.length; i++){
            Student student = new Student();
            student.name = sc.next();
            student.roll = sc.nextInt();
            student.marks = sc.nextFloat();
            students[i] = student;
        }

        System.out.println(Arrays.toString(students));
    }

}