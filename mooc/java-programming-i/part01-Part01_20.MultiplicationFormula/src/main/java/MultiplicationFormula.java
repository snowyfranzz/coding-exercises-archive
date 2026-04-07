
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        int firstNum, secondNum;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        firstNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        secondNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
    }
}
