import java.util.Scanner;

class Fahrenheit{
	public static void main(String args[]){
	
	Scanner sc= new Scanner(System.in);		

	System.out.println("Enter the temperature : ");
	double temp= sc.nextInt();

	double fahrenheit = (temp*9/5) + 32;

	System.out.println("Temperature in fahrenheit is : " + fahrenheit);
}
}
