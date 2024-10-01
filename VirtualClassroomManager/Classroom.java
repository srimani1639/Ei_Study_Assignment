import java.util.*;

public class Classroom {
    private String name;
    private List<Student> students;
    private List<Assignment> assignments;

    public Classroom(String name) {
        this.name = name;
        this.students = new ArrayList<>();
        this.assignments = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student " + student.getId() + " has been enrolled in " + this.name + ".");
    }

    public void scheduleAssignment(Assignment assignment) {
        assignments.add(assignment);
        System.out.println("Assignment for " + this.name + " has been scheduled.");
    }

    public void submitAssignment(String studentId, String assignmentDetails) {
        System.out.println("Assignment submitted by Student " + studentId + " in " + this.name + ".");
    }
}
