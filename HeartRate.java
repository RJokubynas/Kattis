import java.util.*;
import java.text.*;

public class HeartRate {
	static Scanner in = new Scanner(System.in);
	
	public static void main(String [] args)
	{
		int len = in.nextInt();
		
		for(int i=0; i<len; i++)
		{
			double b = in.nextInt();
			double p = in.nextDouble();
			ht(b,p);
		}
			
		in.close();
	}
	
	public static void ht(double b, double p)
	{
		DecimalFormat d = new DecimalFormat("#00.0000");
		
		System.out.print(d.format((60*(b-1))/p) + " ");
		System.out.print(d.format((60*b)/p) + " ");
		System.out.print(d.format((60*(b+1))/p) + "\n");
	}
}