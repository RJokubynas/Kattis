import java.util.Scanner;

public class RoamingRomans
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);

		double miles = in.nextDouble(); //modern miles

		System.out.print((int)Math.round((miles*(1000*(5280.0/4854.0))))); //conversion modern miles to roman paces
	}
}