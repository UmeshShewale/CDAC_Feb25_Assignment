/*Q2. Student Marks and Average 
Create a class Student with the following members: 
Name of the student 
Marks in three subjects 
A method to assign initial values 
A method to compute the total and average marks 
A method to display the student’s name and total marks 
Write a main() method to demonstrate the functionality of the class. */

import java.util.*;

class Student {
    private String name;
    private int sub0;
    private int sub1;
    private int sub2;

    Student(String name, int sub0, int sub1, int sub2) {
        this.name = name;
        this.sub0 = sub0;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    void totalAverage() {
        float total = sub0 + sub1 + sub2;
        float avg = total / 3.0f;
        display(total, avg);
    }
    void display(float total, float avg) {
        System.out.println("Student name: " + name);
        System.out.println("Total marks in three subjects: " + total);
        System.out.println("Average marks in three subjects: " + avg);
    }
}

class TotalAverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] names = new String[n];
        int[][] marks = new int[n][3]; 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.println("Enter marks for " + names[i] + " in 3 subjects:");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }
            sc.nextLine();
        }

        for (int i = 0; i < n; i++) {
            Student s = new Student(names[i], marks[i][0], marks[i][1], marks[i][2]);
            s.totalAverage(); 
        }

        sc.close(); 
    }
}
