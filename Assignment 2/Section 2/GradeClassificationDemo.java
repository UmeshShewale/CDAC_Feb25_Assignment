import java.util.Scanner;

class GradeClassificationDemo{

	public static void main(String Args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter your Score for grade calculation: ");
	int score = sc.nextInt();

	if ( score<=100 && score >=90){
		System.out.println("You have Scored Grade A");
	}
	else if ( score<=89 && score >=80){
		System.out.println("You have Scored Grade B");
	}
	else if ( score<=79 && score >=70){
		System.out.println("You have Scored Grade C");
	}
	else if ( score<=69 && score >=60){
		System.out.println("You have Scored Grade D");
	}
	else {
		System.out.println("You have Scored Grade F");
	}

}


}