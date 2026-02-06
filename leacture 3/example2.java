import java.util.Scanner;
public class example2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();

        if (a > b){
            System.err.println("A is greater.");
        } else if (b > a){
            System.out.println("B is greater.");
        }
        else {
            System.out.println("Both numbers are equal.");
        }
    }
}