import java.util.Scanner;

class NaturalNumber{

	public static void main(String args[]){
		
	Scanner sc= new Scanner(System.in);

	System.out.println("Enter the  number of natural number: ");
	int num= sc.nextInt();

	for (int i =1; i<=num; i++){
		System.out.println(i + " ");
	}
}
}