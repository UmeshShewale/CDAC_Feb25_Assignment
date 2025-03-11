//  Find Intersection and Union of Two Arrays 
//○  Find the intersection and union of two unsorted arrays.


import java.util.Scanner;

class UnionIntersection {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input sizes of the arrays
        System.out.println("Enter size of first array: ");
        int m = sc.nextInt();
        System.out.println("Enter size of second array: ");
        int n = sc.nextInt();

        int a[] = new int[m];
        int b[] = new int[n];

        // Input elements of the first array
        System.out.println("Enter the values of the first array (only unique values):");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            a[i] = sc.nextInt();
        }

        // Input elements of the second array
        System.out.println("Enter the values of the second array (only unique values):");
        for (int i = 0; i < b.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            b[i] = sc.nextInt();
        }

        sc.close();

        // Compute Union
        int count = 0;
        int d[] = new int[a.length + b.length];

        // Add all elements of the first array to d
        for (int i = 0; i < a.length; i++) {
            d[count++] = a[i];
        }

        // Add elements of the second array to d if they don't already exist
        for (int i = 0; i < b.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                d[count++] = b[i];
            }
        }

        // Create the final union array with the correct size
        int union[] = new int[count];
        for (int i = 0; i < count; i++) {
            union[i] = d[i];
        }

        // Print Union
        System.out.println("Union of two arrays is: ");
        for (int i = 0; i < union.length; i++) {
            System.out.print(union[i] + " ");
        }
        System.out.println();

        // Compute Intersection
        int count1 = 0;
        int e[] = new int[Math.min(a.length, b.length)];

        // Find common elements
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    e[count1++] = a[i];
                    break;
                }
            }
        }

        // Create the final intersection array with the correct size
        int intersection[] = new int[count1];
        for (int k = 0; k < count1; k++) {
            intersection[k] = e[k];
        }

        // Print Intersection
        System.out.println("Intersection of two arrays is: ");
        for (int i = 0; i < intersection.length; i++) {
            System.out.print(intersection[i] + " ");
        }
        System.out.println();
    }
}
		