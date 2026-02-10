class sumOfArray {
    public static void main(String args[]) {
        float [] marks = {20.5f, 30.0f, 40.5f, 50.0f, 60.5f};
        float sum = 0;
        for (float mark : marks) {
            sum += mark;
        }
        System.out.println("The sum of the marks is: " + sum);
    }
}