import java.io.*;
import java.util.Scanner;

public class StudentFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fn = "students.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fn))) {
            for (int i = 1; i <= 3; i++) {
                System.out.println("Enter details for Student " + i + ":");
                System.out.print("Roll No: ");
                String roll = sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Marks: ");
                String marks = sc.nextLine();
                writer.write(roll + "," + name + "," + marks);
                writer.newLine();
            }
            System.out.println("\n--- Records saved successfully! ---\n");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        System.out.println("--- All Student Records ---");
        try (BufferedReader reader = new BufferedReader(new FileReader(fn))) {
            String ln;
            while ((ln = reader.readLine()) != null) {
                String[] details = ln.split(",");
                System.out.println("Roll No: " + details[0] + " | Name: " + details[1] + " | Marks: " + details[2]);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        System.out.print("\nEnter Roll Number to search: ");
        String searchRoll = sc.nextLine();
        boolean found = false;
        try (BufferedReader reader = new BufferedReader(new FileReader(fn))) {
            String ln;
            while ((ln = reader.readLine()) != null) {
                String[] details = ln.split(",");
                if (details[0].equals(searchRoll)) {
                    System.out.println("\n--- Record Found ---");
                    System.out.println("Roll No : " + details[0]);
                    System.out.println("Name    : " + details[1]);
                    System.out.println("Marks   : " + details[2]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("\nStudent with Roll Number " + searchRoll + " not found.");
            }
        } catch (IOException e) {
            System.out.println("Error searching file: " + e.getMessage());
        }
        sc.close();
    }
}
