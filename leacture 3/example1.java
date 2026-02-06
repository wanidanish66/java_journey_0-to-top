import java.util.Scanner;
public class example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } 
        else {
            System.out.println("The number is odd.");
        }
    }
}