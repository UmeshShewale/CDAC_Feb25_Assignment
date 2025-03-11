//  Write a program to accept the marks in Physics, Chemistry and Maths secured by 20 class students in a single Dimensional Array. Find and display the following: 
//○  Number of students securing 75% and above in aggregate. 
//○  Number of students securing 40% and below in aggregate. 

import java.util.Scanner;

class AllSubjectMarksAggregate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		
        int[] a = new int[20]; 
        int[] b = new int[20]; 
        int[] c = new int[20]; 

        System.out.println("Enter marks of 20 students in Physics: ");
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        System.out.println("Enter marks of 20 students in Chemistry: ");
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            b[i] = sc.nextInt();
        }

        System.out.println("Enter marks of 20 students in Maths: ");
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            c[i] = sc.nextInt();  // FIX: Changed from 'b[i] = sc.nextInt();' to 'c[i] = sc.nextInt();'
        }

        sc.close();

        Physic a1 = new Physic();
        Chemistry b1 = new Chemistry();
        Maths c1 = new Maths();
        OverAllAggregate d1 = new OverAllAggregate();

        a1.PhysicsAggregate(a);
        b1.chemistryAggregate(b);
        c1.mathsAggregate(c);
        d1.overallAggregate(a, b, c);
    }
}

class Physic {
    void PhysicsAggregate(int[] a) {
        System.out.println("\nResults of 20 students in Physics:");
        for (int i = 0; i < 20; i++) {
            if (a[i] >= 75) {
                System.out.println("Student " + (i + 1) + " scored aggregate in Physics.");
            }
            if (a[i] <= 40) {
                System.out.println("Student " + (i + 1) + " has failed in Physics.");
            }
        }
    }
}

class Chemistry {
    void chemistryAggregate(int[] b) {
        System.out.println("\nResults of 20 students in Chemistry:");
        for (int i = 0; i < 20; i++) {
            if (b[i] >= 75) {
                System.out.println("Student " + (i + 1) + " scored aggregate in Chemistry.");
            }
            if (b[i] <= 40) {
                System.out.println("Student " + (i + 1) + " has failed in Chemistry.");
            }
        }
    }
}

class Maths {
    void mathsAggregate(int[] c) {
        System.out.println("\nResults of 20 students in Maths:");
        for (int i = 0; i < 20; i++) {
            if (c[i] >= 75) {
                System.out.println("Student " + (i + 1) + " scored aggregate in Maths.");
            }
            if (c[i] <= 40) {
                System.out.println("Student " + (i + 1) + " has failed in Maths.");
            }
        }
    }
}

class OverAllAggregate {
    int count = 0;
    int count1 = 0;

    void overallAggregate(int[] a, int[] b, int[] c) {
        System.out.println("\nOverall Results of 20 students:");
        for (int i = 0; i < 20; i++) {
            int d = (a[i] + b[i] + c[i]) / 3;
            if (d >= 75) {
                System.out.println("Student " + (i + 1) + " scored aggregate in all subjects.");
                count++;
            }
            if (d <= 40) {
                System.out.println("Student " + (i + 1) + " has failed overall.");
                count1++;
            }
        }

        System.out.println("\nNumber of students securing 75% and above in aggregate: " + count);
        System.out.println("Number of students securing 40% and below in aggregate: " + count1);
    }
}
