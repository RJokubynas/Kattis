import java.util.Scanner;

public class Cetvrta
{

    public static void main(String [] args)
    {
    	Scanner in = new Scanner(System.in);

    	int ar[][] = new int[3][2];
    	int x = 0;
    	int y = 0;

    	for(int i=0; i<3; i++)
    	{
    		for(int j=0; j<2; j++)
    		{
    			ar[i][j] = in.nextInt();
    		}
    	}
    		if(ar[0][0] == ar[1][0])
    		{
    			x = ar[2][0];
    		}
    		else if(ar[0][0] == ar[2][0])
    		{
    			x = ar[1][0];
    		}
    		else if(ar[1][0] == ar[2][0])
    		{
    			x = ar[0][0];
    		}

    		if(ar[0][1] == ar[1][1])
    		{
    			y = ar[2][1];
    		}
    		else if(ar[0][1] == ar[2][1])
    		{
    			y = ar[1][1];
    		}
    		else if(ar[1][1] == ar[2][1])
    		{
    			y = ar[0][1];
    		}

    		System.out.println(x + " " + y);

   	}
}