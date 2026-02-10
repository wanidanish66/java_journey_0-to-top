
class question03 {

    public static void main(String args[]) {
        int[] PhysicsMarks = {85, 90, 78, 92, 88};
        int sum = 0;
        for (int mark : PhysicsMarks) {
            sum += mark;
            
        }
        System.out.println("The total marks obtained in Physics is: " + sum);
        System.out.println("The average marks obtained in Physics is: " + sum / PhysicsMarks.length);
    }
}
