class Swap{
	public static void main(String args[]){
	int a= 23;
	int b=12;
	System.out.println("Before First Number is " +a);
	System.out.println("Before Second Number is " +b);
	a= a-b;
	b=a+b;
	a=b-a;
	System.out.println("First Number is " +a);
	System.out.println("Second Number is " +b);
	}
}
	