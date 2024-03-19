
public class CourseManagerApp {
    public static void main(String[] args) {
        // Example usage of the Course class
        Course javaCourse = new Course("Java Programming", "John Doe", 20);

        // Enroll students
        System.out.println(javaCourse.enrollStudent("Alice"));
        System.out.println(javaCourse.enrollStudent("Bob"));

        // Display enrolled students
        System.out.println("Enrolled students: " + javaCourse.getEnrolledStudents());

        // Remove a student
        System.out.println(javaCourse.removeStudent("Alice"));

        // Display enrolled students after removal
        System.out.println("Enrolled students after removal: " + javaCourse.getEnrolledStudents());
    }
}
