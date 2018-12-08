import java.util.Scanner;

public class PokerHand
{
	public static void main(String []args)
	{
		Scanner in = new Scanner(System.in);

		String[] cards = in.nextLine().split(" ");
		in.close();

		int nuCount = 0;
		int olCount = 0;

		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				if(cards[i].charAt(0) == cards[j].charAt(0))
				{
					olCount++;
				}
			}
			if(olCount >= nuCount)
			{
				nuCount = olCount;
			}
			olCount = 0;
		}
		System.out.print(nuCount);
	}
}