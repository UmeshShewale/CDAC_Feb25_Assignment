import java.util.Scanner;

class PatternDemo_22{

	public static void main(String args[]){

	Scanner sc= new Scanner(System.in);

	System.out.println("Enter the number of rows for pattern: ");
	int num= sc.nextInt();
		
	for (int i = num - 1; i >= 1; i--) {
            for (int j = num; j > i; j--) { 
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) { 
                System.out.print("*");
            }
            System.out.println();
        }

	for (int i = 1; i <= num; i++) {
            for (int j = i; j < num; j++) { 
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) { 
                System.out.print("*");
            }
            System.out.println();
        }

	
}

}