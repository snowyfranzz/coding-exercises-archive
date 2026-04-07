import java.util.Scanner;

public class Adulthood {

    public static void main(String[] args) {
        int age;
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        age = Integer.valueOf(scan.nextLine());
        
        if (age>=18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
        
        
    }
}
