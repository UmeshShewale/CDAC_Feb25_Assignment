import java.util.Scanner;

class DayoftheWeek{

	public static void main(String Args[]){

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter Day Number: ");
	int day = sc.nextInt();

	switch(day){

	case 1:
		System.out.println("Today is Monday");
		break;
	case 2:
		System.out.println("Today is Tuesday");
		break;
	case 3:
		System.out.println("Today is Wednesday");
		break;
	case 4:
		System.out.println("Today is Thursday");
		break;
	case 5:
		System.out.println("Today is Friday");
		break;
	case 6:
		System.out.println("Today is Saturday");
		break;
	case 7:
		System.out.println("Today is Sunday");
		break;

	}

	if(day <=5){
		System.out.println("Today is a weekday");
	}
	else{
	System.out.println("Today is Weekend");
	}
}
}


