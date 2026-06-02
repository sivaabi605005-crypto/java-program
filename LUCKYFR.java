import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int T = Integer.parseInt(br.readLine());
                StringBuilder out = new StringBuilder();
        
        while (T-- > 0) {
            String s = br.readLine();
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '4') {
                    count++;
                }
            }
            out.append(count).append("\n");
        }
        System.out.print(out);
	}
}
