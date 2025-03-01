import java.util.Scanner;

class Multiples{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number to find multiples: ");
	int num= sc.nextInt();

	System.out.println("Enter start range: ");
	int num1= sc.nextInt();

	System.out.println("Enter end range: ");
	int num2= sc.nextInt();

	System.out.println("Multiples of " + num +" in between range of " + num1 + " & " + num2 + " are: ");

	for (int i = num1; i <= num2; i++){
		if( i % num == 0) {
			System.out.print(i +" ");
	}
	}
}
}


