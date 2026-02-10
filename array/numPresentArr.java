import java.util.Scanner;
class numPresentArr {

    public static void main(String args[]) {
        int[] arr = {1, 2, 6, 3, 8, 7, 4, 5, 9, 10};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find in the array: ");
        int numToFind = sc.nextInt();

        boolean IsPresent = false;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == numToFind) {
                IsPresent = true;

                break;

            }
            
        }
        if (IsPresent) {
                System.out.println(numToFind + " is present in the array.");
            } else {
                System.out.println(numToFind + " is not present in the array.");
            }
    }
}
