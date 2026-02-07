import java.util.Scanner;
public class example3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("press your buttom from 1 , 2 and 3: ");
        int button = scanner.nextInt();

        if (button ==1){
            System.out.println(".(hello)");
        }
        else if (button ==2){
            System.out.println(".(salaam)");
        }
        else if (button ==3){
            System.out.println(".(bonjour)");
        }
        else {
            System.out.println("invalid button");
        }
    }
}