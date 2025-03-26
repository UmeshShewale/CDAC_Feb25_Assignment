/*Q6. Electricity Bill Calculation – Java Program 
Design a Java program to calculate the electricity bill for a customer based on the number of units 
consumed. Implement a class named ElectricityBill with the following specifications: 
Class: ElectricityBill 
Instance Variables 
customerName (String): Name of the customer 
unitsConsumed (double): Number of electricity units consumed 
billAmount (double): The calculated bill amount 
Constructor 
A parameterized constructor to initialize the customerName and unitsConsumed fields. 
Method 
void calculateBillAmount(): This method calculates the electricity bill amount based on the 
following tariff rules: 
First 100 units: Rs. 5 per unit 
Next 200 units (i.e., 101 to 300): Rs. 7 per unit 
Remaining units (above 300): Rs. 10 per unit 
Main Program 
In the main() method: 
1.  Create an object of the ElectricityBill class. 
2.  Set the customerName and unitsConsumed values (can be taken from user input or 
hardcoded). 
3.  Call the calculateBillAmount() method to compute the bill. 
4.  Display the customer's name, units consumed, and final bill amount.*/

import java.util.*;

abstract class ElectricityDetail{
	String name;
	double units;
	double billAmount;
	public ElectricityDetail(String name, double units){
		this.name = name;
		this.units = units;
	}
	
	abstract double electricitybill();
	abstract void display();
	
}

class ElectricityBill extends ElectricityDetail{
	ElectricityBill(String name, double units){
		super(name, units);
	}
	@Override
	public double electricitybill(){
		if (units <= 100){
			billAmount = units*5;
		} else if (units <= 300){
			billAmount = (100*5) + (units -100)*7;
		}else {
			billAmount = (100*5) + (200)*7 + (units -300)*10;
		}
		return billAmount;
	}
	@Override
	void display(){
		System.out.println("Customer's name: "+ name + ", Units consumed: "+ units + ",  Final bill amount: " + electricitybill());
	}
	
}
class ElectricityBillCalculation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name :");
		String name = sc.nextLine();
		System.out.println("Enter Units Consumed :");
		double units = sc.nextDouble();
		
		ElectricityDetail c1 = new ElectricityBill(name, units);
		c1.display();
		
	}
}

