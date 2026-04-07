
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        int firstNum, secondNum;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        firstNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        secondNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The average is " + (((float) firstNum + secondNum)/2));
        
    }
}
