// Q7:  Implement a Java program that checks whether a given year is a  leap year or not  using logical (  &&  ,  ||  ) operators 

import java.util.*;

class LeapYear{
	public static void main(String args[]){
	
		Scanner sc= new Scanner(System.in);
	
		System.out.println("Enter a first Number");
		int year = sc.nextInt();
		
		if (year % 4 == 0) {  
            if (year % 100 == 0) {  
                if (year % 400 == 0) {  
                    System.out.println(year + " is a Leap Year.");
                } else {
                    System.out.println(year + " is NOT a Leap Year.");
                }
            } else {
                System.out.println(year + " is a Leap Year.");
            }
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }

        sc.close();
	}
}
		