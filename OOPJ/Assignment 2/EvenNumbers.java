// Q. 24 Write a program that prints  all even numbers from 1 to 100  using only  bitwise AND (  &  )  and  for  loop.

public class EvenNumbers {
    public static void main(String[] args) {
        
		System.out.print("Even Number  from 1 to 100 is :  ");
        for (int i = 1; i <= 100; i++) {
            
            if ((i & 1) == 0) {
				System.out.print(i + " ");
            }
        }
    }
}