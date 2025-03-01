import java.util.Scanner;

class LargestDigit{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number: ");
	int num= sc.nextInt(); // num=9876

	int d = 0;
	int c ;

	while(num != 0){
		c = num % 10; 
		num = num/10;
		if ( d > c){
		d = d;
		} else{
		d = c;
		}
	}
	System.out.println("Largest of the digits of number : " + d);
	sc.close();
}
}