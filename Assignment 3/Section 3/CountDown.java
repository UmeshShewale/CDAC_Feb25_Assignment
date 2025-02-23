import java.util.Scanner;

class CountDown{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number for Count Down: ");
	int num= sc.nextInt();

	System.out.println("Count Down Number are: ");

	for (int i = num; i >= 0; i --){
		System.out.print(i + " " );
	}
	
	
}


}