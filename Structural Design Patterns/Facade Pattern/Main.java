import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HomeFacade home = new HomeFacade();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an action: (1) Arrive home, (2) Leave home, (3) Exit");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    home.arriveHome();
                    break;
                case "2":
                    home.leaveHome();
                    break;
                case "3":
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
