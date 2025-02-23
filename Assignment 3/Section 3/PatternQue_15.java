import java.util.Scanner;

class PatternQue_15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt(); 

        for (int i = 1; i <= n; i++) { // Loop for each row
            for (int j = 1; j <= n - i; j++) { 
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { 
                System.out.print("*");
            }
            System.out.println(); 
        }
	/*for (int i = 1; i <= 5; i ++){
		switch (i) {
 		case 1:
   		System.out.println("    *");
     		break;
  		case 2:
    		System.out.println("   **");
    		break;
  		case 3:
    		System.out.println("  ***");
    		break;
  		case 4:
   		System.out.println(" ****");
    		break;
  		case 5:
    		System.out.println("*****");
    		break;
		}
	}*/


        sc.close(); // Close scanner
    }
}

	
	


