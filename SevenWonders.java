import java.util.Scanner;

public class SevenWonders
{
	public static void main(String [ ] args)
	{
		Scanner in = new Scanner(System.in);
		String card = in.nextLine();

		int t = 0;
		int c = 0;
		int g = 0;
		int dif = 1;
		int res = 0;

		for(int i=0; i<card.length(); i++)
		{
			if(card.charAt(i) == 'T')
			{
				t++;
			}
			else if(card.charAt(i) == 'C')
			{
				c++;
			}
			else if(card.charAt(i) == 'G')
			{
				g++;
			}

			if(t >= dif && c >= dif && g >= dif)
			{
				res += 7;
				dif++;
			}
		}
        
		res += (t*t) + (c*c) + (g*g);
		System.out.println(res);
	}
}