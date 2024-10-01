import java.util.*;

public class VirtualClassroomManager {
    private static VirtualClassroomManager instance;
    private Map<String, Classroom> classrooms;

    private VirtualClassroomManager() {
        classrooms = new HashMap<>();
    }

    public static VirtualClassroomManager getInstance() {
        if (instance == null) {
            instance = new VirtualClassroomManager();
        }
        return instance;
    }

    public void addClassroom(String name) {
        if (!classrooms.containsKey(name)) {
            classrooms.put(name, new Classroom(name));
            System.out.println("Classroom " + name + " has been created.");
        } else {
            System.out.println("Classroom " + name + " already exists.");
        }
    }

    public void addStudent(String studentId, String className) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.addStudent(new Student(studentId));
        } else {
            System.out.println("Classroom " + className + " not found.");
        }
    }

    public void scheduleAssignment(String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.scheduleAssignment(new Assignment(assignmentDetails));
        } else {
            System.out.println("Classroom " + className + " not found.");
        }
    }

    public void submitAssignment(String studentId, String className, String assignmentDetails) {
        Classroom classroom = classrooms.get(className);
        if (classroom != null) {
            classroom.submitAssignment(studentId, assignmentDetails);
        } else {
            System.out.println("Classroom " + className + " not found.");
        }
    }
}
