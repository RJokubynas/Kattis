import java.util.Scanner;

public class Aaah
{
	public static void main(String [ ] args)
	{
		Scanner in = new Scanner(System.in);
		String m = in.nextLine();
		String d = in.nextLine();
		
		if(m.length() >= d.length())
		{
		    System.out.println("go");
		}
		else
		{
		    System.out.println("no");
		}


	}
}