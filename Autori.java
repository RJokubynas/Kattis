import java.util.Scanner;

public class Autori
{
    public static void main(String [] args)
    {
		Scanner in = new Scanner(System.in);

		String x = in.nextLine();

		String fl = "" + x.charAt(0);

		for(int i=0; i<x.length(); i++)
		{
			if(x.charAt(i) == '-')
			{
				fl += "" + x.charAt(i+1);
			}
		}
		System.out.println(fl);
    }
}