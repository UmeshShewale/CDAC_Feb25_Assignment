import java.util.Scanner;

class Factorial{

	public static void main(String args[]){
		
	Scanner sc= new Scanner(System.in);

	System.out.println("Enter the number for factorial: ");
	int num= sc.nextInt();

	int factorial = 1;
	for( int i= num; i>=1; i--){
		factorial= factorial*i;
	}
	System.out.println("Factorial of the number is :" + factorial);



}
}