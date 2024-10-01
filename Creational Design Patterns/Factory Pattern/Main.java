import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter vehicle type (car/bike): ");
        String vehicleType = scanner.nextLine();

        Vehicle vehicle = VehicleFactory.getVehicle(vehicleType);
        if (vehicle != null) {
            vehicle.drive();
        } else {
            System.out.println("Invalid vehicle type.");
        }
        scanner.close();
    }
}
