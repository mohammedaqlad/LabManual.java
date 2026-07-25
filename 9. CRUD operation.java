import java.util.ArrayList;
import java.util.List;

class Student {
    int rollno;
    String name;
    String department;
    int marks;

    public Student(int rollno, String name, String department, int marks) {
        this.rollno = rollno;
        this.name = name;
        this.department = department;
        this.marks = marks;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> db = new ArrayList<>();

        // 1. Insert two records
        db.add(new Student(101, "Rahul", "CSE", 90));
        db.add(new Student(102, "Sneha", "ISE", 91));
        System.out.println("Records Inserted Successfully.");

        // 2. Update marks for Roll No 101
        for (Student s : db) {
            if (s.rollno == 101) {
                s.marks = 95;
                break;
            }
        }
        System.out.println("\nRecord Updated Successfully.");

        // 3. Search and display single student details
        for (Student s : db) {
            if (s.rollno == 101) {
                System.out.println("\nStudent Details\n");
                System.out.println("Roll No : " + s.rollno);
                System.out.println("Name : " + s.name);
                System.out.println("Department : " + s.department);
                System.out.println("Marks : " + s.marks);
                break;
            }
        }

        // 4. Display all records in formatted table
        System.out.println("\nStudent Records");
        System.out.println("--------------------------------------------");
        System.out.printf("%-6s %-6s %-13s %-6s%n", "Roll", "Name", "Department", "Marks");
        System.out.println("--------------------------------------------");

        for (Student s : db) {
            System.out.printf("%-6d %-6s %-13s %-6d%n", s.rollno, s.name, s.department, s.marks);
        }
    }
}
