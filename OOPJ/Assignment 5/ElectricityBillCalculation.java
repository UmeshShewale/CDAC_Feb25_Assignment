/*Q1. Electricity Bill Calculation with Exception Handling 
Design a Java program to calculate the electricity bill for a customer, including exception 
handling for invalid input values. Implement a class named ElectricityBill with the following 
specifications: 
Class: ElectricityBill 
Instance Variables 
customerName (String): Name of the customer 
unitsConsumed (double): Number of electricity units consumed 
billAmount (double): The calculated bill amount 
Constructor 
A parameterized constructor to initialize the customerName and unitsConsumed 
fields. 
Throw an IllegalArgumentException if unitsConsumed is negative. 
Method 
void calculateBillAmount(): This method calculates the electricity bill based on the 
following rules: 
First 100 units: Rs. 5 per unit 
Next 200 units (101–300): Rs. 7 per unit 
Above 300 units: Rs. 10 per unit 
Main Program 
In the main() method: 
1.  Prompt the user to enter the customer’s name and units consumed. 
2.  Use try-catch blocks to handle the following scenarios: 
Catch InputMismatchException if the user enters non-numeric data for units. 
Catch IllegalArgumentException if a negative value is entered for units. 
3.  If the input is valid, create an object of the ElectricityBill class, compute the bill using 
calculateBillAmount(), and print the customer’s name, units consumed, and the total 
bill amount.*/

import java.util.*;

interface ElectricityDetail {
    double electricitybill();
    void display();    
}

class ElectricityBill implements ElectricityDetail {
    String name;
    double units;
    double billAmount;

    public ElectricityBill(String name, double units) {
        this.name = name;
        this.units = units;
    }

    @Override
    public double electricitybill() {
        if (units <= 100) {
            billAmount = units * 5;
        } else if (units <= 300) {
            billAmount = (100 * 5) + (units - 100) * 7;
        } else {
            billAmount = (100 * 5) + (200 * 7) + (units - 300) * 10;
        }
        return billAmount;
    }

    @Override
    public void display() {
        System.out.println("Customer's name: " + name + ", Units consumed: " + units + ", Final bill amount: " + electricitybill());
    }
}

class ElectricityBillCalculation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        try {
            
            System.out.println("Enter Customer Name:");
            String name = sc.nextLine();
            System.out.println("Enter Units Consumed:");
            double units = sc.nextDouble();
            
            if (units < 0) {
                throw new IllegalArgumentException("Units cannot be negative");
            }

            ElectricityDetail c1 = new ElectricityBill(name, units);
            c1.display(); 

        } catch (InputMismatchException e) {
            System.out.println("Entered non-numeric data for units. Please enter valid numeric data.");
        }  catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace(); 
        } finally {
            sc.close(); 
        }
    }
}


