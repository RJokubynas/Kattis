//Robertas Jokubynas
//Date: 9th April 2018
//Time: 19:44

import java.util.Scanner;
import java.lang.*;

public class Sibice
{
    public static void main(String [] args)
    {
    	Scanner in = new Scanner(System.in);

    	int n = in.nextInt();
    	int w = in.nextInt();
    	int h = in.nextInt();
    	int hyp = (int)Math.sqrt((w*w)+(h*h));
    	int x[] = new int[n];

    	for(int i=0; i<n; i++)
    	{
    		x[i] = in.nextInt();
    	}

    	for(int i=0; i<n; i++)
    	{
    		if(x[i] <= hyp)
    		{
    			System.out.println("DA");
    		}
    		else
    		{
    			System.out.println("NE");
    		}
    	}
    }
}