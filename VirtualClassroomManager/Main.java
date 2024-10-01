import java.util.*;

public class Main {
    public static void main(String[] args) {
        VirtualClassroomManager manager = VirtualClassroomManager.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEnter command: ");
            String input = scanner.nextLine();
            String[] tokens = input.split(" ", 2);

            switch (tokens[0]) {
                case "add_classroom":
                    manager.addClassroom(tokens[1]);
                    break;
                case "add_student":
                    String[] studentArgs = tokens[1].split(" ");
                    manager.addStudent(studentArgs[0], studentArgs[1]);
                    break;
                case "schedule_assignment":
                    String[] assignArgs = tokens[1].split(" ", 2);
                    manager.scheduleAssignment(assignArgs[0], assignArgs[1]);
                    break;
                case "submit_assignment":
                    String[] submitArgs = tokens[1].split(" ", 3);
                    manager.submitAssignment(submitArgs[0], submitArgs[1], submitArgs[2]);
                    break;
                case "exit":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }
}
