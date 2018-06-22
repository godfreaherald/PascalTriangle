import java.util.Scanner;


public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Pascal Index : ");
        int rows = scanner.nextInt();
        System.out.println("Pascal Triangle Values  for Index :" +rows);
        print(rows);
        scanner.close();
    }
    
    

    public static void print(int n) {
        for (int x = 0; x < n; x++) {    /*iterate from first row to row n.*/
        	
        	if( x == n-1 ) {  /*print only the nth row */
             for (int y = 0; y <= x; y++) {       /*iterate from first column to the column equal to the current row.*/
                 
            	 System.out.print(getpascal(x, y) + " ");  /* display the elements and space to for formatting.*/
             }
        	}
           
        }
    }

    public static int getpascal(int i, int j) {  /* method to get the row elements recursively*/
        if (j == 0 || j == i) {
           return 1;
        } else {
           return getpascal(i - 1, j - 1) + getpascal(i - 1, j); /*recursive call to get the row values from the row above it.*/
        }
    }
}