
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        String firstStr, secondStr;
        Scanner scan = new Scanner(System.in);

        System.out.println("Write the first string:");
        firstStr = scan.nextLine();
        
        System.out.println("Write the second string:");
        secondStr = scan.nextLine();
        
        if (firstStr.equals(secondStr)){
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
