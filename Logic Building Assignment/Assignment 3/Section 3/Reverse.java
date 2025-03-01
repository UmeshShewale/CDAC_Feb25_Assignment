import java.util.Scanner;


class ReverseNumber{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter a number to reverse: ");
	int num = sc.nextInt();

	/*int reversed =0;
	while(num!=0){
	int num1= num%10;
	reversed = reversed *10 + num1;
	num = num/10;
	}

	//System.out.println(reversed);*/

	String s= Integer.toString(num);

	String reversed = new StringBuilder(s).reverse().toString();

	System.out.println(reversed);
}


}
