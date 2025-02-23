import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Price : ");
        double a = sc.nextDouble();

        System.out.print("Do you have Membership(Yes/No): ");
        String b = sc.next();

	double finalprice;

	if (a >1000 && b.equalsIgnoreCase("yes")){
		finalprice = (a* 0.75);
		System.out.print("Final Price with Discount : " + finalprice);
	} else if(a >=1000 && b.equalsIgnoreCase("no")){
		finalprice = (a* 0.80);
		System.out.print("Final Price with Discount : " + finalprice);
	}else if(a >=500 && b.equalsIgnoreCase("yes")){
		finalprice = (a* 0.85);
		System.out.print("Final Price with Discount : " + finalprice);
	}else if(a >=500 && b.equalsIgnoreCase("no")){
		finalprice = (a* 0.90);
		System.out.print("Final Price with Discount : " + finalprice);
	}else if(a < 500 && b.equalsIgnoreCase("yes")){
		finalprice = (a* 0.90);
		System.out.print("Final Price with Discount : " + finalprice);
	}else if(a < 500 && b.equalsIgnoreCase("no")){
		finalprice = (a* 0.95);
		System.out.print("Final Price with Discount : " + finalprice);
	}

}
}