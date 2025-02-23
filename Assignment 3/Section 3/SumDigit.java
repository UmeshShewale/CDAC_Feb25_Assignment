import java.util.Scanner;

class SumDigit{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number: ");
	int num= sc.nextInt(); // num=9876

	int sum = 0;
	int c = 0;

	while(num != 0){
		c = num % 10; 
		sum = sum + c;
		num = num/10;
	}
	System.out.println("Sum of the digits of number : " +sum);
	sc.close();
}
}