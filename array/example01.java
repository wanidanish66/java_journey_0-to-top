class example01{
    public static void main(String args[]) {
        // int[] marks = new int[5];
        // marks[0] = 100;
        // marks[1] = 90;          
        // marks[2] = 80;
        // marks[3] = 70;
        // marks[4] = 60;

    
        int [] marks = {100, 90, 80, 70, 60};
        // for (int i = 0; i < marks.length; i++) {
        //     System.out.println(marks[i]);
        // }
// displaying the marks using for each loop
        for (int mark : marks) {
            System.out.println(mark);
        }
    }
}