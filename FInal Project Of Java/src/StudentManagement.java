class Student {

    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentManagement {

    public static void main(String[] args) {

        Student s1 = new Student("Ram", 85);
        Student s2 = new Student("Sita", 92);

        s1.display();
        System.out.println();

        s2.display();
    }
}