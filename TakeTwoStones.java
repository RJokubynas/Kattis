//Robertas Jokubynas
//Date: 6th April 2018
//Time: 19:42

import java.util.Scanner;

public class TakeTwoStones
{

    public static void main(String [] args)
    {
    	Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for(int i = n; i > 0; i-=2)
		{
			if(i==2)
			{
				System.out.println("Bob");
			}
			else if(i==1)
			{
				System.out.println("Alice");
			}
		}

    }

}