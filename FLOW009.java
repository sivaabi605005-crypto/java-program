import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                double quantity = sc.nextDouble();
                double price = sc.nextDouble();
                
                double total = quantity * price;
                if (quantity > 1000) {
                    total = total * 0.9;
                }
                
                
                System.out.printf("%.6f\n", total);
            }
        }
        sc.close();

	}
}
