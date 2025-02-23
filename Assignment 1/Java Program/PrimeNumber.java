import java.util.Scanner;

class PrimeNumber{

	public static void main(String args[]){
		
	Scanner sc= new Scanner(System.in);

	System.out.println("Enter the number: ");
	int num= sc.nextInt();
	
	 if (num < 2) {
         	System.out.println(num + " is NOT a prime number.");
          	return; 
	}

	int a = (int) Math.sqrt(num);

	boolean isPrime= true;

	for (int i = 2; i <= a; i++){
		if (num/i==0){
		isPrime=false;
		break;
		}
	}

	if(isPrime){
		System.out.println(num + " is a Prime Number");
	}
	else{
		System.out.println(num + " is a  not Prime Number");
	}	   


	
}
}
