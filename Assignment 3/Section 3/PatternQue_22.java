import java.util.Scanner;

class DiamondPattern {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an ODD number of rows: ");
        int n = sc.nextInt(); // Take user input for number of rows

        if (n % 2 == 0) { // Ensure n is odd
            System.out.println("Please enter an odd number for a proper diamond pattern.");
            return; // Exit the program if input is even
        }

        // Upper half of the pattern (Inverted Triangle)
        for (int i = n; i >= 1; i -= 2) { // Decreasing odd numbers
            for (int j = 0; j < (n - i) / 2; j++) { // Spaces for centering
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // Print stars
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }

        // Lower half of the pattern (Upright Triangle)
        for (int i = 3; i <= n; i += 2) { // Increasing odd numbers (starting from 3)
            for (int j = 0; j < (n - i) / 2; j++) { // Spaces for centering
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) { // Print stars
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }

        sc.close(); // Close scanner
    }
}
