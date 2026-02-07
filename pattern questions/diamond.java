class diamond {
    public static void main(String args[]){
        for (int i = 1; i <= 5; i++){
            // Print leading spaces
            for (int j =1; j <= 5 - i; j++){
                System.out.print(" ");
            }
            // print star
            for (int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = 4; i >= 1; i--){
            // Print leading spaces
            for (int j =1; j <= 5 - i; j++){
                System.out.print(" ");
            }
            // print star
            for (int j = 1; j <= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
     

    }

    }