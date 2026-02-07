
import java.util.Scanner;

class isPrime0 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print all prime numbers up to that number: ");
        int count = sc.nextInt();
        for (int num = 2  ; num <= count; num++) {

            boolean isprime = true;

            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    isprime = false;
                    break;
                }

            }
            if (isprime) {
                System.out.print(num + " ,");
            }
        }

    }
}
