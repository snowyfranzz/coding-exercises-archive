
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        String password;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Password?");
        password = scan.nextLine();
        
        if (password.equals("Caput Draconis")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Off with you!");
        }
        
        
    }
}
