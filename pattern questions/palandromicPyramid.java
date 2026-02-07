class palandromicPyramid {
    public static void main(String args[]){
        for (int i = 0; i <= 5; i++){
            // Print leading spaces
            for (int j =0; j <= 5 - i; j++){
                System.out.print(" ");
            }
            // Print decreasing numbers
            for (int j = i; j >= 1; j--){
                System.out.print(j);
            }
            // Print increasing numbers
            for (int j = 0; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}