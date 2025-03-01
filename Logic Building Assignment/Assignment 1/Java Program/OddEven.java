import java.util.Scanner;

class OddEven{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);

	System.out.println("Please Enter a number to check odd or even: ");
	int a =sc.nextInt();

	if(a % 2 == 0){
	System.out.println(a + " is a even number");
	}
	else{
	System.out.println(a + " is a odd number");
	}
	}
}