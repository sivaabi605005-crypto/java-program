import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{ Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt(); 
            
            // Iterate through each test case
            while (t-- > 0) {
                int a = scanner.nextInt(); 
                int b = scanner.nextInt(); 
                
                // Calculate and print the remainder
                System.out.println(a % b); 
            }
        }
        scanner.close();
	}
}
