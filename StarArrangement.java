import java.util.Scanner;

public class StarArrangement
{
	public static void main(String [ ] args)
	{
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int l = 0;
		int z = 0;
		boolean check = false;

		System.out.println(s + ":");

		for(int i=1; i < s; i++)
		{
			z = i+1;
			while(l<s)
			{
				l += z;

				if(l == s && i <= s/2)
				{
					System.out.println(z + "," + i);
					
				}

				l += i;

				if(l == s)
				{
					System.out.println(z + "," + i);
				}

			}

			l = 0;

			while(l<s)
			{
				l += z;
				if(l == s && i <= s/2)
				{
					System.out.println(z + "," + z);
				}
			}

			l = 0;

		} 
	}
}