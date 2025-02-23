import java.util.Scanner;

class Area{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);

	System.out.println("Enter radius of Circle: ");
	double a = sc.nextDouble();

	double area= Math.PI * a * a;
	System.out.println("The area of the circle is: " + area);
	
	}


}