
import java.util.Scanner;

public class SpeedingTicket {

    public static void main(String[] args) {
        int speed;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give speed:");
        speed = Integer.valueOf(scanner.nextLine());
        
        if (speed > 120) {
            System.out.println("Speeding ticket!");
        }
    }
}
