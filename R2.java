//Robertas Jokubynas
//Date: 6th April 2018
//Time: 20:14

import java.util.Scanner;

public class R2
{

    public static void main(String [] args)
    {

    	Scanner in = new Scanner(System.in);
    	int r1 = in.nextInt();
    	int s = in.nextInt();

    	if(r1 > s || r1 < s)
    	{
    		System.out.println((2*s)-r1);
    	}

    	else
    	{
    		System.out.println(s);
    	}


    }

}