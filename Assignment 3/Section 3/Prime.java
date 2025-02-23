class Prime {
    public static void main(String args[]) {
        int num = 20; 
        int count = 0;

        System.out.println("First 5 Prime Numbers:");

        while (count < 5) { 
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++; 
            }
            num++; 
        }
    }

    
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(n); i++) { 
            if (n % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
