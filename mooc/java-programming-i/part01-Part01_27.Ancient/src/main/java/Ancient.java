import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        year = Integer.valueOf(scan.nextLine());
        
        if(year < 2015){
            System.out.println("Ancient history!");
        }
    }
}
