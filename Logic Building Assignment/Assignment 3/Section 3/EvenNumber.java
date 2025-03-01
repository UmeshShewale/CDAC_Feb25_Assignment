import java.util.Scanner;

class EvenNumber{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number Starting Number: ");
	int num= sc.nextInt();

	System.out.println("Enter number End Number: ");
	int num1= sc.nextInt();


	System.out.println("Even Number are : ");

	for (int i = num; i <= num1; i ++){
		if(i % 2 == 0){
		System.out.print(i + " " );
		}
	}
	
	/*System.out.println();
	System.out.println("odd Number are : ");	 
	for (int i = num; i <= num1; i ++){
		if(i % 2 != 0){
		System.out.print(i + " " );
		}
	}*/
	sc.close();

	
}
}