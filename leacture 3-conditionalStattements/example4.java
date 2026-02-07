import java.util.Scanner;
public class example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("press the button from 1 , 2 and 3: ");
        int button = scanner.nextInt();

        switch (button) {
            case 1:
                System.out.println(".(hello)");
                break;
            case 2:
                System.out.println(".(salaam)");
                break;
                
            case 3:
                System.out.println(".(bonjour)");
                break;
            default:
                System.out.println("invalid button");

        }
    }
}