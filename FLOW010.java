import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        while (t-- > 0) {
            char String = sc.next().charAt(0);
            char lowerString = Character.toLowerCase(String);
            switch (lowerString) {
                case 'b':
                    System.out.println("BattleShip");
                    break;
                case 'c':
                    System.out.println("Cruiser");
                    break;
                case 'd':
                    System.out.println("Destroyer");
                    break;
                case 'f':
                    System.out.println("Frigate");
                    break;
            }
        }
        sc.close();
	}
}
