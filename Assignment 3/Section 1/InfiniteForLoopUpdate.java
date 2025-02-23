public class InfiniteForLoopUpdate { 
    public static void main(String[] args) { 
        for (int i = 0; i < 5; i += 2) { 
            System.out.println(i); 
        } 
    } 
} 

/* Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update 
expression be corrected? 

No Error. The loop condition is i < 5, meaning it stops once i becomes 6.
Since i increments by 2 (i += 2), it goes: 0 → 2 → 4 → 6.
At i = 6, i < 5 becomes false, so the loop exits. */