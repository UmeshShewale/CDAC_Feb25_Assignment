import java.util.Scanner;

class MultiplicationTable{
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in); 
	System.out.println("Enter Number for Multiplication table: ");
	int a= sc.nextInt();
	
	for(int i=0; i<=10; i++){
	int c= a*i;
	System.out.println(a + " * " + i +" = " + c);
	}
	sc.close();
	}
}
