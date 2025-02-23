import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.print(" 1.Addition \n 2.Subtraction \n 3. Multiplication \n 4. Division \n 5. Modulus \n Select operation and enter operation number in list:");
        int s = sc.nextInt();

	if(s >5){
		System.out.print(" please enter valid operation: ");
	}
	s = sc.nextInt();

	switch(s){

	case 1:
		System.out.println("Addition of Numbers: " + (a + b) );
		break;
	case 2:
		System.out.println("Subtraction of Numbers: " + (a - b) );
		break;
	case 3:
		System.out.println("Multiplication of Numbers: " + (a*b) );
		break;
	case 4:
		if(b>0){
		System.out.println("Division of Numbers: " + (a/b) );
		}else{
		System.out.println("Division by zero is Infinite. Enter valid number");
		}
		break;
	case 5:
		System.out.println("Modulus of Number: " + (a%b));
		break;
	}
}
}
	
