
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        String coolStringVar;
        int coolIntVar;
        double coolDoubleVar;
        boolean coolBooleanVar;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a string:");
        coolStringVar = scan.nextLine();
        
        System.out.println("Give an integer:");
        coolIntVar = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        coolDoubleVar = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        coolBooleanVar = Boolean.valueOf(scan.nextLine());
        
        
        System.out.println("You gave the string " + coolStringVar);
        System.out.println("You gave the integer " + coolIntVar);
        System.out.println("You gave the double " + coolDoubleVar);
        System.out.println("You gave the boolean " + coolBooleanVar);
    }
}
