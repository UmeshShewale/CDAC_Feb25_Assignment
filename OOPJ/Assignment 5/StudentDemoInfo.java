/*Exception Handling 
Q2. Student Marks and Grade Calculation with Exception Handling 
Design a Java program to calculate the total marks, average, and grade of a student, with 
proper exception handling for invalid inputs. Implement a class named Student with the 
following specifications: 
Class: Student 
Instance Variables 
name (String): Name of the student 
rollNo (int): Roll number of the student 
marks (double array of size 5): Marks obtained in 5 subjects 
average (double): Average marks 
grade (char): Grade based on average 
Constructor 
A parameterized constructor to initialize the name, rollNo, and marks. 
Throw an IllegalArgumentException if any mark is negative or greater than 100. 
Methods 
void calculateAverage(): Computes the average of marks. 
void calculateGrade(): Assigns grade based on the average as per the following 
criteria: 
A: average ≥ 90 
B: 80 ≤ average < 90 
C: 70 ≤ average < 80 
D: 60 ≤ average < 70 
F: average < 60 
void displayStudentInfo(): Displays the student’s name, roll number, marks, average, 
and grade. 
Main Program 
In the main() method: 
1.  Prompt the user to input student details and marks for 5 subjects. 
2.  Use a try-catch block to handle the following: 
○  InputMismatchException for non-numeric input 
○  IllegalArgumentException for invalid mark entries (e.g., < 0 or > 100) 
3.  Create a Student object, calculate average and grade, and display the full information.*/
import java.util.*;

class Student {
	String name;
	int rollNo;
	double s1;
	double s2;
	double s3;
	double s4;
	double s5;
	
	Student(String name,int rollNo, double s1, double s2, double s3, double s4, double s5){
		this.name =name;
		this.rollNo= rollNo;
		this.s1 =s1;
		this.s2 =s2;
		this.s3 =s3;
		this.s4 =s4;
		this.s5 =s5;
	}
	
	double calculateAverage(){
		double avg = (s1 +s2+s3+s4+s5)/5;
		return avg;
	}
	String calculateGrade(double avg){
		String grade;
		if (avg >= 90){
			grade = "A";
		} else if (avg >= 80){
			grade = "B";
		}else if (avg >= 70 ){
			grade = "C";
		}else if (avg >= 60 ){
			grade = "D";
		}else{
			grade = "F";
		}
		return grade;
	} 
	
	void displayStudentInfo(){
		double avg =calculateAverage();
		String grade = calculateGrade(avg);
		System.out.println("Student Name: " + name +", Roll Number: " + rollNo + ", Marks: " + s1+ " "+ s2+ " " + s3+ " "+ s4+ " "+ s5+", Average: " + avg+ ", Grade:" +grade);
	}
	
}

class StudentDemoInfo{
public static void main(String args[]){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Student Name: ");
	String name = sc.nextLine();
	System.out.println("Enter Roll Number: ");
	int rollNo = sc.nextInt();
	
	double a[] = new double[5];
	try{
	for(int i = 0; i < a.length; i++){
		System.out.println("Enter Marks of "+ (i+1)+" subject");
		a[i] = sc.nextDouble();
		if (a[i] < 0|| a[i] >100) {
			throw new IllegalArgumentException("marks cannot be negative or more than 100");
		}
	}
	
	Student st = new Student(name, rollNo, a[0],a[1], a[2], a[3], a[4]);
	st.displayStudentInfo();
	
	}
	catch (IllegalArgumentException e)
	{
		System.out.println(e.getMessage());
	}
	catch (InputMismatchException e) 
	{
            System.out.println("Entered non-numeric data for units. Please enter valid numeric data.");
    }
	catch (Exception e)
	{
		e.printStackTrace();
	}
	finally 
	{
		sc.close();
	}
}
}