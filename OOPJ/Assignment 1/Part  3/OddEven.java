import java.util.*;


class OddEven{
	public static void main(String args[]){
		 if (args.length == 0) {
            System.out.println("Please provide a number as a command-line argument.");
            return;
	}
	int num = Integer.parseInt(args[0]);
	if (num % 2 == 0) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
    }
}

	