
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        boolean something;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write something:");
        something = Boolean.valueOf(scanner.nextLine());
        
        System.out.println("True or false? " + something);
    }
}
