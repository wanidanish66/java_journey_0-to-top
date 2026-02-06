import java.util.Scanner;
class RadiusOfCircle {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {

        System.out.print("Enter the radius of a circle: ");
        float r = scanner.nextFloat();

        double area = Math.PI * r * r;

        System.out.println("radius of a circle is: "+ r);
        System.out.println("The area of a circle is: "+area);

        scanner.close();
    }
}
}