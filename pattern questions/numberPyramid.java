class numberPyramid {
    public static void main(String args[]){
        int num = 5;
        for (int i = 1; i <= num; i++){
           // Print leading spaces
           for (int j = 1; j <= num-i; j++){
            System.out.print(" ");
           }
           // Print numbers
           for (int j = 1; j <= i; j++){
            System.out.print(i+" ");
           }
              System.out.println();
        }
    }
}