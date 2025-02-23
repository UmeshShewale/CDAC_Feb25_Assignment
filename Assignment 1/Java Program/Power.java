import java.util.Scanner;

class Power{
	public static void main(String args[]){
	
	Scanner sc= new Scanner(System.in);		

	System.out.println("Enter the number : ");
	int a= sc.nextInt();

	System.out.println("Enter the power : ");
	int b= sc.nextInt();

	double c= Math.pow( a, b);
	System.out.println("Enter the value : " + c);
}
}
