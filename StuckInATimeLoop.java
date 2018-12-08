//Robertas Jokubynas
//Date: 6th April 2018
//Time: 19:58

import java.util.Scanner;

public class StuckInATimeLoop
{

    public static void main(String [] args)
    {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();

    	for(int i=1; i<=n; i++)
    	{
    		System.out.println(i + " Abracadabra");
    	}

    }

}