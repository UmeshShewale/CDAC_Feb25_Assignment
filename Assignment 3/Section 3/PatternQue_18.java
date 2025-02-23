import java.util.Scanner;

class PatternQue_18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

	for (int i =1; i <= n; i++){
		for (int j = 1; j <= n - i; j++) { // Print spaces
                System.out.print(" ");
            }
		for (int k = 1; k <= (2 * i - 1); k++) { // Print stars
                System.out.print("*");
            }

	System.out.println();
	}
	
	for (int i = n-1; i >=1; i--){
		for (int j = 1; j <= n - i; j++) { // Print spaces
                System.out.print(" ");
            }
		for (int k = 1; k <= (2 * i - 1); k++) { // Print stars
                System.out.print("*");
            }

	System.out.println();
	}

}
}