import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file type (mp4/vlc): ");
        String fileType = scanner.nextLine();

        MediaPlayer player = new VideoPlayerAdapter(fileType);

        System.out.print("Enter file name: ");
        String filename = scanner.nextLine();

        player.play(filename);
        scanner.close();
    }
}
