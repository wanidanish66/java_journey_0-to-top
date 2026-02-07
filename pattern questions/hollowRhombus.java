
class hollowRhombus {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        for (int i = 1; i <= n; i++){
           // Print leading spaces
           for (int j = 1; j<= n - i; j++){
                System.out.print(" ");
           }
              // Print stars
              
              for(int j = 1; j <= m; j++){
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("* ");
                } 
            else {
                System.out.print("  ");
            }
              }
            System.out.println();
        }
    }
}