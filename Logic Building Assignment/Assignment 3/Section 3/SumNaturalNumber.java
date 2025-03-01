import java.util.Scanner;

class SumNaturalNumber{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number for sum of natural number: ");
	int num= sc.nextInt();

	int sum =0;

	for (int i = 0; i <= num; i ++){
		sum = sum +i ;
	}
	
	System.out.println("Sum of natural number "+ num + " is " + sum);
}


}