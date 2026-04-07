
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        int firstNum, secondNum, thirdNum;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        firstNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        secondNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number:");
        thirdNum = Integer.valueOf(scanner.nextLine());
        
        System.out.println("The average is " + (((double)firstNum + secondNum + thirdNum)/3));
    }
}
