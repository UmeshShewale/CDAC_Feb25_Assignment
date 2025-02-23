import java.util.Scanner;

class PrePostIncrementDecrement {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First number: ");
        int a = sc.nextInt(); // Example: a = 10

        System.out.print("Enter the Second number: ");
        int b = sc.nextInt(); // Example: b = 30

        int sum = --a + b++ + a-- + ++b; // Output: 9+30+9+32 = 80
        System.out.println("Sum 1: " + sum);

        int sum1 = --a + b++ + a++ + b++; // 7+32+7+33 = 79
        System.out.println("Sum 2: " + sum1);

        System.out.println("Final values of a and b: " + a + " " + b); // 8 34

        sc.close(); // ✅ Close scanner
    }
}
