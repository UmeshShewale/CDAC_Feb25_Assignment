import java.util.Scanner;

class PatternQue_21 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

	for ( int i = 1; i <=n; i++){
		int num =1;
		for (int j = 1; j <=i; j++){
			
			System.out.print(num);
			
		 	if(j<i){
			System.out.print("*");
			}
			num = num + 2;
		}
		
	System.out.println();
}

}
}
