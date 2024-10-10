import java.util.ArrayList;
import java.util.List;

public class Student {
    private static final List<Student> students = new ArrayList<>(); // List to keep track of all students
    private String name;
    private int rating;

    // Constructor with parameters
    public Student(String name) {
        this.name = name;
        this.rating = 0; // Default rating
        students.add(this); // Add the new student to the list
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // Method to compare ratings of two students
    public boolean betterStudent(Student student) {
        return this.rating > student.rating;
    }

    // Method to change rating and adjust the average rating if necessary
    public void changeRating(int rating) {
        this.rating = rating;
    }

    // Static method to calculate average rating of all students
    public static double getAvgRating() {
        if (students.isEmpty()) return 0;
        double totalRating = 0;
        for (Student student : students) {
            totalRating += student.getRating();
        }
        return totalRating / students.size();
    }

    // Static method to remove a student
    public static void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', rating=" + rating + "}";
    }

    // Main method for testing
    public static void main(String[] args) {
        Student student1 = new Student("Petro");
        student1.changeRating(85); // Set initial rating
        Student student2 = new Student("Volodymyr");
        student2.changeRating(90); // Set initial rating
        Student student3 = new Student("Kate");
        student3.changeRating(80); // Set initial rating

        // Display average rating
        System.out.println("Average Rating: " + Student.getAvgRating());

        // Change rating of one student
        student1.changeRating(95); // Change Alice's rating

        // Display new average rating
        System.out.println("New Average Rating: " + Student.getAvgRating());
    }
}
