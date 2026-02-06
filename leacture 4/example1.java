import java.util.*;
class example1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        for (int i = 1; i < limit; i++) {
            if (i % 2 == 0)
                continue;
            System.out.print(i + " ");
        }
    }
}