import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
        
        // Read the total number of test cases
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                int reversedNumber = 0;
                
                // Mathematical logic to reverse the number
                while (n > 0) {
                    int lastDigit = n % 10;
                    reversedNumber = (reversedNumber * 10) + lastDigit;
                    n = n / 10;
                }
                
                System.out.println(reversedNumber);
            }
        }
        sc.close();
	}
}
