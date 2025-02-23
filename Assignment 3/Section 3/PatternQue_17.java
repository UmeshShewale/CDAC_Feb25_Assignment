import java.util.Scanner;

class PatternQue_17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

	for (int i =1; i <= n; i++){
		for (int j = 1; j<i ; j++){
			System.out.print(" ");
		}
		for (int k = n; k >=i; k--){
			System.out.print("*");
		}
	System.out.println();
	}
	for (int i = n; i >= 1; i--) { 
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) { 
                System.out.print("*");
            }
            System.out.println(); 
        }
	

}
}

		