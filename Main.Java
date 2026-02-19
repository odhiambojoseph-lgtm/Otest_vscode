import java.util.Scanner;
import java.util.ArrayList;

// 1. ABSTRACTION: Blueprint for all users
abstract class Person {
    protected String name;
    public abstract void showIdentity();
}

// 2. INHERITANCE & ENCAPSULATION
class Student extends Person {
    private String id;
    private double score; // Encapsulated: private

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getters and Setters (Encapsulation Requirement)
    public void setScore(double score) { this.score = score; }
    public double getScore() { return score; }

    @Override
    public void showIdentity() {
        System.out.println("Student: " + name + " | ID: " + id + " | Marks: " + score + " | Grade: " + calculateGrade());
    }

    private String calculateGrade() {
        if (score >= 70) return "A";
        else if (score >= 60) return "B";
        else if (score >= 50) return "C";
        else if (score >= 40) return "D";
        else return "Fail";
    }
}

// 3. LECTURER CLASS: Handles the looping logic
class Lecturer extends Person {
    private Scanner input = new Scanner(System.in);

    @Override
    public void showIdentity() {
        System.out.println("Logged in as: Lecturer " + name);
    }

    public void processGrades(ArrayList<Student> classList) {
        String choice = "yes";
        
        // THE LOOP: Continues until lecturer says 'no'
        while (choice.equalsIgnoreCase("yes")) {
            System.out.println("\n--- Entering Marks Mode ---");
            System.out.print("Enter Student Name: ");
            String sName = input.next();
            System.out.print("Enter Student ID: ");
            String sId = input.next();
            
            Student newStudent = new Student(sName, sId);
            
            System.out.print("Enter marks for " + sName + ": ");
            double marks = input.nextDouble();
            newStudent.setScore(marks); // Using setter
            
            classList.add(newStudent); // Storing the student
            
            System.out.print("Enter another student? (yes/no): ");
            choice = input.next();
        }
    }
}

// 4. MAIN CLASS
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> myClass = new ArrayList<>();
        Lecturer boss = new Lecturer();
        boss.name = "Dr. Smith";
        
        boss.showIdentity();
        
        // Run the looping process
        boss.processGrades(myClass);
        
        // Final Summary Display
        System.out.println("\n======= FINAL CLASS REPORT =======");
        for (Student s : myClass) {
            s.showIdentity();
        }
        System.out.println("==================================");
    }
}
