import java.util.Scanner;

class LengthInteger{
	public static void main(String args[]){
	
	Scanner sc= new Scanner(System.in);		

	System.out.println("Enter the number : ");
	int a= sc.nextInt();
 	
	

	if (a==0){
		System.out.println(1);
	}

	int count = 0;
 
	while(a!=0){
		a/=10;
		count++;
	}
	
	System.out.println("Number of digits are : " + count);
}
} 
