import java.util.Scanner;

class Fibonacci{
	public static void main(String args[]){

	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter number of Fibonacci: ");
	int n= sc.nextInt();
	
	if (n < 2) {
            System.out.println("Fibonacci sequence needs at least 2 numbers.");
            return;
        }
	
	int a[] = new int[n];

	System.out.println("Enter first number: ");
	a[0] = sc.nextInt();

	System.out.println("Enter second number: ");
	a[1] = sc.nextInt();

	for (int i =2; i<n ; i++){
	a[i] = a[i - 1] + a[i - 2];
	}
	System.out.println("\nFibonacci Sequence:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
	sc.close();


}

}