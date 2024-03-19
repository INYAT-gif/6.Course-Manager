import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private String instructor;
    private int capacity;
    private List<String> enrolledStudents;

    public Course(String name, String instructor, int capacity) {
        this.name = name;
        this.instructor = instructor;
        this.capacity = capacity;
        this.enrolledStudents = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public List<String> getEnrolledStudents() {
        return enrolledStudents;
    }

    // Method to enroll a student
    public boolean enrollStudent(String studentName) {
        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(studentName);
            return true;
        } else {
            return false; // Course is full
        }
    }

    // Method to remove a student
    public boolean removeStudent(String studentName) {
        return enrolledStudents.remove(studentName);
    }
}
