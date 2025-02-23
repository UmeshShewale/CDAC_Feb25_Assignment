import java.util.Scanner;


class Average{
	public static void main(String args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("How many number average need to calculate: ");
	int total= sc.nextInt();

	int a[]= new int[total];
	for (int i=0; i<total; i++){
		System.out.println(" Enter number: ");
		a[i]= sc.nextInt();
		
		}
	System.out.println("Number are:");
        for (int i = 0; i < total; i++) {
            System.out.print(a[i] + " ");
        }
	int sum= 0; 
	for (int i = 0; i < total; i++) {
        	sum +=a[i];
		//System.out.println(sum);
        }
	double aver = (double) sum/total;
	System.out.println(\n"Average of number is :" + aver);
	sc.close();

	}
}

/*import java.util.Scanner;

class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total numbers: ");
        int total = sc.nextInt();

        double sum = 0;
        for (int i = 1; i <= total; i++) {
            System.out.print("Enter number " + i + ": ");
            sum += sc.nextDouble();  // Directly sum input
        }

        System.out.println("Average: " + (sum / total));
        sc.close();
    }
}*/
