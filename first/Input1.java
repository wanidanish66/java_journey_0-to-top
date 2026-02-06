import java.util.*;

public class Input1 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter your first number: ");
        int num1 = sc.nextInt();

        System.out.print("enter your second number: ");
        int num2 = sc.nextInt();

        int sum = num2 + num1;
        System.out.println("sum of two numbers is: "+ sum);
    }

}
