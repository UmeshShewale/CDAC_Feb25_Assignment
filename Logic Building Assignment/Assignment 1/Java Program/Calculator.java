class Calculator{
	public static void main(String args[]){
	int first_number=125;
	int second_number=24;
	int a= first_number + second_number;
	int b= first_number - second_number;
	int c= first_number * second_number;
	int d= first_number / second_number;
	int e= first_number % second_number;
	System.out.println("Addition of two number is "+ a);
	System.out.println("Subtration of two number is "+ b);
	System.out.println("Multiplication of two number is "+ c);
	System.out.println("Division of two number is "+ d);
	System.out.println("Modulus of two number is "+ e);
	System.out.println(first_number + " + " + second_number + " = " + a);
        System.out.println(first_number + " - " + second_number + " = " + b);
        System.out.println(first_number + " x " + second_number + " = " + c);
        System.out.println(first_number + " / " + second_number + " = " + d);
        System.out.println(first_number + " mod " + second_number + " = " + e);

	//simplest way.
	System.out.println(first_number + " + " + second_number + " = " + (first_number + second_number));
        System.out.println(first_number + " - " + second_number + " = " + (first_number - second_number));
        System.out.println(first_number + " x " + second_number + " = " + (first_number * second_number));
        System.out.println(first_number + " / " + second_number + " = " + (first_number / second_number));
        System.out.println(first_number + " mod " + second_number + " = " + (first_number % second_number));

	}
}