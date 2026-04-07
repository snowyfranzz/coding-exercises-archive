
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        double num;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give a number:");
        num = Double.valueOf(scanner.nextLine());
        
        System.out.println("You gave the number " + num);
    }
}
