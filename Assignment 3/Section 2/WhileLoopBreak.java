public class WhileLoopBreak { 
    public static void main(String[] args) { 
        int count = 0; 
        while (count < 5) { 
            System.out.print(count + " "); 
            count++; 
            if (count == 3) break; 
        } 
        System.out.println(count); 
    } 
} 
/*/*
    Output: 0 1 2 3

    Dry Run:
        step 01: count=0 
        step 02: count=1
        step 03: count=2(break of while loop)
        step 04: count=3(SOP statement to print current count value)
 */