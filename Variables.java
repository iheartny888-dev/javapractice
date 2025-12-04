//two typees- dynamic and static, use camelcase, constants use uppercase

class Student {
    String studentName; // belongs to individual student
    static int studentCount = 0; //belongs to the class
    static final String SCHOOL_NAME = "CSAEA";

    Student(String n) {
        studentName = n;
        System.out.println(studentName + " is a student at " + SCHOOL_NAME);
        studentCount++;
    }
}

public class Variables {
    public static void main(String[] args) {
        new Student("Alex");
        new Student("John");
        new Student("Tyler");
        new Student("Benny");
        new Student("Bushrod");
        new Student("Bobo");
        new Student("Spotswood");

        System.out.println("Number of students: " + Student.studentCount);
    }
}
